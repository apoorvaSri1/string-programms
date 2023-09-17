package collection;
class Node{
	Object ele;
	Node next;
	public Node(Object e, Node n) {
		ele=e;
		next=n;
	}}

public class LinkedList {
	private Node first = null;
	private int count = 0;
//add method
	public void add(Object e) {
			if(first==null) {
				first=new Node(e,null) ;
					count++;
					return ;
				}
				Node curr=first;
				while(curr.next!=null) 
					curr=curr.next;
				curr.next=new Node(e,null);
				count++;
			}
	//size method
	public int size() {
		return count;
	}
	//get method
	public Object get(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr = first;
		for (int i = 1; i <=index; i++) 
			curr = curr.next;
			return curr.ele;
		
	}
	//remove method
	public void remove(int index) {
		if(index<=-1 || index>=size() ) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1; i<index; i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
		
	}
}
