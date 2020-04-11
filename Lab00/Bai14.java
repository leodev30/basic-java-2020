import java.util.Scanner;
import static java.lang.Math.sqrt;


public class Bai14{
	static int n,m, matrix[][];
	public static boolean SNT(int N){
		boolean check = true;
		if(N<3) return true;
		for(int i = 2; i<= sqrt(N);i++){
			if(N%i==0) check = false;
		}
		return check;
	}
	public static void nhapmatrix(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so hang ");
		n = sc.nextInt();
		System.out.println("Nhap so cot ");
		m = sc.nextInt();
		matrix = new int[n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print("Nhap vao phan tu a["+i+"]["+j+"]= ");
				matrix[i][j]=sc.nextInt();
				System.out.println();
			}
		}
	}
	
	public static void xuatmatrix(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            System.out.print(matrix[i][j] +"  ");
        }
        System.out.println("");
        }
    }
	public static int maxmatrix(){
		int max=matrix[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]>max) {
                    max=matrix[i][j];
                }
            }
        }
        return max;
	}
	
	public static void nguyento(){
		int matrix1[][];
		matrix1 = new int[n][m];
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = matrix[i][j];           
            }
        }
		
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (SNT(matrix1[i][j])==false){
                    matrix1[i][j]=0;
                }
            }
        }
		
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("phan tu a["+i+"]["+j+"]= "+matrix1[i][j]);
                }
        }
    }
	
	
	public static void sapxep(){
		for(int i=0;i<m;i++){
			for(int j=0;j<n-1;j++){
				if(matrix[i][j+1]<matrix[i][j]){
					int biendoi = matrix[i][j+1];
					matrix[i][j+1] = matrix[i][j];
					matrix[i][j] = biendoi;
				}
			}
		}
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("a["+i+"]["+j+"]= "+matrix[i][j]);
                }
        }
		
    }
	public static void main(String[] args) {
        nhapmatrix();
        xuatmatrix();
        System.out.println("phan tu lon nhat "+maxmatrix());
        nguyento();
		sapxep();
    }
	
}