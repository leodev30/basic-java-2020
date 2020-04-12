import java.util.Scanner;

public class KhoiB extends HocSinh{
 	protected int toan;
 	protected int sinh;
 	protected int hoa;

 	KhoiB(){

 	}
 	KhoiB(int toan, int sinh, int hoa){
 		super();
 		this.toan = toan;
 		this.sinh = sinh;
 		this.hoa = hoa;
 	}
 	public void setTT(){
 		super.setTT();
 		System.out.print("Nhap vao diem Toan: ");
 		Scanner sc = new Scanner(System.in);
 		this.toan = sc.nextInt();
 		System.out.print("Nhap vao diem sinh: ");
 		this.sinh = sc.nextInt();
 		System.out.print("Nhap vao diem Hoa: ");
 		this.hoa = sc.nextInt();
 		System.out.println("");

 	}
 	public String getTT(){
 		return String.format("%s, Toan = %d, sinh = %d, Hoa = %d", super.getTT(),this.toan, this.sinh, this.hoa);
 	}
 	public void setToan(int toan){
 		this.toan = toan;
 	}
 	public int getToan(){
 		return toan;
 	}
 	public void setsinh(int sinh){
 		this.sinh = sinh;
 	}
 	public int getsinh(){
 		return sinh;
 	}
 	public void setHoa(int hoa){
 		this.hoa = hoa;
 	}
 	public int getHoa(){
 		return hoa;
 	}

}