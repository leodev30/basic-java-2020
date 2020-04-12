import java.util.Scanner;

public class CongNhan extends Canbo{
	protected int bac;
	public CongNhan(){
		super();
	}
	public CongNhan(int bac){
		super();
		this.bac = bac;
	}
	public void setTT(){
		super.setTT();
		System.out.println("Nhap vao bac:");
		Scanner sc = new Scanner(System.in);
		this.bac = sc.nextInt();
	}
	public void setBac(int bac){
		this.bac = bac;
	}
	public int getBac(){
		return bac;
	}
	public void display(){
		System.out.println("["+hoTen+","+namSinh+","+gioiTinh+","+diaChi+","+bac+"]");
	}
}