import java.util.*;

public class KySu extends Canbo{
	protected String nganhDaoTao;
	public KySu(){
		super();
	}
	public KySu(String NganhDaoTao){
		super();
		this.nganhDaoTao = NganhDaoTao;
	}
	
	public void setTT(){
		super.setTT();
		System.out.println("Nhap vao nganh dao tao:");
		Scanner sc = new Scanner(System.in);
		this.nganhDaoTao = sc.nextLine();
	}
	public void setNganhDaoTao(String NganhDaoTao){
		this.nganhDaoTao = NganhDaoTao;
	}
	public String getNganhDaoTao(){
		return nganhDaoTao;
	}
	public void display(){
		System.out.println("["+hoTen+","+namSinh+","+gioiTinh+","+diaChi+","+nganhDaoTao+"]");
	}
}