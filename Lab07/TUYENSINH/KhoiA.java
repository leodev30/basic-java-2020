import java.util.Scanner;

public class KhoiA extends HocSinh{
 	protected int toan;
 	protected int ly;
 	protected int hoa;

 	KhoiA(){

 	}
 	KhoiA(int toan, int ly, int hoa){
 		super();
 		this.toan = toan;
 		this.ly = ly;
 		this.hoa = hoa;
 	}
 	public void setTT(){
 		super.setTT();
 		System.out.print("Nhap vao diem Toan: ");
 		Scanner sc = new Scanner(System.in);
 		this.toan = sc.nextInt();
 		System.out.print("Nhap vao diem Ly: ");
 		this.ly = sc.nextInt();
 		System.out.print("Nhap vao diem Hoa: ");
 		this.hoa = sc.nextInt();
 		System.out.println("");

 	}
 	public String getTT(){
 		return String.format("%s, Toan = %d, Ly= %d, Hoa = %d", super.getTT(),this.toan, this.ly, this.hoa);
 	}
 	public void setToan(int toan){
 		this.toan = toan;
 	}
 	public int getToan(){
 		return toan;
 	}
 	public void setLy(int ly){
 		this.ly = ly;
 	}
 	public int getLy(){
 		return ly;
 	}
 	public void setHoa(int hoa){
 		this.hoa = hoa;
 	}
 	public int getHoa(){
 		return hoa;
 	}

}