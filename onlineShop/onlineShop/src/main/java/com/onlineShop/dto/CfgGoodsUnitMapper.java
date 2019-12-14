package com.onlineShop.dto;

import com.onlineShop.bean.CfgGoodsUnit;
import com.onlineShop.bean.CfgGoodsUnitExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CfgGoodsUnitMapper {
    long countByExample(CfgGoodsUnitExample example);

    int deleteByExample(CfgGoodsUnitExample example);

    int deleteByPrimaryKey(Short recId);

    int insert(CfgGoodsUnit record);

    int insertSelective(CfgGoodsUnit record);

    List<CfgGoodsUnit> selectByExample(CfgGoodsUnitExample example);

    CfgGoodsUnit selectByPrimaryKey(Short recId);

    int updateByExampleSelective(@Param("record") CfgGoodsUnit record, @Param("example") CfgGoodsUnitExample example);

    int updateByExample(@Param("record") CfgGoodsUnit record, @Param("example") CfgGoodsUnitExample example);

    int updateByPrimaryKeySelective(CfgGoodsUnit record);

    int updateByPrimaryKey(CfgGoodsUnit record);
}