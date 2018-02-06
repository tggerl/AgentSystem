package com.jbit.service;

import com.jbit.entity.AsUser;

/**
 * Created by Administrator on 2018/1/31.
 */

public interface AsUserService {

    /*系统登录*/
    AsUser selectLogin(String usercode, String userpassword);
}
