package com.boot.service;

import com.boot.util.ItripHotelVO;
import com.boot.util.Page;
import com.boot.util.SearchHotelVO;

import java.util.List;

public interface ISearchHotelService {
    /*
    * 搜索酒店
    * */

    public Page<ItripHotelVO> SearchItripHotelPage(SearchHotelVO vo,Integer pageNo,Integer pagesize) throws Exception;

    /*
    * 根据热门城市查询酒店
    * */
    public List<ItripHotelVO> SearchItripHotelListByCity(Integer cityId,Integer pageSize) throws Exception;
}
