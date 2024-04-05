import java.util.Scanner;
class Student{
	String name;
	String rollno;
	public Student(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of Student:");
		this.name=sc.nextLine();
		System.out.println("Enter rollno of Student:");;
		this.rollno=sc.nextLine();
	}
	public void print(){
		System.out.println("Name="+name+", Rollno="+rollno);
	}
}
public class Note{
	public static void main(String[] args){
		Student[] stu=new Student[3];
		for (int i=0;i<stu.length;i++){
			stu[i]=new Student();
		}
		for (int i=0;i<stu.length;i++){
			stu[i].print();
		}
	}
}