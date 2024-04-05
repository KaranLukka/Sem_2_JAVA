package classFile5;
import java.util.Scanner;
class Complex{
	static int real_No;
	static int imaginary_No;
	Complex(){
		this.real_No=12;
		this.imaginary_No=13;
	}
	Complex(int x,int y){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of real No:");
		real_No=sc.nextInt();
		System.out.print("Enter value of imaginary No:");
		imaginary_No=sc.nextInt();
	}
	void Addition(int real_No,int imaginary_No){
		int real_sum=this.real_No+real_No;
		int imaginary_sum=this.imaginary_No+imaginary_No;
	}
}
public class A5{
	public static void main(String[] args){
		Complex c1=new Complex();
		Complex c2=new Complex();
		System.out.print(c1.real_sum);
		System.out.print(c2.imaginary_sum);
	}
}