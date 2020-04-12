import java.util.Scanner;

public class Sach extends TaiLieu{
	protected String tacGia;
	protected int soTrang;

	Sach(){

	}
	public Sach(String tacGia, int soTrang){
		super();
		this.tacGia = tacGia;
		this.soTrang = soTrang;
	}
	public void setTT(){
		super.setTT();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Vao Ten Tac Gia: ");
		this.tacGia = sc.nextLine();
		System.out.print("Nhap vao So Trang: ");
		this.soTrang = sc.nextInt();
		System.out.println("");
	}
	public String toString(){
		return String.format("%s-%s-%d",super.toString(), this.tacGia, this.soTrang);
	}
	public String getTacGia(){
		return tacGia;
	}
	public int getLoai(){
		return 1;
	}
	public int soTrang(){
		return soTrang;
	}
}