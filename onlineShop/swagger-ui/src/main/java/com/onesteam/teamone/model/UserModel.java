package com.onesteam.teamone.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value="用户登录信息", description="用于判断用户是否存在")
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    @ApiModelProperty(value="用户名")
    private String account;

    /**
     * 密码
     */
    @ApiModelProperty(value="密码")
    private String password;


    public String getAccount() {
        return account;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPassword() {
        return password;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
