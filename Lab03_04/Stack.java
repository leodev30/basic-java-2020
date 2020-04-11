import java.util.*;
public class Stack{
	private Node top;
	private	int size;
	
	public  static class Node{
		public int item;
		public Node next;	
	}
	public Stack(){
		top = null;
		size = 0;
	}
	public boolean isEmpty(){
		return top == null;
	}
	public void push(int item){
		Node oldtop = top;
		top = new Node();
		top.item = item;
		top.next = oldtop;
		size++;
	}
	public void pop(){
		if(isEmpty()) System.out.println("-1");
		int item = top.item;
		top = top.next;
		size--;
	}
	public void numOfElements(){
		System.out.println("So phan tu cua Stack la "+size);
	}
	public void search(int data){
		boolean exist = false;
		Node ftop = top;
		int i = 1;
		while(ftop != null) {
			if(ftop.item == data) {
				System.out.println("Tim thay! \nVi tri cua "+data+" la "+i);
				exist = true;
			}

			ftop = ftop.next;
			i++;
		}
		if(!exist) System.out.println("-1");
	}

	public void display(){
		Node ftop = top;
		for(int i = 1; i <= size; i++){
			System.out.print(ftop.item+" ");
			ftop = ftop.next;
		}
	}
	public static void main(String[] args) {
        Stack stack = new Stack();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao 5 so: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		stack.push(a);
		stack.push(b);
		stack.push(c);
		stack.push(d);
		stack.push(e);
		stack.numOfElements();
		System.out.println("Cac phan tu cua stack la: ");
		stack.display();
		System.out.println("\nNhap vao so can tim: ");
		int n = sc.nextInt();
		stack.search(n);
    }
}