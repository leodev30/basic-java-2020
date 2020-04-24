import java.util.Scanner;
public class KhachTro extends Nguoi{
    int soNgayTro;
    String loaiPhongTro;
    int giaPhong;
    KhachTro(){

    }
    KhachTro(String hoten, int tuoi, int namsinh, int cmt, int songaytro, String loaiphongtro, int gia){
        super(hoten, tuoi, namsinh, cmt);
        this.soNgayTro = songaytro;
        this.loaiPhongTro = loaiphongtro;
        this.giaPhong = gia;
    }
    public void setInfo(){
        super.setInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so ngay Tro");
        this.soNgayTro = sc.nextInt();
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhap vao so Loai Phong Tro");
        this.loaiPhongTro = sr.nextLine();
        Scanner gia = new Scanner(System.in);
        System.out.println("Nhap vao gia Phong");
        this.giaPhong = gia.nextInt();
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print("So Ngay Tro "+soNgayTro+" -Loai Phong "+loaiPhongTro+" -Gia Phong "+giaPhong);
        System.out.println(" ");
    }

    public int getGiaPhong() {
        return giaPhong;
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public String getLoaiPhongTro() {
        return loaiPhongTro;
    }

    public void setGiaPhong(int giaPhong) {
        this.giaPhong = giaPhong;
    }

    public void setLoaiPhongTro(String loaiPhongTro) {
        this.loaiPhongTro = loaiPhongTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }
}
