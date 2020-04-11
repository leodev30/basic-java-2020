import java.util.Scanner;
public class Bai11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean check = true;
		for(int i = 2; i<n; i++){
			if(n%i==0)check = false;
		}
		if(check==true)System.out.println("La so nguyen to");
		else System.out.println("Khong la so nguyen to");
	}
}