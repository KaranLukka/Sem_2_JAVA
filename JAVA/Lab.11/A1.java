import java.io.*;
public class A1{
	public static void main(String[] args){
		try{
			String Filename="Text.txt";
			BufferedWriter bw=new BufferedWriter(new FileWriter("Text.txt"));
			bw.write("Karan Lukka\n");
			bw.write("B2-B-3\n");
			bw.write("23010101153");
			bw.close();
			BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
			String line;
			while((line=br.readLine())!=null){
					
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Data Entered Successfully!!");
		}
	}
}