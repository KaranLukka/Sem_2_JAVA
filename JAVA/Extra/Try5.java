class Print{
	final void printData(){
		System.out.println("Hi");
	}
	final void printData(int x){
		System.out.println("Hello");
	}
}
public class Try5{
	public static void main(String[] args) {
		Print p1=new Print();
		Print p2=new Print();
		p1.printData();
		p2.printData(1);
	}
}