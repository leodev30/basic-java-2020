import java.util.Scanner;
public class Fraction{
	int numerator;
	int denominator;
	Fraction(){
		
	}
	Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public int GCD(int a, int b){
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
	public void setFraction(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Fraction: ");
		System.out.println("numerator: "); 
		int a = sc.nextInt();
		System.out.println("denominator: "); 
		int b = sc.nextInt();
		this.numerator = a;
		this.denominator = b;
	}
	public boolean isSimpleFraction(Fraction fraction){
		if(fraction.GCD(fraction.numerator, fraction.denominator)!=1){
			return false;
		}else return true;
	}
	public void addition(Fraction Fraction1, Fraction Fraction2){
		Fraction result = new Fraction();
		result.numerator = Fraction1.numerator*Fraction2.denominator+Fraction1.denominator*Fraction2.numerator;
		result.denominator = Fraction1.denominator*Fraction2.denominator;
		System.out.println("addition: "+result.numerator+"/"+result.denominator);
	}
	public static void subtraction(Fraction Fraction1, Fraction Fraction2){
		Fraction result = new Fraction();
		result.numerator = Fraction1.numerator*Fraction2.denominator-Fraction1.denominator*Fraction2.numerator;
		result.denominator = Fraction1.denominator*Fraction2.denominator;
		System.out.println("subtraction: "+result.numerator+"/"+result.denominator);
	}
	public void multiplication(Fraction Fraction1, Fraction Fraction2){
		Fraction result = new Fraction();
		result.numerator = Fraction1.numerator*Fraction2.numerator;
		result.denominator = Fraction1.denominator*Fraction2.denominator;
		System.out.println("multiplication: "+result.numerator+"/"+result.denominator);
	}
	public void division(Fraction Fraction1, Fraction Fraction2){
		if(Fraction2.numerator == 0) System.out.println("Cannot perform division");
		else{
			Fraction result = new Fraction();
			result.numerator = Fraction1.numerator*Fraction2.denominator;
			result.denominator = Fraction1.denominator*Fraction2.numerator;
			System.out.println("division: "+result.numerator+"/"+result.denominator);
		}
	}
	public void display(Fraction fraction){
		System.out.println(fraction.numerator+"/"+fraction.denominator);
	}
	public void abridged(Fraction fraction){
		int gcd = fraction.GCD(fraction.numerator, fraction.denominator);
		fraction.numerator = fraction.numerator/gcd;
		fraction.denominator = fraction.denominator/gcd;
		System.out.println("abridged: "+fraction.numerator+"/"+fraction.denominator);
	}
	public static void main(String[] args){
		Fraction Fraction1 = new Fraction();
		Fraction1.setFraction();
		
		Fraction Fraction2 = new Fraction();
		Fraction2.setFraction();
		Fraction result = new Fraction();
		System.out.println("test GCD "+result.GCD(12,8));
		result.addition(Fraction1, Fraction2);
		result.subtraction(Fraction1, Fraction2);
		result.multiplication(Fraction1, Fraction2);
		result.division(Fraction1, Fraction2);
		System.out.println("Is Fraction1 SimpleFraction "+result.isSimpleFraction(Fraction1));
		
		Fraction Fraction3 = new Fraction();
		Fraction3.setFraction();
		result.abridged(Fraction3);
	}
}