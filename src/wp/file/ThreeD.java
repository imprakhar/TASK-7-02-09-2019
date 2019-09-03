package wp.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class ThreeD implements Serializable {
	private int xPos;
	private int yPos;
	private int zPos;
	public void moveH(int pts){
		xPos=xPos+pts;
	}
	public void moveV(int pts){
		yPos=yPos+pts;
	}
	public void moveD(int pts) {
		zPos=zPos+pts;
	}
	public void showPos(){
		System.out.println("CURRENT POS : "+xPos+","+yPos+","+zPos);
	}
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mode 1 For New Game, 2 For Resuming Previous One : ");
		int ch=sc.nextInt();
		System.out.println("Horizontal Move : ");
		int x=sc.nextInt();
		System.out.println("Vertical Move : ");
		int y=sc.nextInt();
		System.out.println("Diagonal Move : ");
		int z=sc.nextInt();
		ThreeD d=null;
		
		if(ch==1){
			d=new ThreeD();
		}else{
			//read the object from file
			
			FileInputStream fis=new FileInputStream("c:/jdata/game.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			d=(ThreeD) ois.readObject();
			
		}
		
		d.moveH(x); d.moveV(y); d.moveD(z);
		d.showPos();
		
		System.out.println("Saving Game Instance ..................");
		
		FileOutputStream fos=new FileOutputStream("c:/jdata/game.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.close(); fos.close();
		System.out.println("Closing Game .............");
	}
}
