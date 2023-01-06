
public class MyTest {
	public static void main(String[] args) {
		Item a = new NumericItem(3);
		System.out.println(a.val);
	}
}

abstract class Item {
	public Object val;
	
	public Item(Object val) {
		this.val = val;
	}
}

class NumericItem extends Item {
	
	public NumericItem(int val) {
		super(val);
	}
}