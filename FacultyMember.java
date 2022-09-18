package CourseDistributor;

public class FacultyMember {
	private int FacultyID;
	private String firstName;
	private String lastName;
	private int academicRank;
	private String academicSpecialization;
	
	public FacultyMember() {
		
	}
	
	public FacultyMember(int facultyID, String firstName, String lastName, int academicRank,
			String academicSpecialization) {
		super();
		FacultyID = facultyID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.academicRank = academicRank;
		this.academicSpecialization = academicSpecialization;
	}
	
	public int getFacultyID() {
		return FacultyID;
	}
	public void setFacultyID(int facultyID) {
		FacultyID = facultyID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAcademicRank() {
		return academicRank;
	}
	public void setAcademicRank(int academicRank) {
		this.academicRank = academicRank;
	}
	public String getAcademicSpecialization() {
		return academicSpecialization;
	}
	public void setAcademicSpecialization(String academicSpecialization) {
		this.academicSpecialization = academicSpecialization;
	}
	@Override
	public String toString() {
		return "FacultyMember [FacultyID=" + FacultyID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", academicRank=" + academicRank + ", academicSpecialization=" + academicSpecialization + "]";
	}
}
