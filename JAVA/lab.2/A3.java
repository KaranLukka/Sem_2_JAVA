import java.util.Scanner;
public class A3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your First Number:");
		int a=sc.nextInt();
		System.out.print("Enter Your Second Number:");
		int b=sc.nextInt();
		System.out.println("1:Add,2:Substract,3:Multiplication,4:Division");
		System.out.print("Enter Your Choice:");
		String number=sc.next();
		char ch=number.charAt(0);
		switch(ch){
		case '1':
			System.out.print(a+b);
			break;
		case '2':
			System.out.print(a-b);
			break;
		case '3':
			System.out.print(a*b);
			break;
		case '4':
			System.out.print(a/b);
			break;
		default :
			System.out.print("Cannot Perform!");
		}
	} 
}