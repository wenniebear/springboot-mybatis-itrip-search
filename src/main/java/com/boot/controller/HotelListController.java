package com.boot.controller;

import com.boot.po.Dto;
import com.boot.service.SearchHotelServiceImp;
import com.boot.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/hotellist")
public class HotelListController {
    @Autowired
    private SearchHotelServiceImp searchHotelServiceImp;

    public SearchHotelServiceImp getSearchHotelServiceImp() {
        return searchHotelServiceImp;
    }

    public void setSearchHotelServiceImp(SearchHotelServiceImp searchHotelServiceImp) {
        this.searchHotelServiceImp = searchHotelServiceImp;
    }

    @RequestMapping(value = "/searchItripHotelPage")
    @ResponseBody
    public Dto searchItripHotelPage(@RequestBody SearchHotelVO vo) {
        System.out.println("controller");
        //分页结果集合
        Page page=null;
        //传入对象不能为空，或者其中目的地不能为空
        if (EmptyUtils.isEmpty(vo)||EmptyUtils.isEmpty(vo.getDestination())){
            return DtoUtil.returnFail("目的地不能为空！","20001");
        }
        try {
            page=searchHotelServiceImp.SearchItripHotelPage(vo,vo.getPageNo(),vo.getPageSize());
        } catch (Exception e) {
            e.printStackTrace();
            return DtoUtil.returnFail("系统异常，获取失败","20003");
        }
        //Page获取行数为0  等价于未查询到结果
        if (page.getRows().size()==0){
            System.out.println("城市为空！");
            return DtoUtil.returnFail("城市为空","20001");
        }
        return DtoUtil.returnDataSuccess(page);
    }

    @RequestMapping(value = "/searchItripHotelListByHotCity", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public Dto<Page<ItripHotelVO>> searchItripHotelListByHotCity(@RequestBody SearchHotCityVO vo) throws Exception {
        System.out.println("根据热门城市搜索");
        if (EmptyUtils.isEmpty(vo) || EmptyUtils.isEmpty(vo.getCityId())) {
            return DtoUtil.returnFail("城市id不能为空", "20004");
        }
        Map<String, Object> param = new HashMap<>();
        param.put("cityId", vo.getCityId());
        List list = searchHotelServiceImp.SearchItripHotelListByCity(vo.getCityId(), vo.getCount());
        if (list.size()==0){
            return DtoUtil.returnFail("城市内不存此种配置的酒店", "20004");
        }
        return DtoUtil.returnDataSuccess(list);
    }
}


