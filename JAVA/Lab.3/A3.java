import java.util.Scanner;
public class A3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First number:");
		int x=sc.nextInt();
		System.out.print("Enter Second number:");
		int y=sc.nextInt();
		System.out.print("Enter Third number:");
		int z=sc.nextInt();
		if(x>y && x>z){
			System.out.print("First number is greater");
		}
		else if(y>x && y>z){
			System.out.print("Second number is greater");
		}
		else{
			System.out.print("Third number is greater");
		}
	}
}