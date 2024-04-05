import java.util.Scanner;
public class A5{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		String str=sc.nextLine();
		System.out.print(str.substring(str.length()/2));
	}
}