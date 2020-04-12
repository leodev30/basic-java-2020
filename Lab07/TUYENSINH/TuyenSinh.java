import java.util.*;
public class TuyenSinh{
	List<HocSinh> DSthisinh = new ArrayList<>();
	int SoHocSinh = 0;

	TuyenSinh(){

	}
	public void setTT(){
		System.out.println("Nhap 1 de nhap Khoi A | 2 de nhap Khoi B | 3 de nhap Khoi C");
		Scanner sc = new Scanner(System.in);
		int chon = sc.nextInt();
		if(chon == 1){
				KhoiA HocSinh = new KhoiA();
				HocSinh.setTT();
				this.DSthisinh.add(HocSinh);
				SoHocSinh++;
		}else if(chon == 2){
				KhoiB HocSinh = new KhoiB();
				HocSinh.setTT();
				this.DSthisinh.add(HocSinh);
				SoHocSinh++;
		} 
		else {
				KhoiC HocSinh = new KhoiC();
				HocSinh.setTT();
				this.DSthisinh.add(HocSinh);
				SoHocSinh++;
			}
	}
	
	public int getSoHocSinh(){
			return SoHocSinh;
		}
		
	public void printList(){
		if(this.DSthisinh.size() == 0){
				System.out.println("Chua co Thi Sinh!");
		}else{
			System.out.println("DANH SACH THI SINH");	
			for(HocSinh HocSinh : DSthisinh){
				System.out.println(HocSinh.getTT());
				}
			}
	}

	public void SearchSBD(){
		System.out.println("Nhap vao So Bao Danh");
		Scanner sc = new Scanner(System.in);
		int sbd = sc.nextInt();
		for(HocSinh HocSinh : DSthisinh){
				if(HocSinh.getSoBaoDanh()==sbd){
					System.out.println("Ket qua tim kiem:");
					System.out.println(HocSinh.getTT());
				}
			}
	}


	public static void main(String[] args){
		TuyenSinh ts = new TuyenSinh();
		ts.setTT();
		ts.setTT();
		ts.setTT();
		ts.setTT();
		System.out.println("So Thi Sinh La "+ts.getSoHocSinh());
		System.out.println("");
		ts.printList();
		System.out.println("");
		ts.SearchSBD();
	}
}