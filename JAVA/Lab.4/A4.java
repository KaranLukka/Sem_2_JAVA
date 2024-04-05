import java.util.Scanner;
public class A4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total elements you want to add in array:")		;
		int n=sc.nextInt(),i=0;
		int[] arr=new int[n];
		for(i=0;i<n;i++) {
			System.out.print("Enter element at ");
			System.out.println(i);
			arr[i]=sc.nextInt();
		}
		for(i=n-1;i>=0;i--){
			System.out.println(arr[i]);

		}
	}
}