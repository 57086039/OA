package org.java.service.Impl;

import java.util.List;
import java.util.Map;

import org.java.dao.UserinfoMapper;
import org.java.entity.oa.Userinfo;
import org.java.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	
	@Autowired
	public UserinfoMapper userinfo;

	@Override
	public Map<String, Object> login(Userinfo u) {
		System.out.println("jdklssssssssssssssssss");
		Map<String, Object> user=userinfo.findByUname(u);
		return user;
	}

	@Override
	public Userinfo findAll(String id) {
		// TODO Auto-generated method stub
		Userinfo list=userinfo.selectByPrimaryKey(id);
		return list;
	}

}
