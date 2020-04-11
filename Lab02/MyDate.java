import java.util.Scanner;
public class MyDate{
	public int date;
	public int mouth;
	public int year;
	MyDate(){
		
	}
	public MyDate(MyDate d){
		this.date = d.date;
		this.mouth = d.mouth;
		this.year = d.year;
	}
	public void setMyDate(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		this.date = a;
		this.mouth = b;
		this.year = c;
	}
	public void getMyDate(){
		System.out.println(this.date+"\t"+this.mouth+"\t"+this.year);
	}
	public static void main(String[] args){
		MyDate birthday = new MyDate();
		birthday.setMyDate();
		birthday.getMyDate();
	}        
}