package com.jbit.service.impl;

import com.jbit.dao.AsUserMapper;
import com.jbit.entity.AsUser;
import com.jbit.service.AsUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/1/31.
 */
@Service
public class AsUserServiceImpl implements AsUserService {

    @Resource
    private AsUserMapper asUserMapper;

    public AsUser selectLogin(String usercode, String userpassword) {
        return asUserMapper.selectLogin(usercode,userpassword);
    }
}
