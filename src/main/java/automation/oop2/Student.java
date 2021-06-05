package automation.oop2;

public class Student extends Person {

	private byte yearsOfStudy;
	private String classId;
	private String majorField;
	private int registrationNumber;

	public byte getYearsOfStudy() {
		return yearsOfStudy;
	}

	public void setYearsOfStudy(byte yearsOfStudy) {
		this.yearsOfStudy = yearsOfStudy;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getMajorField() {
		return majorField;
	}

	public void setMajorField(String majorField) {
		this.majorField = majorField;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

}
