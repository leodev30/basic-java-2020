public class LinkedList{
	Node firstNode;
	Node lastNode;
	public LinkedList(){
		firstNode = null;
		lastNode = null;
	}
	public boolean isEmpty(){
		return firstNode == null;
	}
	public void insertFront(int item){
		Node p = new Node(item);
		if(isEmpty()){
			firstNode = lastNode = p;
		}else{
			p.next = firstNode;
			firstNode = p;
		}		
	}
	public Node removeFront(){
		if(isEmpty()){
			System.out.println("Danh sach rong");
			return null;
		}else{
			Node p = firstNode;
			firstNode = firstNode.next;
			p.next = null;
			return p;
		}		
	}
	public void removeEnd(){
		if(isEmpty()){
			System.out.println("Danh sach rong");
		}else{
			Node p = firstNode;
			while(p.next.next != null) p = p.next;
			lastNode = p;
			p = lastNode.next;
			lastNode.next = null;	
		}		
	}
	public void insertEnd(int item){
		Node p = new Node(item);
		if(isEmpty()){
			firstNode = lastNode = p;
		}else{
			lastNode.next = p;
			lastNode = p;
		}		
	}
	
	public void travel(){
		if(isEmpty()){
			System.out.println("Danh sach rong");
		}
		else{
			Node p = firstNode;
			while(p!=null){
				System.out.println(p.item + " " );
				p = p.next;
			}
		}
	}
	public int numOfElement(){
		int count=0;
		Node p = firstNode;
		while(p!=null){
			count=count+1;
			p = p.next;
		}
		return count;
	}
	public static void main(String[] args){
		LinkedList ll= new LinkedList();
		ll.insertFront(10);
		ll.insertFront(11);
		ll.insertFront(12);
		ll.insertFront(13);
		ll.insertEnd(9);
		System.out.println("Danh sach la");
		ll.travel();
		System.out.println("Danh sach sau khi xoa cuoi");
		ll.removeEnd();
		ll.travel();
		System.out.println("Danh sach sau khi xoa truoc");
		ll.removeFront();
		ll.travel();
	}
}