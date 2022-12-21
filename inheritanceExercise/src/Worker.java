import java.time.LocalDate;

class Worker {
	public String name;
	private LocalDate birthDate;
	private LocalDate endDate;
	
	public Worker(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public int getAge() {
		return LocalDate.now().getYear() - birthDate.getYear();
	}
	
	public double collectPay() {
		return -1;
	}
	
	public void terminate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}
	
}