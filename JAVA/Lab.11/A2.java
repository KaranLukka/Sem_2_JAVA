import java.io.*;
public class A2{
	public static void main(String [] args){
		String f=args[0];
		File f1=new File(f);
		if(f1.isFile()){
			System.out.println("Length of file:"+f1.length());
		}
		if(!f1.exists()){
			System.out.println("File or DIR not exist");
		}
		else{
			File[] files=f1.listFiles();
			if(files!=null){
				for(File f2:files){
					System.out.println(f2.getName());
				}
			}
		}
	}
}