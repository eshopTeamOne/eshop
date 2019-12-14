package com.onlineShop.dto;

import java.util.Date;

public class GoodsBrand {
    private Integer brandId;

    private String brandNo;

    private String brandName;

    private Byte isDisabled;

    private Date modified;

    private Date created;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandNo() {
        return brandNo;
    }

    public void setBrandNo(String brandNo) {
        this.brandNo = brandNo == null ? null : brandNo.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Byte getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Byte isDisabled) {
        this.isDisabled = isDisabled;
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