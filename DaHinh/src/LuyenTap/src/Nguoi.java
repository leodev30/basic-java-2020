import java.util.Scanner;
public class Nguoi {
    String hoTen;
    int tuoi;
    int namSinh;
    int CMT;
    Nguoi(){

    }
    Nguoi(String hoten, int tuoi, int namsinh, int cmt){
        this.hoTen = hoten;
        this.tuoi = tuoi;
        this.namSinh = namsinh;
        this.CMT = cmt;
    }

    public void setInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao Ho Ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap vao Nam Sinh: ");
        this.namSinh = sc.nextInt();
        Scanner t = new Scanner(System.in);
        System.out.println("Nhap vao Tuoi: ");
        this.tuoi = t.nextInt();
        System.out.println("Nhap vao Chung Minh Thu: ");
        this.CMT = t.nextInt();
    }
    public void getInfo(){
        System.out.println("Thong tin la");
        System.out.print("Ho ten: "+hoTen+" -Tuoi "+tuoi+" -Nam sinh "+namSinh+" -Chung minh thu "+CMT+" -");
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setCMT(int CMT) {
        this.CMT = CMT;
    }

    public int getCMT() {
        return CMT;
    }
}
