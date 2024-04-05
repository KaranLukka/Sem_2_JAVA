import java.util.Scanner;
public class A1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Marks in Scence out of 100:");
		int a=sc.nextInt();
		System.out.print("Enter Marks in SST out of 100:");
		int b=sc.nextInt();
		System.out.print("Enter Marks in Maths out of 100:");
		int c=sc.nextInt();
		System.out.print("Enter Marks in English out of 100:");
		int d=sc.nextInt();
		System.out.print("Enter Marks in Hindi out of 100:");
		int e=sc.nextInt();
		int sum=a+b+c+d+e;
		int p=sum/500*100;
		if(p>=60){
			System.out.print("You got First Division");
		}
		else if(p>=50 && p<=59){
			System.out.print("You got Second Division");
		}
		else if(p>=40 && p<=49){
			System.out.print("You got Third Division");
		}
		else {
			System.out.print("You are fail");
		}
	}
}