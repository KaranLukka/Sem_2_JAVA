class Vehicle{
	int no_of_gears=1;
}
class Cars extends Vehicle{
	int no_of_gears=2;
}
class Suv extends Vehicle{
	int no_of_gears=3;
	public void Print(){
		System.out.print(this.no_of_gears);
	}
}
public class Try4{
	public static void main(String[] args){
		Suv c1=new Suv();
		System.out.print(c1.no_of_gears);
		System.out.print(c1.Print());
	}
}