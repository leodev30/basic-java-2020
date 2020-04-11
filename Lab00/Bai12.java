import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Scanner;
public class Bai12{
	public static boolean SNT(int N){
		boolean check = true;
		if(N<2) return false;
		for(int i = 2; i<= sqrt(N);i++){
			if(N%i==0) check = false;
		}
		return check;
	}
	public static void main(String[] args){
		int arrInt[];
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arrInt = new int[n];
		
		for(int i=0;i<n;i++){
			System.out.println("Nhap a["+i+"]=");
			arrInt[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.println("gia tri a["+i+"]="+arrInt[i]);	
		}
		/*b*/
		int min=arrInt[0];
		for(int i=1;i<n;i++){
			if(min>arrInt[i]) min=arrInt[i];
		}
		System.out.println("Min="+min);
		
		int max=arrInt[0];
		for(int i=1;i<n;i++){
			if(max<arrInt[i]) max=arrInt[i];
		}
		System.out.println("Max="+max);
		/*c*/
		int soPTChan=0;
		for(int i=1;i<n;i++){
			if(arrInt[i]%2==0) soPTChan=soPTChan+1;
		}
		System.out.println("So phan tu chan la "+soPTChan);
		/*d*/
		for (int i = 0; i < n; i++) {
			if (SNT(arrInt[i])) {
				System.out.println("phan tu a["+i+"] ="+arrInt[i]+"la so nguyen to");
			}
		}
		/*e*/
		Arrays.sort(arrInt);
		for(int i = 0; i < n; i++){
			System.out.println("a["+i+"]="+arrInt[i]);
		}
		/*f*/
		System.out.println("Nhap x ");
		int x = sc.nextInt();
		int loca = Arrays.binarySearch(arrInt,x)+1;
		System.out.println("vi tri cua "+x+" trong mang la "+loca);		
	}
}