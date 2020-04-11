import java.util.Scanner;
public class Bai1_3{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			int tong = x+y;
			int hieu = x-y;
			int tich = x*y;
			System.out.println("Tong la "+tong);
			System.out.println("Hieu la "+hieu);
			System.out.println("Tich la "+tich);
			if(y == 0) System.out.println("Khong tnh duoc thuoc do mau so bang o");
			else{
				float thuong = (float) x/y;
				System.out.print("Thuong la "+thuong);
			}
	}
}
