package com.syd.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Service//暴露服务 
public class UserServiceImpl implements UserService {

	@Override
	public String getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....old...");
		
		return "user接口成功";
	}

}
