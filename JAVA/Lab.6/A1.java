import java.util.Scanner;
class Student{
	int id_No;
	int no_of_subjects_registered;
	int[] subject_code;
	int[] subject_credits;
	String[] grade_obtained;
	double spi=0.0;
	Student(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id number:");
		id_No=sc.nextInt();
		System.out.print("Enter number of subjects registered:");
		no_of_subjects_registered=sc.nextInt();
		subject_code=new int[no_of_subjects_registered];
		subject_credits=new int[no_of_subjects_registered];
		grade_obtained=new String[no_of_subjects_registered];
		for(int j=1;j<=no_of_subjects_registered;j++){
			System.out.print("Enter subject code of "+j+":");
			subject_code[j-1]=sc.nextInt();
			System.out.print("Enter credit obtained in "+j+":");
			subject_credits[j-1]=sc.nextInt();
			System.out.print("Enter grade obtained in "+j+":");
			grade_obtained[j-1]=sc.next();
		}
		
	}
	void Calculate_spi(){
		spi=0.0;
		System.out.println("You got "+spi+" spi");
	}
}
public class A1{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		Student[] a=new Student[n];	
		for(int k=0;k<n;k++){
			a[k]= new Student();
			System.out.println("------------");
		}
		for(int i=0;i<n;i++){
			a[i].Calculate_spi();
		}
	}
}