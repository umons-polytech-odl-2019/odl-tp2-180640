package exercise1;

public class FixedSalaryEmployee extends Employee {

	private int salary = 0 ;

	public FixedSalaryEmployee(String name, int fixedSalary) {
		super(name);
		this.salary = fixedSalary;
	}

	public void workOneHour() {
		super.workOneHour();
	}

	public int computeSalary(){
		return this.salary;
	}
}
