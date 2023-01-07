
public class ExerciseTwo {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList(null);
		list.addItem(new Node("a"));
		list.addItem(new Node("c"));
		list.addItem(new Node("b"));
		list.addItem(new Node("d"));
		list.removeItem("b");
		list.traverse();
	}
}

abstract class LiItem {
	protected LiItem rightLink = null;
	protected LiItem leftLink = null;
	
	protected Object value;
	
	public LiItem (Object value) {
		this.value = value;
	}
	
	abstract LiItem next();
	abstract LiItem setNext(LiItem item);
	abstract LiItem previous();
	abstract LiItem setPrevious(LiItem item);
	
	abstract int compareTo(LiItem item);

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}	
}

class Node extends LiItem {

	public Node(Object value) {
		super(value);
	}

	@Override
	LiItem next() {
		return this.rightLink;
	}

	@Override
	LiItem setNext(LiItem item) {
		this.rightLink = item;
		return this.rightLink;
	}

	@Override
	LiItem previous() {
		return this.leftLink;
	}

	@Override
	LiItem setPrevious(LiItem item) {
		this.leftLink = item;
		return this.leftLink;
	}

	@Override
	int compareTo(LiItem item) {
		if (item != null) {
			return ((String) super.getValue())
					.compareTo((String) item.getValue());
		} else {
			return -1;
		}
	}	
}

interface NodeList {
	LiItem getRoot();
	boolean addItem(LiItem item);
	boolean removeItem(Object value);
	void traverse(LiItem root);	
}

class MyLinkedList implements NodeList {
	private LiItem root = null;

	public MyLinkedList(LiItem root) {
		super();
		this.root = root;
	}

	@Override
	public LiItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(LiItem item) {
		if (this.root == null) {
			this.root = item;
			return true;
		}
		
		LiItem currentItem = this.root;
		
		while(currentItem != null) {
			int comparison = (currentItem.compareTo(item));
			if (comparison < 0) {
				if(currentItem.next() != null) {
					currentItem = currentItem.next();
				} else {
					currentItem.setNext(item);
					item.setPrevious(currentItem);
					return true;
				}
			} else if (comparison > 0) {
				if(currentItem.previous() != null) {
					currentItem.previous().setNext(item);
					item.setPrevious(currentItem.previous());
					item.setNext(currentItem);
					currentItem.setPrevious(item);
					return true;
				} else {
					item.setNext(this.root);
					this.root.setPrevious(item);
					this.root = item;
					return true;
				}
			} else {
				return false;
			}
		}	
		return false;
	}

	@Override
	public boolean removeItem(Object value) {
		Node item = new Node(value);
		LiItem currentItem = this.root;
		while(currentItem != null) {
			if (currentItem.compareTo(item) == 0) {
				if (currentItem.previous() == null) {
					this.root = currentItem.next();
					return true;
				} else if (currentItem.next() == null) {
					currentItem.previous().setNext(null);
					return true;
				} else {
					LiItem prev = currentItem.previous();
					currentItem.next().setPrevious(prev);
					prev.setNext(currentItem.next());
					return true;					
				}
			} else if (currentItem.compareTo(item) < 0) {
				currentItem = currentItem.next();
			} else {
				return false;
			}
		}
		
		return false;
	}
	
	public void traverse() {
		traverse(this.getRoot());
	}
	
	@Override
	public void traverse(LiItem root) {
		if (root == null) {
			System.out.println("End of list.");
		} else {
			System.out.println(root.getValue());
			traverse(root.next());
		}		
	}
		
}