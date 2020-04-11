import java.util.Scanner;
public class Bai4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Giai phuong trinh bac 2");
		System.out.println("Nhap vao so a ");
		int a = sc.nextInt();
		System.out.println("Nhap vao so b ");
		int b = sc.nextInt();
		System.out.println("Nhap vao so c ");
		int c = sc.nextInt();
		
		if(a==0&&b==0&&c==0)System.out.println("Phuong trinh co vo so nghiem");
		if(a==0&&b==0&&c!=0)System.out.println("Phuong trinh vo nghiem");
		if(a==0&&b!=0){
			float result = -c/b;
			System.out.println("Phuong trinh co mot nghiem la "+result);			
		}
		if(a!=0){
			int delta = b*b-4*a*c;
			if(delta < 0){
				System.out.println("Phuong trinh vo nghiem");
			}
			if(delta == 0){
				double result = -b/(2*a);
				System.out.println("Phuong trinh co nghiem kep "+result);
			}
			if(delta > 0){
				double result1= (-b+Math.sqrt(delta))/(2*a);
				double result2= (-b-Math.sqrt(delta))/(2*a);
				System.out.println("Phuong trinh co 2 nghiem la "+result1+" "+result2);
			}
		}
	}
	
}