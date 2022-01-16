package mypack;

public class SingleLinkedList {
	public Node head;
	
	public boolean isEmpty() {
		if(head==null)
			return true;
		else return false;
		
	}
	
	public void insertFirst(int d) {
		
		Node n = new Node();
		n.data=d;
		n.next=head;
		head=n;
		
	}
	
	public Node deleteFirst() {
		Node temp = head;
		head=head.next;
		return temp;
		
		
	}
	
	public void printElements() {
		
		Node current = head;
		while(current!=null) {
			
			current.printData();
			current=current.next;
		}
		System.out.println();
		
	}
	
	public void insertLast(int d) {
		
	Node n = new Node();
	n.data=d;
	n.next=null;
	if(head==null)
		head=n;
	else
	{
		Node current= head;
		while(current.next!=null) {
			
			current=current.next;
		}
		
		current.next=n;
		
	}
		
	}
	
	public void insertPosition(int d,int pos) {
		
		Node n = new Node();
		n.data=d;
		if(head == null) {
			head=n;
			n.next = null;
			
		}
		
		else {
			
			int counter=1;
			Node current = head;
			while(counter < pos-1) {
				current = current.next;
				counter += 1;
				
			}
			if(pos == 1) {
				
				n.next = head;
				head= n;
			}
			else {
			Node prev = current;
			Node forward = current.next;
			prev.next = n;
			n.next = forward;
			}
			
		}
	}

}
