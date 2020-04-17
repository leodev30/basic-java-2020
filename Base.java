public class Base{
	private void f(){
		System.out.println("base f()");
	}
	public void show() {
			f();
		}
	}
	public class Derived extends Base{
		public void f(){
			System.out.println("derived f()");
		}
	}
	public static void main(String args[]){
		Derived d = new Derived();
		Base b = d;
		b.show();
		d.show();
	}
}