import java.time.LocalDate;

class SalariedEmployee extends Employee {
	
	private double annualSalary;
	private boolean isRetired = false;

	public SalariedEmployee(String name, long employeeId, LocalDate birthDate, LocalDate hireDate) {
		super(name, employeeId, birthDate, hireDate);
	}
	
	public void retire() {
		terminate(LocalDate.now());
		this.isRetired = true;
	}
}