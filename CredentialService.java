package com.gl.service;
import java.util.Random;

import com.gl.model.Employee;

public class CredentialService implements ICredentials {
	
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters = "!@#$%^&*()_=+/?<>";
	
	String values = capitalLetters+smallLetters+specialCharacters+numbers;
	
	Random random = new Random();
	
	String password="";
	char temp;{
	
	for (int i = 0; i < 8; i++) {
		password += String.valueOf(values.charAt(random.nextInt(values.length())));
		
	}
	return password;
	}

    public String generateEmailAddress(String firstName, String lastName, String department) 
    {
	return firstName+lastName+"@"+department+"abc.com";
    }
    public void showCredentials(Employee employee) {
	  
	  System.out.println("Dear "+employee.getFirstName()+"your credentials are as follows");
	  System.out.println("Email\t\t"+employee.getEmail());
	  System.out.println("Password\t"+employee.getPassword());
	  
  }
}

