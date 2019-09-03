package wp.file;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DisplayInfo {
	public void showDetails()
	{
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("c:/jdata/employee.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//oos.writeObject(employee);
		oos.close(); fos.close();

	}
	
}
