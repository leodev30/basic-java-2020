import java.util.Scanner;

public class TapChi extends TaiLieu{
	protected int soPhatHanh;
	protected int thangPhatHanh;

	TapChi(){

	}
	public TapChi(int soPhatHanh, int thangPhatHanh){
		super();
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}
	public void setTT(){
		super.setTT();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Vao So Phat Hanh: ");
		this.soPhatHanh = sc.nextInt();
		System.out.print("Nhap vao Thang Phat Hanh: ");
		this.thangPhatHanh = sc.nextInt();
		System.out.println("");
	}
	public String toString(){
		return String.format("%s-%d-%d",super.toString(), this.soPhatHanh, this.thangPhatHanh);
	}
	public int getsoPhatHanh(){
		return soPhatHanh;
	}
	public int getLoai(){
		return 2;
	}
	public int thangPhatHanh(){
		return thangPhatHanh;
	}
}