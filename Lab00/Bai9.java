import java.util.Scanner;
public class Bai9{
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




       public static void main(String[] args) {

              System.out.println("Nhap vao n: ");

              int n = nhapSoTN();

              System.out.println("So Fibonacci thu " + n + " la: ");

              System.out.println(fibonacci_thu_n(n));

       }
}