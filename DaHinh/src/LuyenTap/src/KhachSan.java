import java.util.ArrayList;
import  java.util.Scanner;
import java.util.List;
public class KhachSan {
    List<KhachTro> ListKhachTro = new ArrayList<>();
    int soLuong = 0;
    KhachSan(){

    }
    public void NhapTT(){
        KhachTro khach = new KhachTro();
        khach.setInfo();
        soLuong++;
        this.ListKhachTro.add(khach);
    }
    public void printList(){
       if(this.ListKhachTro.size()==0){
           System.out.println("Khong co Khach!");
       }else{
           System.out.println("Danh Sach Khach Tro: ");
           for(KhachTro kt : ListKhachTro){
               kt.getInfo();
           }
       }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public static void main(String[] args) {
        KhachSan khachsan = new KhachSan();
        System.out.println("Nhap T de nhap thong tin khach tro | Q de thoat: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        while(a.compareTo("Q")!=0) {
            khachsan.NhapTT();
            System.out.println("Nhap T de nhap thong tin khach tro | Q de thoat: ");
            a = sc.nextLine();
        }
        System.out.println("So luong Khach Tro cua Khach San la: "+khachsan.getSoLuong());
        System.out.println(" ");
        khachsan.printList();
    }



}
