import java.util.Scanner;
public class Bai5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Tinh tong n so");
		System.out.println("Nhap vao so n ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum = sum+i;
		}
		System.out.println("Tong n ao la "+sum);
		
	}
}