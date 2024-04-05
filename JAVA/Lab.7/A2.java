interface A{
	void X();
}
interface P1 extends A{
	void Y();
}
interface P2 extends A{
	void Z();
}
interface A12 extends P1,P2{
	void W();
}
class B implements A12{
	public void X(){
		int x=1;
		System.out.println(x);
	}
	public void Y(){
		int y=1;
		System.out.println(y);
	}
	public void Z(){
		int z=1;
		System.out.println(z);
	}
	public void W(){
		int w=1;
		System.out.println(w);
	}
}
public class A2{
	public static void main(String[] args) {
		B b1=new B();
		b1.X();
		b1.Y();
		b1.Z();
		b1.W();

	}
}