class A extends Thread{
	public void run(){
		for(int i=0;i<20;i+=2){
			System.out.println(i);
			try{
				sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread{
	public void run(){
		for(int i=1;i<20;i+=2){
			System.out.println(i);
			try{
				sleep(1000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
public class A2{
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a.start();
		b.start();
	}
}