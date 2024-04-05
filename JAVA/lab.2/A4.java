import java.util.Scanner;
public class A4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius of circle:");
		int r=sc.nextInt();
		System.out.print("Area of circle:");
		System.out.println((float)22/7*r*r);
	}
}