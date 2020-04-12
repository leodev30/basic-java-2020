import java.util.*;

public class NhanVien extends Canbo{
	protected String congViec;
	public NhanVien(){
		super();
	}
	public NhanVien(String congViec){
		super();
		this.congViec = congViec;
	}
	
	public void setTT(){
		super.setTT();
		System.out.println("Nhap vao cong viec:");
		Scanner sc = new Scanner(System.in);
		this.congViec = sc.nextLine();
	}
	public void setcongViec(String congViec){
		this.congViec = congViec;
	}
	public String getcongViec(){
		return congViec;
	}
	public void display(){
		System.out.println("["+hoTen+","+namSinh+","+gioiTinh+","+diaChi+","+congViec+"]");
	}
}