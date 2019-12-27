package com.boot.service;

import com.boot.mapper.BaseQuery;
import com.boot.util.EmptyUtils;
import com.boot.util.ItripHotelVO;
import com.boot.util.Page;
import com.boot.util.SearchHotelVO;
import org.apache.solr.client.solrj.SolrQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SearchHotelServiceImp implements ISearchHotelService {
    //利用封装好的solr查询工具类获取solr查询对象
    private BaseQuery<ItripHotelVO> itripHotelVOBaseQuery=new BaseQuery<>("http://localhost:8080/solr/hotel");

    @Override
    public Page<ItripHotelVO> SearchItripHotelPage(SearchHotelVO vo, Integer pageNo, Integer pagesize) throws Exception {
        //query.addFilterQuery  星级   特色     商圈      价格
        //tempQuery.append      目的地 关键字

        //solr的查询起始
        SolrQuery query=new SolrQuery("*:*");
        //用来进行条件拼接
        StringBuffer tempQuery = new StringBuffer();
        int tempint=0;//判断标识符--判断有无目的地
        //传入对象不能为空
        if (EmptyUtils.isNotEmpty(vo)) {
            if (EmptyUtils.isNotEmpty(vo.getDestination())) {//目的地
                tempQuery.append("destination:" + vo.getDestination());
                tempint = 1;//更改标识符为1
            }
            if (EmptyUtils.isNotEmpty(vo.getHotelLevel())) {//酒店星级筛选
                query.addFilterQuery(" hotelLevel:" + vo.getHotelLevel());
            }
            if (EmptyUtils.isNotEmpty(vo.getKeywords())) { //关键字筛选
                if (tempint == 1) {
                    tempQuery.append(" AND keyword :" + vo.getKeywords());
                } else {
                    tempQuery.append(" keyword :" + vo.getKeywords());
                }
            }
            if (EmptyUtils.isNotEmpty(vo.getFeatureIds())) {//特色设施
                StringBuffer buffer = new StringBuffer("(");
                int flag = 0;
                String featureIdArray[] = vo.getFeatureIds().split(",");
                for (String featureId : featureIdArray) {
                    if (flag == 0) {
                        buffer.append(" featureIds:" + "*," + featureId + ",*");
                    } else {
                        buffer.append(" OR featureIds:" + "*," + featureId + ",*");
                    }
                    flag++;
                }
                buffer.append(")");
                query.addFilterQuery(buffer.toString());
            }
            if (EmptyUtils.isNotEmpty(vo.getTradeAreaIds())) {//商圈
                StringBuffer buffer = new StringBuffer("(");
                int flag = 0;
                String tradeAreaIdArray[] = vo.getTradeAreaIds().split(",");
                for (String tradeArea : tradeAreaIdArray) {
                    if (flag == 0) {
                        buffer.append("tradingAreaIds:" + "*," + tradeArea + ",*");
                    } else {
                        buffer.append("OR tradingAreaIds:" + "*," + tradeArea + ",*");
                    }
                    flag++;
                }
                buffer.append(")");
                query.addFilterQuery(buffer.toString());
            }
            if (EmptyUtils.isNotEmpty(vo.getMaxPrice())) {//价格
                query.addFilterQuery("minPrice:" + "[* TO " + vo.getMaxPrice() + "]");
            }
            if (EmptyUtils.isNotEmpty(vo.getMinPrice())) {
                query.addFilterQuery("minPrice:" + "[" + vo.getMinPrice() + " TO *]");
            }
            if (EmptyUtils.isNotEmpty(vo.getAscSort())) {
                query.addSort(vo.getAscSort(), SolrQuery.ORDER.asc);
            }

            if (EmptyUtils.isNotEmpty(vo.getDescSort())) {
                query.addSort(vo.getDescSort(), SolrQuery.ORDER.desc);
            }
        }
        if (EmptyUtils.isNotEmpty(tempQuery.toString())){//
            query.setQuery(tempQuery.toString());
        }
        Page<ItripHotelVO> page=itripHotelVOBaseQuery.queryPage(query,pageNo,pagesize,ItripHotelVO.class);
        return page;
    }

    @Override
    public List<ItripHotelVO> SearchItripHotelListByCity(Integer cityId, Integer pageSize) throws Exception {
        SolrQuery solrQuery=new SolrQuery("*:*");
        if (EmptyUtils.isNotEmpty(cityId)){
            solrQuery.addFilterQuery("cityId:"+cityId);
        }else {
            return  null;
        }
        List<ItripHotelVO> list=itripHotelVOBaseQuery.queryList(solrQuery,pageSize,ItripHotelVO.class);
        return list;

    }
}
