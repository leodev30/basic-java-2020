import java.util.Scanner;

public class Bao extends TaiLieu{
	protected int ngayPhatHanh;

	Bao(){

	}
	public Bao(int ngayPhatHanh){
		super();
		this.ngayPhatHanh = ngayPhatHanh;
	}
	public void setTT(){
		super.setTT();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao Ngay Phat Hanh: ");
		this.ngayPhatHanh = sc.nextInt();
		System.out.println("");
	}
	public String toString(){
		return String.format("%s-%d",super.toString(), this.ngayPhatHanh);
	}
	public int getLoai(){
		return 3;
	}
	public int ngayPhatHanh(){
		return ngayPhatHanh;
	}
}