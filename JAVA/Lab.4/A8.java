import java.util.Scanner;
public class A8{
	public static void main(String[] args){
		int i=1,j=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no.:");
		int n=sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int a=n;a>0;a--){
			for(int b=1;b<a;b++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}