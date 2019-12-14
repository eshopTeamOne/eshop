package com.onlineShop.dto;

import java.util.Date;

public class GoodsGoods {
    private Integer goodsId;

    private String goodsNo;

    private String goodsName;

    private String shortName;

    private Integer specCount;

    private Integer classId;

    private Integer brandId;

    private Short baseUnitId;

    private Short auxUnitId;

    private String origin;

    private String remark;

    private Date modified;

    private Date created;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public Integer getSpecCount() {
        return specCount;
    }

    public void setSpecCount(Integer specCount) {
        this.specCount = specCount;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Short getBaseUnitId() {
        return baseUnitId;
    }

    public void setBaseUnitId(Short baseUnitId) {
        this.baseUnitId = baseUnitId;
    }

    public Short getAuxUnitId() {
        return auxUnitId;
    }

    public void setAuxUnitId(Short auxUnitId) {
        this.auxUnitId = auxUnitId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}