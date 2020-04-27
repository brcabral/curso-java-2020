package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public String isApproved() {
		if (finalGrade() > 60) {
			return "PASS";
		} else {
			return "FAILED";
		}
	}

	public double missingPoints() {
		double finalGrade = finalGrade();
		if (finalGrade < 60) {
			return 60 - finalGrade;
		} else {
			return 0;
		}
	}
}
