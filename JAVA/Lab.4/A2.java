import java.util.Scanner;
public class A2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		String str=sc.nextLine();
		int i=0,vowel=0,consonant=0,space=0;
		for(i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				vowel++;
			}
			else if(ch==' '){
				space++;
			}
			else{
				consonant++;
			}
		}
		System.out.print("Total Spaces:");
		System.out.println(space);
		System.out.print("Total vowels:");
		System.out.println(vowel);
		System.out.print("Total Consonants:");
		System.out.print(consonant);
	}
}