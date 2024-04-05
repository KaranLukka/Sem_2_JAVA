import java.util.Scanner;
public class Box{
	int length;
	int breadth;
	int height;
	public Box(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length:");
		length=sc.nextInt();
		System.out.print("Enter Breadth:");
		breadth=sc.nextInt();
		System.out.print("Enter Height:");
		height=sc.nextInt();
	}
	public void printVolume(){
		int vol=length*breadth*height;
		System.out.println("Volume="+vol);
	}
}