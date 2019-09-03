package wp.file;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;

public class EmployeeDetails implements Serializable {

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Number");
		int eno=sc.nextInt();
		System.out.println("Enter name");
		String ename=sc.next();
		System.out.println("Enter Salary");
		double sal=sc.nextDouble();
		System.out.println("Enter Designation");
		String desg=sc.next();
		System.out.println("Enter Department");
		String dept= sc.next();
		Employee employee = new Employee(eno, ename, sal, desg, dept);
		FileInputStream fis=new FileInputStream("c:/jdata/employee.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		employee=(Employee) ois.readObject();
	}

}
