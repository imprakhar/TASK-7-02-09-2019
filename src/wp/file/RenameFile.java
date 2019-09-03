package wp.file;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		File file1 = new File(args[0]);
		File file2 = new File(args[1]);
		String str= file1.getName();
		if(!file1.exists())
		{
			System.out.println("There is no such file in directory");
		}
		else if(!file1.isFile())
		{
			System.out.println("It is not a File");
		}
		else
		{
			if(!file2.isFile()) 
			{
				if(file1.length()<=500)
				{
					file1.renameTo(file2);
					System.out.println("Succesfully Renamed file : "+str +" to : "+file2.getName());
				}
				else
				{
					System.out.println("Cannot Rename file os size greater than 500");
				}
			}
			else
			{
				System.out.println("There is already a file with same name please choose another file");
			}
		}
		
	}

}
