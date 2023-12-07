package in.roshni.atm;

import java.io.IOException;
import in.roshni.modules.Login;

public class Atm {

	public static Double balance=0.0;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String bal=balance.toString();
		//To login
		Login log=new Login();
		log.login();
		
	}
}
