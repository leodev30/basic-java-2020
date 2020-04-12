import java.util.Scanner;

public class KhoiC extends HocSinh{
 	protected int van;
 	protected int su;
 	protected int dia;

 	KhoiC(){

 	}
 	KhoiC(int van, int su, int dia){
 		super();
 		this.van = van;
 		this.su = su;
 		this.dia = dia;
 	}
 	public void setTT(){
 		super.setTT();
 		System.out.print("Nhap vao diem van: ");
 		Scanner sc = new Scanner(System.in);
 		this.van = sc.nextInt();
 		System.out.print("Nhap vao diem su: ");
 		this.su = sc.nextInt();
 		System.out.print("Nhap vao diem dia: ");
 		this.dia = sc.nextInt();
 		System.out.println("");

 	}
 	public String getTT(){
 		return String.format("%s, van = %d, su = %d, dia = %d", super.getTT(),this.van, this.su, this.dia);
 	}
 	public void setvan(int van){
 		this.van = van;
 	}
 	public int getvan(){
 		return van;
 	}
 	public void setsu(int su){
 		this.su = su;
 	}
 	public int getsu(){
 		return su;
 	}
 	public void setdia(int dia){
 		this.dia = dia;
 	}
 	public int getdia(){
 		return dia;
 	}

}