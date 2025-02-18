package com.grownited.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
@Entity
@Table(name="Registeruser")

public class RegesterEntity  {
	
	
	    
		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY) // to generate the integer id 
		 
		 private Integer user_detail_id;
		 private Integer userId;//fk
		 private Integer age;
		 private Float height;
		 private Float weight;
		 private String healthGoal;
		 private String medical_conditions;
		 private Date  createdAt;
		 private String activityLevel;
		public Integer getUser_detail_id() {
			return user_detail_id;
		}
		public void setUser_detail_id(Integer user_detail_id) {
			this.user_detail_id = user_detail_id;
		}
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public Float getHeight() {
			return height;
		}
		public void setHeight(Float height) {
			this.height = height;
		}
		public Float getWeight() {
			return weight;
		}
		public void setWeight(Float weight) {
			this.weight = weight;
		}
		public String getHealthGoal() {
			return healthGoal;
		}
		public void setHealthGoal(String healthGoal) {
			this.healthGoal = healthGoal;
		}
		public String getMedical_conditions() {
			return medical_conditions;
		}
		public void setMedical_conditions(String medical_conditions) {
			this.medical_conditions = medical_conditions;
		}
		
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public String getActivityLevel() {
			return activityLevel;
		}
		public void setActivityLevel(String activityLevel) {
			this.activityLevel = activityLevel;
		}
		
	}


