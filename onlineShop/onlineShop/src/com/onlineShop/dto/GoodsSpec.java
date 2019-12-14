package com.onlineShop.dto;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsSpec {
    private Integer specId;

    private Integer goodsId;

    private String specNo;

    private String specCode;

    private String specName;

    private BigDecimal retailPrice;

    private BigDecimal memberPrice;

    private BigDecimal memberDiscount;

    private Short validityDays;

    private Integer salesDays;

    private Integer receiveDays;

    private BigDecimal weight;

    private BigDecimal length;

    private BigDecimal width;

    private BigDecimal height;

    private Short baseUnitId;

    private Short auxUnitId;

    private String remark;

    private Date modified;

    private Date created;

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getSpecNo() {
        return specNo;
    }

    public void setSpecNo(String specNo) {
        this.specNo = specNo == null ? null : specNo.trim();
    }

    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode == null ? null : specCode.trim();
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public BigDecimal getMemberDiscount() {
        return memberDiscount;
    }

    public void setMemberDiscount(BigDecimal memberDiscount) {
        this.memberDiscount = memberDiscount;
    }

    public Short getValidityDays() {
        return validityDays;
    }

    public void setValidityDays(Short validityDays) {
        this.validityDays = validityDays;
    }

    public Integer getSalesDays() {
        return salesDays;
    }

    public void setSalesDays(Integer salesDays) {
        this.salesDays = salesDays;
    }

    public Integer getReceiveDays() {
        return receiveDays;
    }

    public void setReceiveDays(Integer receiveDays) {
        this.receiveDays = receiveDays;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
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