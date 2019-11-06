package exercise1;

public abstract class Employee {
	private final String name;
	private int workedHours = 0;
	private int sales;

	protected Employee(String name){
		this.name = name;
	}
	public abstract int computeSalary();

	public void sell() {
		sales ++;
	}

	public void workOneHour() {
		this.workedHours += 1;
	}
	public int getWorkedHours() {
		return workedHours;
	}
	public String getName() {
		return name;
	}
}
