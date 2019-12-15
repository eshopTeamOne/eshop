package com.onlineShop.bean;

import java.util.Date;

public class CfgGoodsUnit {
    private Short recId;

    private String name;

    private Byte isDisabled;

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