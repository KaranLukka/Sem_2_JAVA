class Mye extends Exception{
	Mye(String s){
		super(s);
	}
}
public class A1{
	public static void main(String[] args) {
		try{
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			if(x<0 || y<0){
				throw new Mye("number can't be negative");
			}
			int c=x*y;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println("you are wrong");	
		}
	}
}