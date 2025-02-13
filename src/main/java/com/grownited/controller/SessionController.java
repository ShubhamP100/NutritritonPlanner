package com.grownited.controller;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.*;
@Controller



public class SessionController { 
    @GetMapping ("signup")// for the routing   -> url 
	public String signup() {
		  return "Signup";  // returns the jsp file
	}
    @GetMapping("login")
    public String login() {
    	return "Login";
    }
    @PostMapping("saveuser")      
    	public String saveuser(UserEntity  user  ) {
    	         System.out.println(user.getFirstname());
    	         System.out.println(user.getEmail());
    	         System.out.println(user.getGender());
                return "SaveUser";		
    	} 
    @GetMapping("forgetpassword")
    public String forgetpassword() {
    	return "ForgetPassword";
    } 
    @PostMapping("sendOtp")
    public String changepassword() {
    	return "ChangePassword";
    }
    @PostMapping("updatepassword")
    public String updatePassword() {
    	return "Login";
    }
    
        
}
