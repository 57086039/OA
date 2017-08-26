package org.java.test;

import java.util.Map;

import org.java.entity.oa.Userinfo;
import org.java.service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		LoginService service=(LoginService) ctx.getBean("loginService");
		Userinfo info=new Userinfo();
		//info.setUsername("≈·‹ø¡÷");
		//info.setPassword("123456789");
		//Map<String, Object> map=service.login(info);
		System.out.println(service.findAll("8"));
	}

}
