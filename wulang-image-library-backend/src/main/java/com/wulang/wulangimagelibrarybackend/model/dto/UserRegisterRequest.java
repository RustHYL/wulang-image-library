package com.wulang.wulangimagelibrarybackend.model.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求
 */

@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 4875494690365076935L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String password;


    /**
     * 确认密码
     */
    private String checkPassword;
}
