package CourseDistributor;

import java.util.ArrayList;

public class Lecturers extends FacultyMember {
	private int maximumNumberOfCourses = 3;
	private int quotaOfCreditHours = 30;
	private ArrayList<Course> assignedCourses;
	

	public Lecturers(int facultyID, String firstName, String lastName, int academicRank, String academicSpecialization,
			Course assignedCourse) {
		super(facultyID, firstName, lastName, academicRank, academicSpecialization);
		assignedCourses = new ArrayList<Course>();
		this.assignedCourses.add(assignedCourse);
	}
	
	public Lecturers(int facultyID, String firstName, String lastName, int academicRank, String academicSpecialization,
			ArrayList<Course> assignedCourses) {
		super(facultyID, firstName, lastName, academicRank, academicSpecialization);
		this.assignedCourses = assignedCourses;
	}
	
	public int getMaximumNumberOfCourses() {
		return maximumNumberOfCourses;
	}
	public void setMaximumNumberOfCourses(int maximumNumberOfCourses) {
		this.maximumNumberOfCourses = maximumNumberOfCourses;
	}
	public int getQuotaOfCreditHours() {
		return quotaOfCreditHours;
	}
	public void setQuotaOfCreditHours(int quotaOfCreditHours) {
		this.quotaOfCreditHours = quotaOfCreditHours;
	}
	public ArrayList<Course> getAssignedCourses() {
		return assignedCourses;
	}
	public void setAssignedCourses(Course assignedCourse) {
		this.assignedCourses.add(assignedCourse);
	}

	@Override
	public String toString() {
		return "Lecturers [maximumNumberOfCourses=" + maximumNumberOfCourses + ", quotaOfCreditHours="
				+ quotaOfCreditHours + ", assignedCourses=" + assignedCourses + ", getFacultyID()=" + getFacultyID()
				+ "]";
	}

	
}
