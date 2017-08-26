package org.java.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.java.entity.oa.Userinfo;

public interface LoginService {
	
	public Map<String,Object> login(Userinfo u);
	public Userinfo findAll(String id);

}
