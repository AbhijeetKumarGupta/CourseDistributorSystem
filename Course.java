package CourseDistributor;

public class Course {
	private int courseCode;
	private String courseName;
	private int creditHours;

	public Course(int courseCode, String courseName, int creditHours) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.creditHours = creditHours;
	}

	public int getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseName=" + courseName + ", creditHours=" + creditHours + "]";
	}

	
}
