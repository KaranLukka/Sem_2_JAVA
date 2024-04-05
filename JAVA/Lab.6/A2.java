import java.util.Scanner;
class Book{
	private String author_name;
	Book(){
		this.author_name=author_name;
	}
	public void toDisplay(){
		System.out.print("Author name:"+author_name);
	}
}
class Book_publication extends Book{
	String book_name;
	Book_publication(String author_name){
		super(author_name);
		this.book_name;
	}
	public void toDisplay(String book_name){
		Scanner sc=new Scanner(System.in);
		System.out.print("Name of Book:"+book_name);
		book_name=sc.nextLine();
	}
}
class Paper_publication extends Book{
	private String title;
	Paper_publication(){
		this.title=title;
	}
	public void toDisplay(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter title:");
		title=sc.nextLine();
	}
}
public class A2{
	public static void main(String[] args) {
		Book bp;
		
		if(str.equals("Book")){
			bp=new Book_publication();
			bp.toDisplay();
		}
		else{
			bp=new Paper_publication();
			bp.toDisplay(book_name);
		}
	}
}