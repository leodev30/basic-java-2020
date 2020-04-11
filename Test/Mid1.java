import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
public class Mid1{
	Mid1(){
		
	}
	public static void inputArray(int[] a,Scanner reader){
		System.out.println("Input numbers");
		for(int i=0; i < a.length; i++){
			a[i] = reader.nextInt();
		}
	}
	public static void printArray(int[] a){
		System.out.print("List of numbers: [ ");
		for(int i = 0; i< a.length; i++){
		System.out.print(a[i]+" ");
		}
		System.out.print("]\n");
	}
	public static boolean isIncreasingSequence(int[] a){
		boolean isIncreasing = true;
		for(int i = 1; i < a.length; i++){
			if(a[i-1]>a[i]) isIncreasing = false;
		}
		return isIncreasing;
	}
	public static int getSum(int[] a){
		int sum = 0;
		for(int i = 0; i< a.length; i++){
			sum = sum + (int) Math.pow(-1,i)*a[i];
		}
		return sum;
	}
	public static void main(String[] args){
		Mid1 b1 = new Mid1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input length of Array");
		int[] a = new int[sc.nextInt()];
		b1.inputArray(a, sc);
		b1.printArray(a);
		System.out.println("Is list increasing? "+b1.isIncreasingSequence(a));
		System.out.println("Sum = a[0]-a[1]+a[2]-a[3]+...= "+b1.getSum(a));
	}
	
	
}