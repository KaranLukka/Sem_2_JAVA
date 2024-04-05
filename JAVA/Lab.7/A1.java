abstract class Vegetable{
	String color;
	String vegname;
	Vegetable(String color,String vegname){
		this.color=color;
		this.vegname=vegname;
	}
	public String toString(){
		return "Color is:"+color+" Name is:"+vegname;
	}
}
class Potato extends Vegetable{
	Potato(String color,String vegname){
		super(color,vegname);
	}
}
class Brinjal extends Vegetable{
	Brinjal(String color,String vegname){
		super(color,vegname);
	}
}
class Tomato extends Vegetable{
	Tomato(String color,String vegname){
		super(color,vegname);
	}
}
public class A1{
	public static void main(String[] args) {
		Potato p=new Potato("Brown","Potato");
		Brinjal b=new Brinjal("Purple","Brinjal");
		Tomato t=new Tomato("Red","Tomato");
		System.out.println(p);
		System.out.println(b);
		System.out.println(t);
	}
}