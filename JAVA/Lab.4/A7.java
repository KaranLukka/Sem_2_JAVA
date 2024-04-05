import java.util.Scanner;
public class A7{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		for(int i=0;i<x.length();i++){
			for(int j=0;j<=i;j++){
				System.out.print(x.charAt(j));
			}
			System.out.print("\n");
		}
	}
}