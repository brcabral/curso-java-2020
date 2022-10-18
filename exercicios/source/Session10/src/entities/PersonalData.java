package entities;

public class PersonalData {
	private Double height;
	private String gender;

	public PersonalData(Double height, String gender) {
		super();
		this.height = height;
		this.gender = gender;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
