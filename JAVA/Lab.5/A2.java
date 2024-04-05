package ClassFile2;
import java.util.Scanner;
class Time{
	int hour;
	int minute;
	Time(){
		hour=12;
		minute=45;
	}
	Time(int hour,int minute){
		this.hour=hour;
		this.minute=minute;
	}
	void Addition(Time t){
		int h=this.hour+t.hour;
		int m=this.minute+t.minute;
		if(m>59){
			m-=59;
			h++;
		}
		System.out.print(h+":"+m);
	}
}
public class A2{
	public static void main(String[] args) {
		Time t1=new Time();
		Time t2=new Time(2,45);
		t1.Addition(t2);
	}
}