class A implements Runnable{
	public void run(){
		while(true){	
			System.out.println("Good Afternoon");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class B implements Runnable{
	public void run(){
		while(true){
			System.out.println("Good Morning");
			try{
				Thread.sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
public class A1{
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		Thread t1=new Thread(a);
		t1.start();
		Thread t2=new Thread(b);
		t2.start();
	}
}