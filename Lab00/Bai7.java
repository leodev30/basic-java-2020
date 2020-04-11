import java.util.Scanner;
public class Bai7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int gt = 1;
		for(int i = 2; i <= n;i++){
			gt = gt*i;
		}
		System.out.println("Giai thua la "+gt);
	}
}