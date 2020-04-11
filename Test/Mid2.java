import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
public class Mid2{
	public static int n = 0;
	public static int[][] a;
	
	Mid2(int n){
		this.n = n;
		this.a = new int[n][n];
	}
	public static boolean isPrime(int x){
		if( x<2 ) return false;
		for(int i = 2; i<= Math.sqrt(x);i++){
			if(x%i==0) return false;
		}
		return true;
	}
	public static void inputMatrix(int[][] a, Scanner reader){
		System.out.println("Input the Matrix");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				a[i][j] = reader.nextInt();
			}
		}
	}
	public static void printMatrix(int[][] a){
		System.out.println("Matrix:");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static void getPrimeList(int[][] a){
		int k = 0;
		int[] prime = new int[n*n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n;j++){
				if(isPrime(a[i][j])){
					prime[k] = a[i][j];
					k++;
				}
			}
		}
		
		System.out.println("List of Primes:");
		for(int h=0; h<n*n;h++){
			if(prime[h]!=0)
				System.out.print(prime[h]+" ");
		}
		System.out.println("");
	}
	public static int getMinPrime(int[][] a){
		int noPrime = -1, k = 0;
		int[] prime = new int[n*n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n;j++){
				if(isPrime(a[i][j])){
					prime[k] = a[i][j];
					k++;
				}
			}
		}
		if(prime[0]==0) return noPrime;
		else{
			int minPrime = prime[0];
			for(int h=1; h<prime.length; h++){
				if(prime[h]!=0&&prime[h]<minPrime)
					minPrime = prime[h];
			}
			return minPrime;
		}
	}
	public static int getMaxElement(int[][] a, int i){
		int MaxOfRow = a[i-1][0];
		for(int j=1; j<n; j++){
				if(a[i-1][j-1]<a[i-1][j]) MaxOfRow = a[i-1][j];
			}
		return MaxOfRow;
	}
	public static void getMaxAllRow(int[][] a){
		System.out.println("Get Max all Row Of Matrix");
		for(int i=0; i<n; i++){
			int MaxOfRow = a[i][0];
			for(int j=1; j<n; j++){
				if(a[i][j-1]<a[i][j]) MaxOfRow = a[i][j];
			}
			int row = i+1;
			System.out.println("Max of Row "+row+" is "+MaxOfRow);
		}
	}
	public static boolean negativeColumn(int[][] a, int k){
		System.out.println("Is Kcolumn negative Column?");
		for(int i = 0; i<n; i++){
			if(a[i][k-1]>=0) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of Matrix");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		Mid2 b2 = new Mid2(n);
		b2.inputMatrix(a, sc);
		b2.printMatrix(a);
		
		b2.getPrimeList(a);
		System.out.println("Check Prime: "+b2.getMinPrime(a));
		
		System.out.println("Input the column to check");
		int k = sc.nextInt();
		System.out.println(b2.negativeColumn(a, k));
		b2.getMaxAllRow(a);
		
		System.out.println("Input the row to get Max");
		int i = sc.nextInt();
		System.out.println("Max of row "+i+" is "+b2.getMaxElement(a, i));	
	}
}