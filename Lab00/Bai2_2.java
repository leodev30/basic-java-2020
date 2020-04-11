import java.util.Scanner;
public class Bai2_2{
	public static void main(String[] args){
		int i = 0;
		int j = 0;
		int sum = 0;
		while(j<10){
			sum = sum + i;
			i = i + 2;
			j = j+1;
		}
		System.out.println("Tổng 10 sô chẵn đầu tiên là "+sum);
	}
	
}