public class Stack2{
	LinkedList list;
	int size;
	public Stack2(){
		list = new LinkedList();
		size = 0;
	}
	public void push(int item){
		list.insertFront(item);
	}
	public Node pop(){
		return list.removeFront();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public int numOfElement(){
		return list.numOfElement();
	}
	public int search(int item){
		Node p = list.firstNode;
		int index = 0;
		while( p != null){
			index++;
			if(p.item == item) break;
			else{
				p = p.next;
			}
			if(p == null) index++;
		}
		if(index > size) return 0;
		else return index;	
	}
	public void display(){
		list.travel();
	}
	public static void main(String[] args){
		Stack2 st = new Stack2();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println("Danh sach Stack la");
		st.display();
		System.out.println("Size of Stack "+st.numOfElement());
		
		Node n = st.pop();
		System.out.println("Thong tin phan tu pop "+n.item);
		System.out.println("tim 3: "+st.search(3));
		
	}
}