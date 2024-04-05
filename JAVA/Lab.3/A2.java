import java.util.Scanner;
public class A2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,rem=0,sum=0,rev=0,x,t;
		System.out.print("Enter value of n:"); 
		n=sc.nextInt();
		t=n;
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			sum+=rem;
			n/=10;
		}x=rev;
		if(x==t){
			System.out.print("Given number is pallindrome\n");
		}
		else{
			System.out.print("Given number is not pallindrome\n");
		}
	}
}