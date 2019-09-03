package wp.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ShowAndDeleteFile {

	public static void main(String[] args) throws Exception {
		File file= new File("c:/jdata/game2.txt");
		FileReader fr = new FileReader(file);
		if(!file.isFile())
		{
			System.out.println("No Such File Exists");
		}
		BufferedReader br = new BufferedReader(fr);
		int ch=br.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch=br.read();
		}
		br.close();
		fr.close();
		file.deleteOnExit();
		System.exit(0);
	}

}
