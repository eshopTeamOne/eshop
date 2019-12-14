package com.onlineShop.dto;

import com.onlineShop.bean.SysShop;
import com.onlineShop.bean.SysShopExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysShopMapper {
    long countByExample(SysShopExample example);

    int deleteByExample(SysShopExample example);

    int deleteByPrimaryKey(Short shopId);

    int insert(SysShop record);

    int insertSelective(SysShop record);

    List<SysShop> selectByExample(SysShopExample example);

    SysShop selectByPrimaryKey(Short shopId);

    int updateByExampleSelective(@Param("record") SysShop record, @Param("example") SysShopExample example);

    int updateByExample(@Param("record") SysShop record, @Param("example") SysShopExample example);

    int updateByPrimaryKeySelective(SysShop record);

    int updateByPrimaryKey(SysShop record);
}