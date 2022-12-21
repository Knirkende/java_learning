import java.time.LocalDate;

class Employee extends Worker {
	
	private long employeeId;
	private LocalDate hireDate;

	public Employee(String name, long employeeId, LocalDate birthDate, LocalDate hireDate) {
		super(name, birthDate);
		this.employeeId = employeeId;
		this.hireDate = hireDate;
	}
	
}