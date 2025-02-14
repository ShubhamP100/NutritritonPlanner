package com.grownited.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.grownited.entity.*;
import com.grownited.repository.UserRepo;

@Controller



public class SessionController { 
	
	@Autowired
	UserRepo repositoryuser;
	
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
    	        /* System.out.println(user.getFirstname());
    	         System.out.println(user.getEmail());
    	         System.out.println(user.getGender());
    	         */
    	         user.setRole("User");//
    	         //user.setCreatedAt(new Date());
    	 		 user.setActive(true);
    	 		 repositoryuser.save(user);//insert query 
    	          
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
