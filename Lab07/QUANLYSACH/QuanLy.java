import java.util.*;
public class QuanLy{
	List<TaiLieu> quanLySach = new ArrayList<>();
	int soLuong = 0;

	QuanLy(){

	}
	public void setTT(){
		System.out.println("Nhap 1 de nhap Sach | 2 de nhap Tap Chi | 3 de nhap Bao");
		Scanner sc = new Scanner(System.in);
		int chon = sc.nextInt();
		if(chon == 1){
				Sach tailieu = new Sach();
				tailieu.setTT();
				this.quanLySach.add(tailieu);
				soLuong++;
		}else if(chon == 2){
				TapChi tailieu = new TapChi();
				tailieu.setTT();
				this.quanLySach.add(tailieu);
				soLuong++;
		} 
		else {
				Bao tailieu = new Bao();
				tailieu.setTT();
				this.quanLySach.add(tailieu);
				soLuong++;
			}
	}
	
	public int getSoLuong(){
			return soLuong;
		}
		
	public void printList(){
		if(this.quanLySach.size() == 0){
				System.out.println("Chua co Sach!");
		}else{
			System.out.println("DANH SACH TAI LIEU");	
			for(TaiLieu tailieu : quanLySach){
				System.out.println(tailieu.toString());
				}
			}
	}

	public void SearchMaTaiLieu(){
		System.out.println("Nhap vao ma tai lieu");
		Scanner sc = new Scanner(System.in);
		String maTL = sc.nextLine();
		for(TaiLieu tailieu : quanLySach){
				if(tailieu.getMaTaiLieu().compareTo(maTL)==0){
					System.out.println("Ket qua tim kiem");
					System.out.println(tailieu.toString());
				}
			}
	}

	public void SearchLoai(){
		System.out.println("Nhap 1 de tim Sach | 2 de tim Tap Chi | 3 de tim Bao");
		Scanner sc = new Scanner(System.in);
		int loai = sc.nextInt();
		System.out.println("Ket qua tim kiem");
		for(TaiLieu tailieu : quanLySach){
				if(tailieu.getLoai()==loai){
					System.out.println(tailieu.toString());
				}
			}
	}

	public static void main(String[] args){
		QuanLy ql = new QuanLy();
		ql.setTT();
		ql.setTT();
		ql.setTT();
		ql.setTT();
		System.out.println("So Luong Sach La "+ql.getSoLuong());
		System.out.println("");
		ql.printList();
		System.out.println("");
		ql.SearchMaTaiLieu();
		System.out.println("");
		ql.SearchLoai();
	}
}