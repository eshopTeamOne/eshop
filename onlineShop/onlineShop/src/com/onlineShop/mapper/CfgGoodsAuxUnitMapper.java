package com.onlineShop.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CfgGoodsAuxUnitMapper {
    long countByExample(CfgGoodsAuxUnitExample example);

    int deleteByExample(CfgGoodsAuxUnitExample example);

    int deleteByPrimaryKey(Short recId);

    int insert(CfgGoodsAuxUnit record);

    int insertSelective(CfgGoodsAuxUnit record);

    List<CfgGoodsAuxUnit> selectByExample(CfgGoodsAuxUnitExample example);

    CfgGoodsAuxUnit selectByPrimaryKey(Short recId);

    int updateByExampleSelective(@Param("record") CfgGoodsAuxUnit record, @Param("example") CfgGoodsAuxUnitExample example);

    int updateByExample(@Param("record") CfgGoodsAuxUnit record, @Param("example") CfgGoodsAuxUnitExample example);

    int updateByPrimaryKeySelective(CfgGoodsAuxUnit record);

    int updateByPrimaryKey(CfgGoodsAuxUnit record);
}