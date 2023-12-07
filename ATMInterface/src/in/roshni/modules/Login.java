package in.roshni.modules;

import java.io.IOException;
import java.util.Scanner;

public class Login {
	
	Scanner sc=new Scanner(System.in);
	public void login() throws IOException {
		System.out.println("Please enter your Login Credentials");
		System.out.println("-------------------------------------");
		//userId=Test123 & pin=1111
		System.out.println("Enter UserId");
		String userId=sc.next();
		System.out.println("Enter 4-digit Pin");
		int pin=sc.nextInt();	
		
		if(userId.equals("Test123") && pin==1111) {
			System.out.println("Login Successfull");
			System.out.println("----------------------");
			Menu.displayMenu();
		}
		else{
			System.out.println("Invalid login");
		}
	}
}
