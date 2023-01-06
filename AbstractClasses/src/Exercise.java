
public class Exercise {
	public static void main(String[] args) {
		IntLinkedList linked = new IntLinkedList();
		
		linked.add(4);
		linked.add(3);
		linked.add(2);
		linked.add(1);
		linked.printAll();
	}
}

abstract class ListItem {
	public Object val;
	private ListItem next;
	private ListItem previous;
	
	public ListItem(Object val) {
		this.val = val;
	}
	
	public ListItem getNext() {
		return next;
	
	}
	
	public ListItem getPrevious() {
		return previous;
	
	}
	
	public void setNext(ListItem n) {
		n.next = this.next;
		this.next = n;
		
	}
	
	public void setPrevious(ListItem p) {
		p.previous = this.previous;
		this.previous = p;
		
	}
	
	public int compareTo(ListItem other) {
		return 0;
		
	}
}

class IntItem extends ListItem {
	
	public IntItem(int val) {
		super(val);
	}
	
	@Override
	public int compareTo(ListItem other) {
		if (this.getClass() != other.getClass()) {
			return 0;
		}
		return (int) other.val - (int) this.val;
		
	}
}

class IntLinkedList {
	private ListItem head;
	private ListItem tail;
	
	public void add(int val) {
		printAll();
		System.out.println("**");
		ListItem newNode = new IntItem(val);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {			
			//add objects sorted
			ListItem current = head;
			while (current.getNext() != null && current.compareTo(newNode) > 0) {
				current = current.getNext();
			}
			if (current.getNext() == null) {
				// pointer is at the tail
				current.setNext(newNode);
				newNode.setPrevious(current);
				tail = newNode;
			} else if (current.getPrevious() == null ) {
				// pointer is at the head
				newNode.setNext(current);
				current.setPrevious(newNode);
				head = newNode;
			} else {
				// pointer is at an intermediary node
				// newNode goes after pointer, before pointer.next
				newNode.setNext(current.getNext());
				current.getNext().setPrevious(newNode);
				current.setNext(newNode);
				newNode.setPrevious(current);			
			}
		}
	}
	
	public void printAll() {
		ListItem pointer = head;
		while (pointer != null) {
			System.out.println(pointer.val);
			pointer = pointer.getNext();
		}
	}
}




