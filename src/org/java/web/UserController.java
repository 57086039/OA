package org.java.web;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.java.entity.oa.Userinfo;
import org.java.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userController")
public class UserController {
	
	@Autowired
	private LoginService loginservice;
	
	
	@Autowired
	HttpServletRequest req;
	
	//随机数类
	private Random rd = new Random();
	//编写一个字符串，用于随机取字符
	String str="0123456789abcdefghijklmnorqrstuvwxyzABCDEFGHIJKLMNORQRSTUVWXYZ";
	
	@RequestMapping("/user/login")
	public String login(Userinfo info,String code,HttpSession ses){
		ses.removeAttribute("err");
		System.out.println(info.getPassword());
		System.out.println(info.getUsername());
		System.out.println(code);
		String codes=(String) ses.getAttribute("code");
		System.out.println(code+codes);
		
		Map<String, Object> user=loginservice.login(info);
		System.out.println(user);
		if(!code.equals(codes)){
			ses.setAttribute("err", "验证码输入错误");
		//	System.out.println("dddddddddddddddddddddddddddddddddddd");
			return "redirect:/login.jsp";
		}else if(user==null){
			//System.out.println("ttttttttttttttttttttttttttttttttttt");
			ses.setAttribute("err", "用户名或密码错误");
			return "redirect:/login.jsp";
		}else{
			//System.out.println("ssssssssssssssssssssssssssssssssss");
			ses.setAttribute("user", user);
			return "/index";
		}
		
	}
	
	
	@RequestMapping("/user/yzm")
	public void Yanzm(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		request.getSession().removeAttribute("err");
		//设置响应的类型，返回的结果是一张图片
				response.setContentType("image/jpeg");
				
				//创建图形缓冲区(宽，高，颜色类型)
				BufferedImage image = new BufferedImage(100,40,BufferedImage.TYPE_INT_RGB);
				
				//利用图形缓冲区，产生画笔，用于绘图
				 Graphics g =image.getGraphics();
				 
				 
				 
				 
				 /**********************画背景框***********************************************/
				 //指定画笔的颜色 
				 g.setColor(getColor(200,256));
				 
				 //绘制验证码的背景框----------绘制一个矩形框充当背景(x,y,width,height)
				 g.fillRect(0,0, 100,80);
				 
			
				 /*************************产生四个随机字符，显示在图片上*******************************************/
				 String code="";
				 for(int i=0;i<4;i++){
					 int index = rd.nextInt(str.length());//得到一个下标，值在在字符串长度的范围类
					 char chr = str.charAt(index);//通过下标，取得字符
					 g.setColor(getColor(0,120));//指定文字的背景
					 
					 Font f = new Font("隶书",Font.ITALIC|Font.BOLD,15+rd.nextInt(10));//指定随机字体
					 g.setFont(f);//设置画笔的字体 
					 
					 g.drawString(String.valueOf(chr),10+i*20+rd.nextInt(10),15+rd.nextInt(15));
					 code+=chr;//保存，生成的验证码
				 }
				// System.out.println(code);
				 request.getSession().setAttribute("code",code);//把验证码，存放在session
				 /***************************产生干扰线******************************************/
				 for(int i=0;i<100;i++){
					 int x1 = rd.nextInt(100);
					 int y1 = rd.nextInt(80);
					 
					 int x2 = rd.nextInt(5);
					 int y2 = rd.nextInt(5);
					 
					 g.setColor(getColor(100,200));//设置线条的颜色 
					 g.drawLine(x1, y1, x1+x2, y1+y2);//产生随机线条
				 }
				 
				 
				 
				 
				 
				 
				 
				 //产生输出流，用于将绘制的图形输出到客户端浏览器
				 OutputStream out = response.getOutputStream();
				 
				 //输出 图形(图形缓冲区，图片的格式，用哪一个输出流来进行输出)
				 ImageIO.write(image, "jpg", out);
				 
				 out.flush();
				 
				 //关闭流
				 
				 out.close();
	}
	/**
	 * 生成颜色的方法
	 * @return
	 * 颜色的取值范围是: 0-255
	 * 值越小，颜色越深
	 * start:开始范围
	 * end:结束范围 
	 */                 
	private Color getColor(int start,int end){
		
		int r = start+rd.nextInt(end-start);
		int g = start+rd.nextInt(end-start);
		int b = start+rd.nextInt(end-start);
		
		return new Color(r,g,b);
	}

}
