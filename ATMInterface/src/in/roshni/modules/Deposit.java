package in.roshni.modules;
import in.roshni.atm.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Deposit {

	Scanner sc=new Scanner(System.in);
	
	@SuppressWarnings({ "deprecation" })
	public void deposit() throws IOException {	
		
		System.out.println("Enter the deposit amount::");
		Float deposit=sc.nextFloat();	
		String strdeposit=deposit.toString();
		
		Atm.balance=Atm.balance+deposit;
		String balance=Atm.balance.toString();
		
		Date date=new Date();
		String strDate=date.getDate()+"-"+date.getMonth()+"-"+date.getYear()+" ";
		FileWriter fw=new FileWriter("tran.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		//date
		bw.write(strDate+"\t");
		//particular		
		bw.write("Account got credited \t");
		//		
		bw.write("\t");
		//credited
		bw.write(strdeposit);
		bw.write("\t\t");
		//balance
		bw.write(balance);
		bw.write("\n");
		System.out.println("Money deposited Successfully");
		System.out.println("----------------------------");
		bw.close();
	}
}
