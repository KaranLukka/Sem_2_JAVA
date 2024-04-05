import java.util.Scanner;
public class A6{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		if(x.charAt(0)>='A' && x.charAt(0)<='Z'){
			System.out.print("");
		}
		else{
			System.out.print("First letter should be capital.");
		}
	}
}