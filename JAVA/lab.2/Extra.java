import java.util.Scanner;
public class Extra{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Number:");
		int x=sc.nextInt();
		if(x/1==x && x/2==1){
			System.out.println("Number is Not prime");
		}
		else{
			System.out.println("Number is prime");
		}
	}
}