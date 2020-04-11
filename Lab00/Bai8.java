import java.util.Scanner;
public class Bai8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float result=1,nFact=1;
		for(int i = 1; i <= n;i++){
			for(int j=1;j<=i;j++){
				nFact*=j;
			}
			result = result + (1/nFact);
		}
		System.out.println("Ket qua la "+ result);
	}
}