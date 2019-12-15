package com.onlineShop.dao;

import com.onlineShop.bean.GoodsClass;
import com.onlineShop.bean.GoodsClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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