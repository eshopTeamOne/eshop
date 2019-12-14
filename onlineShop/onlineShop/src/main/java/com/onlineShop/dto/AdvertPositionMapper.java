package com.onlineShop.dto;

import com.onlineShop.bean.AdvertPosition;
import com.onlineShop.bean.AdvertPositionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdvertPositionMapper
{
    long countByExample(AdvertPositionExample example);

    int deleteByExample(AdvertPositionExample example);

    int deleteByPrimaryKey(Short recId);

    int insert(AdvertPosition record);

    int insertSelective(AdvertPosition record);

    List<AdvertPosition> selectByExample(AdvertPositionExample example);

    AdvertPosition selectByPrimaryKey(Short recId);

    int updateByExampleSelective(@Param("record") AdvertPosition record, @Param("example") AdvertPositionExample example);

    int updateByExample(@Param("record") AdvertPosition record, @Param("example") AdvertPositionExample example);

    int updateByPrimaryKeySelective(AdvertPosition record);

    int updateByPrimaryKey(AdvertPosition record);
}