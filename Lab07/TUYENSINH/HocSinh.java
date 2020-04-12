import java.util.Scanner;

public class HocSinh{
	public int soBaoDanh;
	public String hoTen;
	public String diaChi;
	public String uuTien;
	HocSinh(){

	}
	HocSinh(int soBaoDanh, String hoTen, String diaChi, String uuTien){
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.uuTien = uuTien;
	}
	public void setTT(){
		System.out.println("NHAP THONG TIN SINH VIEN");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao So Bao Danh: ");
		Scanner sh = new Scanner(System.in);
		this.soBaoDanh = sh.nextInt();
		System.out.print("Nhap vao Ho va Ten: ");
		this.hoTen = sc.nextLine();
		Scanner sr = new Scanner(System.in);
		System.out.print("Nhap vao Dia Chi: ");
		this.diaChi = sr.nextLine();
		System.out.print("Nhao vao loai Uu Tien: ");
		this.uuTien = sr.nextLine();
	}
	public String getTT(){
		return String.format("SBD: %d, HoTen: %s, DiaChi: %s, UuTien: %s",this.soBaoDanh,this.hoTen,this.diaChi,this.uuTien);
	}
	public int getSoBaoDanh(){
		return soBaoDanh;
	}
	public String getHoTen(){
		return hoTen;
	}
	public String getDiaChi(){
		return diaChi;
	}
	public String getUuTien(){
		return uuTien;
	}
} 