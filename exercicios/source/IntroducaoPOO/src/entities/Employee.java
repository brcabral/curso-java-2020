package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		this.grossSalary = grossSalary * (1 + (percentage / 100));
	}
}
