import java.util.Scanner;
public class A1b{
	public static void main(String[] args){
		Scanner x=new Scanner(System.in);
		System.out.print("Enter First Number:");
		int a=x.nextInt();
		System.out.print("Enter Second Number:");	
		int b=x.nextInt();
		int sum=a+b;
		System.out.print("Sum of given Numbers:");
		System.out.print(sum);
	}
}