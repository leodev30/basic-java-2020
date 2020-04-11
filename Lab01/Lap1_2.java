import java.util.Scanner;
public class Lap1_2{
	public static int nhapSoTN() {
            Scanner input = new Scanner(System.in);
            int  n = Integer.parseInt(input.nextLine());
            return n;
	}
	public static int fibonacci_thu_n(int n){
            if ((n == 1) || (n == 2)){
                     return 1;
            } 
			else{
                     int arr[] = new int[n];
                     arr[0] = 1;
                     arr[1] = 1;
                     for (int i = 2; i < arr.length; i++) {
                           arr[i] = arr[i - 1] + arr[i - 2];
                     }
                     return arr[n-1];
            }
	}

	public static int UCLN(int a, int b){
		if (a == 0 || b == 0){
			return a + b;
		}
		while (a != b){
			if (a > b){
				a -= b; 
			}else{
				b -= a;
			}
		}
		return a;
	}


       public static void main(String[] args) {

              System.out.println("Nhap vao n: ");

              int n = nhapSoTN();

              System.out.println("So Fibonacci thu " + n + " la: ");

              System.out.println(fibonacci_thu_n(n));
			  
			  System.out.println("Nhap vao a: ");

              int a = nhapSoTN();
			  
			  System.out.println("Nhap vao b: ");

              int b = nhapSoTN();
			  
			  System.out.println("Uoc chung lon nhat cua " + a+ " va " +b+ " la: ");
			  
			  System.out.println( UCLN(a, b) );
			  

       }
}