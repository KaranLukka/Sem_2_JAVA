class A{
	int x=5;
	void toDisplay(){
		System.out.print("This is x:"+x);
	}
}
class B extends A{
	void toDisplay(){
		super.toDisplay();
	}
}
public class A7{
	public static void main(String[] args){
		B b=new B();
	}
}