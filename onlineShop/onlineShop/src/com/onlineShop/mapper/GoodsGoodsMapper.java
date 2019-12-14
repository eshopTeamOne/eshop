package com.onlineShop.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsGoodsMapper {
    long countByExample(GoodsGoodsExample example);

    int deleteByExample(GoodsGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(GoodsGoods record);

    int insertSelective(GoodsGoods record);

    List<GoodsGoods> selectByExample(GoodsGoodsExample example);

    GoodsGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") GoodsGoods record, @Param("example") GoodsGoodsExample example);

    int updateByExample(@Param("record") GoodsGoods record, @Param("example") GoodsGoodsExample example);

    int updateByPrimaryKeySelective(GoodsGoods record);

    int updateByPrimaryKey(GoodsGoods record);
}