package com.grownited.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.RegesterEntity;
import com.grownited.repository.RegisterUser;
import org.springframework.ui.Model;

@Controller
public class RegisterUserController {
     //getmapping
	
	@Autowired
	RegisterUser useregister;
	  
	@GetMapping("newuser")
	public String registeruser() {
		return "NewUser";
	}

//	savevehicle 
	@PostMapping("saveuser")
	public String saveUser(RegesterEntity entityRegister) {
		 // insert
		

		return "redirect:/listuser";// jsp name
	}
	//Model is used to pass the data from controller to jsp
	//Below the list 
	@GetMapping("newuser")
	public String registerUser(Model model) {
		List<RegesterEntity>  listUser = useregister.findAll(); // select * writes the sql query to display the data 
		model.addAttribute("listUser",  listUser);
		return "ListUser";
	}
	
	
	 


   
}
