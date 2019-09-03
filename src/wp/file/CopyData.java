package wp.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyData {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw= new FileWriter(args[1], true);
		String str;
		while((str=br.readLine())!= null) 
		{
			fw.write(str);
		}
		br.close();
		fw.close();
		System.out.println("Copied data of "+args[0]+" to "+args[1]);
	}

}
