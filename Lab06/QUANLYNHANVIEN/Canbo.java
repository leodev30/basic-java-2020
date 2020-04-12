import java.util.Scanner;

public class Canbo{
	public String hoTen;
	public int namSinh;
	public String gioiTinh;
	public String diaChi;
	public Canbo(){
		
	}
	public Canbo(String hoten, int namSinh, String gioiTinh, String diaChi){
		this.hoTen = hoten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	public void setTT(){
		System.out.println("NHAP THONG TIN ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao Ho Ten: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhap vao Nam Sinh: ");
		this.namSinh = sc.nextInt();
		Scanner gt = new Scanner(System.in);
		System.out.println("Nhap vao Gioi Tinh: ");
		this.gioiTinh = gt.nextLine();
		System.out.println("Nhap vao Dia Chi: ");
		this.diaChi = gt.nextLine();
	}
	public void display(){
		System.out.println("["+hoTen+","+namSinh+","+gioiTinh+","+diaChi+"]");
	}
	public String getHoTen(){
		return hoTen;
	}
	public int getNamSinh(){
		return namSinh;
	}
	public String getGioiTinh(){
		return gioiTinh;
	}
	public String getDiaChi(){
		return diaChi;
	}
	
	
}