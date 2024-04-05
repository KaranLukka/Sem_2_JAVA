import java.util.Scanner;
class Square{
	int side;
	int area;
	int Area(int side){
		area=side*side;
		return area;
	}
}
public class Try2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of side:");
		int side=sc.nextInt();
		Square s1=new Square();
		System.out.print(s1.Area(side));		
	}
}