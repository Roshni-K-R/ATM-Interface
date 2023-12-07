package in.roshni.modules;

import java.io.IOException;
import java.util.Scanner;
import in.roshni.atm.Atm;

public class Menu {

	static Scanner sc=new Scanner(System.in);
		
	public static void displayMenu() throws IOException {
	
	
	char choice;
	
	do {
		System.out.println("1.Transaction History");
		System.out.println("2.Balance");
		System.out.println("3.Deposit");
		System.out.println("4.Withdraw");
		System.out.println("5.Quit");
		System.out.println("Enter your choice");
		char ch=sc.next().charAt(0);
		
	
		switch(ch) {
		
		case '1':
				System.out.println("=========================================");
				System.out.println("	Transaction History");
				System.out.println("=========================================");
				System.out.println("Date\t\t Particulars \t\t Debit\tCredit \t\t Balance");
				System.out.println("=========================================");
				new Transaction().transaction();
				break;
				
		case '2':
			System.out.println("=============================");
			System.out.println("Available Balance::"+Atm.balance);
			System.out.println("=============================");
			break;
		
		case '3':
			System.out.println("=============================");
			System.out.println("Deposit Operation");
			System.out.println("=============================");
			new Deposit().deposit();
			break;
		case '4':
			System.out.println("=============================");
			System.out.println("Withdraw Operation");
			System.out.println("=============================");
			new Withdraw().withdraw();
			break;
		case '5':
			System.out.println("=============================");
			System.out.println("Exit");
			System.out.println("=============================");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
		System.out.println("Do you wish to Continue..(Y/N)");
		System.out.println("-------------------------------");
		choice=sc.next().charAt(0);
		
	  }	while(choice=='y'||choice=='Y');
	
		System.out.println("Thanks For using the service");
		System.out.println("Have a nice day..");
	
	}
}
