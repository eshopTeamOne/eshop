package com.onlineShop.dto;

import com.onlineShop.bean.GoodsClass;

import java.util.List;

import com.onlineShop.bean.GoodsClassExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsClassMapper {
    long countByExample(GoodsClassExample example);

    int deleteByExample(GoodsClassExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(GoodsClass record);

    int insertSelective(GoodsClass record);

    List<GoodsClass> selectByExample(GoodsClassExample example);

    GoodsClass selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") GoodsClass record, @Param("example") GoodsClassExample example);

    int updateByExample(@Param("record") GoodsClass record, @Param("example") GoodsClassExample example);

    int updateByPrimaryKeySelective(GoodsClass record);

    int updateByPrimaryKey(GoodsClass record);
}