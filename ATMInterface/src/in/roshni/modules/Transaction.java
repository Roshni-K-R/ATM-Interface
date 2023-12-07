package in.roshni.modules;

import java.io.*;

public class Transaction{

	public static void transaction() throws IOException {
		
		File file=new File("tran.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		
		String line;
		while((line=br.readLine())!=null) {
		System.out.println(line);
		}
		br.close();
		
	}
}

