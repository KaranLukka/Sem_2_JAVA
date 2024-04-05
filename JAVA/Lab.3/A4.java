import java.util.Scanner;
public class A4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		int i=1,count=0;
		for(i=1;i<=a;i++){
			if(a%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.print("Number is Prime");
		}
		else{
			System.out.print("Number is Not Prime");
		}
	}
}