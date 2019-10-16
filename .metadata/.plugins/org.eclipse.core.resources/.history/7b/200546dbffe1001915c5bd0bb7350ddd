package com.springvalidator.Model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class User {

	@NotBlank(message="Required Field.")
	private String user;
	@Pattern(regexp = "^[a-zA-Z]\\w{3,14}$", message="Password should contain one upper case and lower case with a spcial char." )
	private String password;
	@Min(value=18, message="must be equal or greater than 18")  
    @Max(value=30, message="must be equal or less than 30")  
	private String age;
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
