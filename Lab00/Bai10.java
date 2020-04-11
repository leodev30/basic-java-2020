import java.util.Scanner;
public class Bai10{
	public static int Sum(int N){
		int S = 0;
		while(N>0){
			int t = N%10;
			S = S+t;
			N = N/10;
		}
		return S;		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Tong la "+Sum(n));
	}
}