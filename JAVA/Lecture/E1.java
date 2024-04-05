import java.util.Scanner;
public class Extra{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int x=sc.nextInt();
		for(int i=1;i<=x*2;i+=2){
			System.out.println(i);
		}
	}
}