package wp.file;

import java.io.PrintStream;
import java.util.Scanner;

public class StoreCities {
	public static void main(String[] args) throws Exception {
		String file = "c:/jdata/abc.txt";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter done to terminate");
		PrintStream ps= new PrintStream(file);
		String line;
		while ((line =scan.nextLine()) != null) 
		{
			if (line.trim().equalsIgnoreCase("done")) 
			{
				System.exit(0);
			}
			ps.println(line);
		}
		scan.close();
		ps.close();
	}
}
