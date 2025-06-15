package com.wulang.wulangimagelibrarybackend.service;

import com.wulang.wulangimagelibrarybackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Admin
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-06-16 01:03:48
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 账号
     * @param userPassword 密码
     * @param checkPassword 确认密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 获取加密后的密码
     * @param userPassword
     * @return
     */
    String getEncryptPassword(String userPassword);
}
