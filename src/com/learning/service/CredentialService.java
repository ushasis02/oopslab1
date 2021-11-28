package com.learning.service;
import java.util.Scanner;
import com.learning.model.*;
import java.util.Random;

public class CredentialService {
	Scanner sc2 = new Scanner(System.in);
	public String generateEmailAddress(Employee emp) {
				return emp.getFirstname()+emp.getLastname()+"@"+emp.getDepartment()+".abc.com";	
	}

	public String generatePassword() {
		Random random = new Random();
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String allowedChars = capitalLetters + smallLetters + numbers + specialCharacters;
		char[] password = new char[8];
		for(int i=0; i<8; i++) {
			int idx = random.nextInt(allowedChars.length());
			password[i]=allowedChars.charAt(idx);
			}
		return new String(password);
	}

	public void showCredentials(Employee emp, String email, String password) {
		System.out.println("Dear "+ emp.getFirstname()+" your generated credentials are as follows:");
		System.out.println("Email address ---> "+email);
		System.out.println("Password is ---> "+password);
	}
}



