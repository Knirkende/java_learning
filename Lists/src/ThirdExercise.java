import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {	
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() != this.getClass()) {
			return false;
		}
		final Customer other = (Customer) obj;
		return other.name == this.name;
	}
}

class Bank {
	private ArrayList<Customer> customers;
	
	public void addCustomer(Customer customer) {
		if (customers == null) {
			customers = new ArrayList<Customer>();
			customers.add(customer);
		} else if (!customers.contains(customer)) {
			customers.add(customer);
		}
	}
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
}

public class ThirdExercise {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Customer one = new Customer("Lol", new ArrayList<Double>());
		Customer two = new Customer("Lolle", new ArrayList<Double>());
		
		bank.addCustomer(one);
		bank.addCustomer(two);
		System.out.println(bank.getCustomers());
		
	}
}
