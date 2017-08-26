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
	
	//�������
	private Random rd = new Random();
	//��дһ���ַ������������ȡ�ַ�
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
			ses.setAttribute("err", "��֤���������");
		//	System.out.println("dddddddddddddddddddddddddddddddddddd");
			return "redirect:/login.jsp";
		}else if(user==null){
			//System.out.println("ttttttttttttttttttttttttttttttttttt");
			ses.setAttribute("err", "�û������������");
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
		//������Ӧ�����ͣ����صĽ����һ��ͼƬ
				response.setContentType("image/jpeg");
				
				//����ͼ�λ�����(���ߣ���ɫ����)
				BufferedImage image = new BufferedImage(100,40,BufferedImage.TYPE_INT_RGB);
				
				//����ͼ�λ��������������ʣ����ڻ�ͼ
				 Graphics g =image.getGraphics();
				 
				 
				 
				 
				 /**********************��������***********************************************/
				 //ָ�����ʵ���ɫ 
				 g.setColor(getColor(200,256));
				 
				 //������֤��ı�����----------����һ�����ο�䵱����(x,y,width,height)
				 g.fillRect(0,0, 100,80);
				 
			
				 /*************************�����ĸ�����ַ�����ʾ��ͼƬ��*******************************************/
				 String code="";
				 for(int i=0;i<4;i++){
					 int index = rd.nextInt(str.length());//�õ�һ���±ֵ꣬�����ַ������ȵķ�Χ��
					 char chr = str.charAt(index);//ͨ���±꣬ȡ���ַ�
					 g.setColor(getColor(0,120));//ָ�����ֵı���
					 
					 Font f = new Font("����",Font.ITALIC|Font.BOLD,15+rd.nextInt(10));//ָ���������
					 g.setFont(f);//���û��ʵ����� 
					 
					 g.drawString(String.valueOf(chr),10+i*20+rd.nextInt(10),15+rd.nextInt(15));
					 code+=chr;//���棬���ɵ���֤��
				 }
				// System.out.println(code);
				 request.getSession().setAttribute("code",code);//����֤�룬�����session
				 /***************************����������******************************************/
				 for(int i=0;i<100;i++){
					 int x1 = rd.nextInt(100);
					 int y1 = rd.nextInt(80);
					 
					 int x2 = rd.nextInt(5);
					 int y2 = rd.nextInt(5);
					 
					 g.setColor(getColor(100,200));//������������ɫ 
					 g.drawLine(x1, y1, x1+x2, y1+y2);//�����������
				 }
				 
				 
				 
				 
				 
				 
				 
				 //��������������ڽ����Ƶ�ͼ��������ͻ��������
				 OutputStream out = response.getOutputStream();
				 
				 //��� ͼ��(ͼ�λ�������ͼƬ�ĸ�ʽ������һ����������������)
				 ImageIO.write(image, "jpg", out);
				 
				 out.flush();
				 
				 //�ر���
				 
				 out.close();
	}
	/**
	 * ������ɫ�ķ���
	 * @return
	 * ��ɫ��ȡֵ��Χ��: 0-255
	 * ֵԽС����ɫԽ��
	 * start:��ʼ��Χ
	 * end:������Χ 
	 */                 
	private Color getColor(int start,int end){
		
		int r = start+rd.nextInt(end-start);
		int g = start+rd.nextInt(end-start);
		int b = start+rd.nextInt(end-start);
		
		return new Color(r,g,b);
	}

}
