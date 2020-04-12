public class Queue{
	LinkedList list;
	int size;
	public Queue(){
		list = new LinkedList();
		size = 0;
	}
	public void add(int item){
		list.insertEnd(item);
		size++;
	}
	public void remove(){
		size--;
		list.removeEnd();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public int numOfElement(){
		return size;
	}
	public void search(int item){
		Node p = list.firstNode;
		boolean exist = false;
		int i = 1;
		while(p != null) {
			if(p.item == item) {  
				System.out.println("Tim thay! \nVi tri cua "+item+" la "+i);
				exist = true;
			}

			p = p.next;
			i++;
		}
		if(!exist) System.out.println("Khong tim thay");
		
	}
	public void display(){
		list.travel();
	}
	public static void main(String[] args){
		Queue qu = new Queue();
		qu.add(12);
		qu.add(23);
		qu.add(34);
		qu.add(44);
		qu.add(51);
		qu.add(65);
		System.out.println("Danh sach Queue la");
		qu.display();
		qu.remove();
		System.out.println("Danh sach sau remove");
		qu.display();
		System.out.println("Size of Queue "+qu.numOfElement());
		qu.search(12);
	}
}