package com.onlineShop.dto;

import java.math.BigDecimal;
import java.util.Date;

public class CfgGoodsAuxUnit {
    private Short recId;

    private String name;

    private Byte isDisabled;

    private BigDecimal baseRatio;

    private Short baseUnitId;

    private Date modified;

    private Date created;

    public Short getRecId() {
        return recId;
    }

    public void setRecId(Short recId) {
        this.recId = recId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Byte isDisabled) {
        this.isDisabled = isDisabled;
    }

    public BigDecimal getBaseRatio() {
        return baseRatio;
    }

    public void setBaseRatio(BigDecimal baseRatio) {
        this.baseRatio = baseRatio;
    }

    public Short getBaseUnitId() {
        return baseUnitId;
    }

    public void setBaseUnitId(Short baseUnitId) {
        this.baseUnitId = baseUnitId;
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