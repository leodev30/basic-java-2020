public class Node{
	public int item;
	public Node next;
	
	Node(){
		
	}
	public Node(int item){
		this.item = item;
		this.next = null;
	}
	public Node(int item, Node first){
		this.item = item;
		this.next = first;
	}
	public void setItem(int item){
		this.item = item;
	}
	public int getItem(){
		return item;
	}
	public void setNext(Node next){
		this.next = next;
	}
	public Node getNext(){
		return next;
	}
	
}