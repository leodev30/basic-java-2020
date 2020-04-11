import java.util.Scanner;
public class Bai6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float sum = 0;
		for(int i = 1; i <= n;i++){
			sum = sum = 1/i;
		}
		System.out.println("Tong la "+sum);
	}
}