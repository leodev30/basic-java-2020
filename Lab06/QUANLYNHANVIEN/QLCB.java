import java.util.Scanner;
import java.util.*;

public class QLCB{
		List<Canbo> qlcb = new ArrayList<>();
		protected int soCanBo = 0;
		
		QLCB(){
			
		}
		public void NhapCB(){
			System.out.println("Nhan 1 de nhap vao Cong Nhan | Nhan 2 de nhap vao Ky Su | Nhan 3 de nhap vao Nhan Vien:");
			Scanner sc = new Scanner(System.in);
			int luaChon = sc.nextInt();
			if(luaChon == 1){
				CongNhan congnhan = new CongNhan();
				congnhan.setTT();
				this.qlcb.add(congnhan);
				soCanBo++;
			}
			else if(luaChon == 2){
				KySu kysu = new KySu();
				kysu.setTT();
				this.qlcb.add(kysu);
				soCanBo++;
			}
			else{
				NhanVien nhanvien = new NhanVien();
				nhanvien.setTT();
				this.qlcb.add(nhanvien);
				soCanBo++;
			}
		}
		public int getSoCanBo(){
			return soCanBo;
		}
		public void printList(){
			if(this.qlcb.size() == 0){
					System.out.println("Chua co can bo!");
				}else{
					System.out.println("DANH SACH CAN BO CUA CONG TY");	
					for(Canbo canbo : qlcb){
						canbo.display();
					}
				}
		}
		public void search(){
			System.out.println("Nhap vao ten de tim kiem:");
			Scanner sc = new Scanner(System.in);
			String ten = sc.nextLine();
			for(Canbo canbo : qlcb){
				if(canbo.getHoTen().compareTo(ten)==0){
					System.out.println("Ket qua tim kiem");
					canbo.display();
				}
			}
		}
		
		public static void main(String[] args){
			QLCB qlcb = new QLCB();
			System.out.println("Enter any key to input | Q to Quite");
			Scanner sc = new Scanner(System.in);
			String a = sc.nextLine();
			while(a.compareTo("Q")!=0) {
				qlcb.NhapCB();
			}
			System.out.println("So can bo: "+qlcb.getSoCanBo());
			qlcb.printList();
			qlcb.search();
		}
}