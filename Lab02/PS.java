import java.util.Scanner;
public class PS{
	public static int tuso;
	public static int mauso;
	public static int UCLN(int a, int b){
		if (a == 0 || b == 0){
			return a + b;
		}
		while (a != b){
			if (a > b){
				a -= b; 
			}else{
				b -= a;
			}
		}
		return a;
	}
	PS(){
		
	}
	PS(int a, int b){
		this.tuso = a;
		this.mauso = b;
	}
	public void setPS(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		this.tuso = a;
		this.mauso = b;
	}
	public static void cong(PS d1, PS d2){
		PS result = new PS();
		result.tuso = d1.tuso*d2.mauso+d1.tuso*d2.mauso;
		result.mauso = d1.mauso*d2.mauso;
		int d = UCLN(result.tuso, result.mauso);
		result.tuso=result.tuso/d;
		result.mauso=result.mauso/d;
		System.out.println("ketqua: "+result.tuso+"/"+result.mauso);
	}
	public static void tru(PS d1, PS d2){
		PS result = new PS();
		result.tuso = d1.tuso*d2.mauso-d1.tuso*d2.mauso;
		result.mauso = d1.mauso*d2.mauso;
		int d = UCLN(result.tuso, result.mauso);
		result.tuso=result.tuso/d;
		result.mauso=result.mauso/d;
		System.out.println("ketqua: "+result.tuso+"/"+result.mauso);
	}
	public static void nhan(PS d1, PS d2){
		PS result = new PS();
		result.tuso = d1.tuso*d2.tuso;
		result.mauso = d1.mauso*d2.mauso;
		int d = UCLN(result.tuso, result.mauso);
		result.tuso=result.tuso/d;
		result.mauso=result.mauso/d;
		System.out.println("ketqua: "+result.tuso+"/"+result.mauso);
	}
	public static void chia(PS d1, PS d2){
		PS result = new PS();
		result.tuso = d1.tuso*d2.mauso;
		result.mauso = d1.mauso*d2.tuso;
		int d = UCLN(result.tuso, result.mauso);
		result.tuso=result.tuso/d;
		result.mauso=result.mauso/d;
		System.out.println("ketqua: "+result.tuso+"/"+result.mauso);
	}
	public static void main(String[] args){
		PS ps1 = new PS();
		ps1.setPS();
		PS ps2 = new PS();
		ps2.setPS();
		cong(ps1, ps2);
		tru(ps1, ps2);
		nhan(ps1, ps2);
		chia(ps1, ps2);
	}
}