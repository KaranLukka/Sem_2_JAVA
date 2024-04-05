package ClassFile4;
import java.util.Scanner;
class  Bank_Account{
	int accountNo,accountBalance;
	String userName,email,accountType;
	void getAccountDetails(int accountNo,int accountBalance,String userName,String email,String accountType){
		this.accountNo=accountNo;
		this.accountBalance=accountBalance;
		this.userName=userName;
		this.email=email;
		this.accountType=accountType;
	}
	void displayAccountDetails(){
		System.out.println("Account No:"+accountNo);
		System.out.println("Balance in Account:"+accountBalance);
		System.out.println("Username:"+userName);
		System.out.println("Email:"+email);
		System.out.println("Type of account:"+accountType);
	}
}
public class A4{
	public static void main(String[] args){
		Bank_Account bk=new Bank_Account();
		Scanner sc=new Scanner(System.in);
		int accountNo,accountBalance;
		String userName,email,accountType;
		accountNo=sc.nextInt();
		accountBalance=sc.nextInt();
		userName=sc.nextLine();
		email=sc.nextLine();
		accountType=sc.nextLine();
		bk.getAccountDetails(accountNo,accountBalance,userName,email,accountType);
		bk.displayAccountDetails();
	}
}