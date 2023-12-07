package in.roshni.modules;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import in.roshni.atm.Atm;

public class Withdraw {

	@SuppressWarnings("deprecation")
	void withdraw() throws IOException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to withdraw::");
		Float withdraw=sc.nextFloat();
		String strwithdraw=withdraw.toString();
		
		if(Atm.balance<withdraw) {
			System.out.println("Insuffecient Balance");
		}
		
		else {
			
		Atm.balance=Atm.balance-withdraw;
		String balance=Atm.balance.toString();
		
		Date date=new Date();
		String strDate=date.getDate()+"-"+date.getMonth()+"-"+date.getYear()+" ";
		FileWriter fw=new FileWriter("tran.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);

		
		//Date
		bw.write(strDate+"\t");
		//Particular		
		bw.write("Account got debited \t");
		//Debited
		bw.write(strwithdraw);
		bw.write("\t");
		//Credited
		bw.write("\t\t");
		//Balance
		bw.write(balance+"\n");
		System.out.println("Please Collect the money");
		System.out.println("---------------------------");
		bw.close();
		}
	}
		
}
