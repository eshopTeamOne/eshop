package com.onlineShop.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSpecMapper {
    long countByExample(GoodsSpecExample example);

    int deleteByExample(GoodsSpecExample example);

    int deleteByPrimaryKey(Integer specId);

    int insert(GoodsSpec record);

    int insertSelective(GoodsSpec record);

    List<GoodsSpec> selectByExample(GoodsSpecExample example);

    GoodsSpec selectByPrimaryKey(Integer specId);

    int updateByExampleSelective(@Param("record") GoodsSpec record, @Param("example") GoodsSpecExample example);

    int updateByExample(@Param("record") GoodsSpec record, @Param("example") GoodsSpecExample example);

    int updateByPrimaryKeySelective(GoodsSpec record);

    int updateByPrimaryKey(GoodsSpec record);
}