package com.grownited.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity // to create the table
@Table(name="users") // assign the name of table


public class UserEntity {
        
	  @Id 
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	  private Integer userId;
	  private String firstname;
	  private String lastname;
	  private String email;
	  private String password;
	  private String contactno;
	  private String gender;
	  private String city;
	  private String role; // user admin 
	
	   public Integer getUserId() {
		return userId;
	    }
	   public void setUserId(Integer userId) {
		this.userId = userId;
	   }
	    public String getFirstname() {
	    	
		return firstname;
	   }
	   public void setFirstname(String firstname) {
		this.firstname = firstname;
    	}
	   public String getLastname() {
		return lastname;
    	}
	   public void setLastname(String lastname) {
		this.lastname = lastname;
	   }
	   public String getEmail() {
		return email;
    	}
	   public void setEmail(String email) {
		this.email = email;
	   }
	  public String getPassword() {
		return password;
	  }
	  public void setPassword(String password) {
		this.password = password;
	  }
    	public String getContactno() {
		return contactno;
	  }
	  public void setContactno(String contactno) {
		this.contactno = contactno;
	  }
	  public String getGender() {
		return gender;
	  }
	  public void setGender(String gender) {
		this.gender = gender;
	  }
	  public String getCity() {
		return city;
	  }
	  public void setCity(String city) {
		this.city = city;
	  }
	  public String getRole() {
		return role;
	  }
	  public void setRole(String role) {
		this.role = role;
	  }
	  
	  
	  
      
	  
}
