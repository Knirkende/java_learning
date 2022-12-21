import java.time.LocalDate;

class Main {
	public static void main(String[] args) {
		SalariedEmployee emp = new SalariedEmployee("Lollesen", 12345, LocalDate.now(), LocalDate.now());
		System.out.println(emp.getAge());
	}
}