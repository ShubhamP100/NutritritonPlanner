package com.grownited.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//import com.grownited.entity.MemberEntity;
import com.grownited.entity.MembersEntity;
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
	@PostMapping("saveusers")
	public String saveUser(MembersEntity entityRegister) {
//		System.out.println("age : "+entityRegister.getAge());
		useregister.save(entityRegister);
		 // insert
		

		return "redirect:/newuser";// jsp name
	}
	//Model is used to pass the data from controller to jsp
	//Below the list   
	@GetMapping("listusers") 
	public String registerUser(Model model) {
		List<MembersEntity>  listUser = useregister.findAll(); // select * writes the sql query to display the data 
		//findall method is used to display the data of the user from the database
		model.addAttribute("listUser",  listUser);
		System.out.println("hello world");
		return "ListUser";
	}
	
	@GetMapping("viewmember")
	public String viewMember(Integer userdetailid,Model model) {
		//?
		
		Optional<MembersEntity> op= useregister.findById(userdetailid);
		
		if(op.isEmpty())
		{
			return "Error";
		}else {
			
	     MembersEntity member = op.get();
		//send data to jsp
		model.addAttribute("member",member);
		return "ViewMember";
		
		}
		  
			// data found
			
	}
	@GetMapping("deletemember")
	// Here member id is pass as argument to delete the particular id
	public String deleteMember(Integer memberId) {
	    useregister.deleteById(memberId); // delete the members from where memberID =:memberID
	// 
		return "redirect:/listmember";
	}
	
	
	
	
	
	 


   
}
