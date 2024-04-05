interface Transport{
	void Deliver();
}
abstract class Animal{
	abstract void type();
}
class Tiger extends Animal{
	void type(){
		System.out.println("wild");
	}
}
class Camel extends Animal implements Transport{
	void type(){
		System.out.println("not wild");
	}
	public void Deliver(){

	}
}
class Deer extends Animal{
	void type(){
		System.out.println("not wild");
	}
}
class Donkey extends Animal implements Transport{
	void type(){
		System.out.println("not wild");
	}
	public void Deliver(){
		
	}
}
public class A3{
	public static void main(String[] args) {
		Animal a[]=new Animal[4];
		a[0]=new Tiger();
		a[1]=new Camel();
		a[2]=new Deer();
		a[3]=new Donkey();
		if(a[1] instanceof Transport){
			a[1].type();
		}
		else if(a[3] instanceof Transport){
			a[3].type();
		}
		else{
			System.out.println("Error");
		}
	}
}