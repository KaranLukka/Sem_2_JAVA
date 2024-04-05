class A{
	final int x=5;
	A(){
		System.out.println(x);
	}
}
public class A6{
	public static void main(String[] args){
		A a1=new A();
		//using increment will give error
		System.out.print(a1.x);
	}
}