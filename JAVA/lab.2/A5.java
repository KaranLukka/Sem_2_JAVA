import java.util.Scanner;
public class A5{
	public static void main(String[] args){
		Scanner x=new Scanner(System.in);
		System.out.print("Enter value of Fahrenheit:");
		int f=x.nextInt();
		int c=f-32*5/9;
		System.out.print("Value of Celcius:");
		System.out.println(c);
	}
}