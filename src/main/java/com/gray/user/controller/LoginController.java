package com.gray.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gray.user.entity.User;
import com.gray.user.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/test")
public class LoginController {
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping("/login")
	public String doLogin(User user,Model model){
		if(userService.doUserLogin(user)){
	        model.addAttribute("successMsg", "��½�ɹ���");//���ص�ҳ����д�Ĳ���  
	        model.addAttribute("name", user.getUsername());
	        return "/success";//���ص�ҳ��  
	    }else{  
	        model.addAttribute("failMsg", "�û������ڻ��������");  
	        return "/fail";  
	    }
	}
}
