package ClassFile1;
import java.util.Scanner;
class Circle{
	int r;
	int area;
	void Area(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of radius:");
		r=sc.nextInt();
		area=22/7*r*r;
	}
}
public class A1{
	public static void main(String[] args){
		Circle aOC=new Circle();
		aOC.Area();
		System.out.print("Area Of Circle:"+aOC.area);
	}
}