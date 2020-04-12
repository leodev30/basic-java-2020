import java.util.Scanner;

public class TaiLieu{
	public String maTaiLieu;
	public String nhaXuatBan;
	public int soBanPhatHanh;

	public TaiLieu(){

	}
	public TaiLieu(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh){
		this.maTaiLieu = maTaiLieu;
		this.nhaXuatBan = nhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	public void setTT(){
		System.out.println("Nhap Thong Tin Tai Lieu");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Vao Ma Tai Lieu: ");
		this.maTaiLieu = sc.nextLine();
		System.out.print("Nhap Vao Nha Xuat Ban: ");
		this.nhaXuatBan = sc.nextLine();
		System.out.print("Nhap Vao So Ban Phat Hanh: ");
		this.soBanPhatHanh = sc.nextInt();
	}
	public String toString(){
        return String.format("%s-%s-%d", this.maTaiLieu, this.nhaXuatBan, this.soBanPhatHanh);
    }
	public String getMaTaiLieu(){
		return maTaiLieu;
	}
	public int getLoai(){
		return 0;
	}
	public String getNhaXuatBan(){
		return nhaXuatBan;
	}
	public int getSoBanPhatHanh(){
		return soBanPhatHanh;
	}

}