import java.util.*;
public class Substr{
	public static String str = new String();
	public void subStr(int a, int b){
		System.out.println("Nhap vao mot xau:  ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		if( a < 0 || b >= str.length()) System.out.println("Null");
		else 
			for(int i = a; i < b; i++){
				System.out.print(str.charAt(i));  
			}
	}
	public static void conCat(String s1, String s2){
		String result = new String();
		result = s1 + s2; 
		System.out.println(result);
		System.out.println("\nVi tri lien ket la "+s1.length()+"\n");
		
		
		
	}
	public static void main(String[] args){
		String s1 = new String();
		String s2 = new String();
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao xau s1: ");
		s1 = input.nextLine();
		System.out.println("Nhap vao xau s2: ");
		s2 = input.nextLine();
		conCat(s1, s2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = sc.nextInt();
		System.out.println("Nhap b: ");
		int b = sc.nextInt();
		Substr str = new Substr();
		str.subStr(a, b);
	}


}