package com.learning.main;
import java.util.Scanner;
import com.learning.model.*;
import com.learning.service.*;

public class Driver {
	private static Scanner sc1 = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter First Name:");
		String firstname = sc1.next();
		System.out.println("Enter Last Name:");
		String lastname = sc1.next();
		
		System.out.println("Please Enter the Department from the following:");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		int choice = sc1.nextInt(); 
		
		Employee emp;
		switch (choice) {
		case 1:
			emp = new Employee(firstname, lastname, "tech");
			break;
		case 2:
			emp = new Employee(firstname, lastname, "adm");
			break;
		case 3:
			emp = new Employee(firstname, lastname, "hr");
			break;
		case 4:
			emp = new Employee(firstname, lastname, "lg");
			break;
		default:
			System.out.println("Wrong choice");
			return;
		}	
	CredentialService cs = new CredentialService();
	String email = cs.generateEmailAddress(emp);
	String password = cs.generatePassword();
	cs.showCredentials(emp, email, password);
		}

}
