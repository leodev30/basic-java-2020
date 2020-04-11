import java.util.Scanner;
public class Bai3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Giai phuong trinh bac nhat");
		System.out.println("Nhap vao so a: ");
		int a = sc.nextInt();
		System.out.println("Nhap vao so b: ");
		int b = sc.nextInt();
		if(a==0&&b==0) System.out.println("Phuong trinh co vo so nghiem");
		if(a==0&&b!=0) System.out.println("Phuong trinh vo nghiem");
		if(a!=0){
			float c = -b/a;
			System.out.println("Nghiem cua phuong trinh la "+c);
		}
		
	}
}
