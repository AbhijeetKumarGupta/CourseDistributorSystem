package CourseDistributor;

import java.util.ArrayList;

public class Convener extends FacultyMember {
	private int conId;
	private ArrayList<Course> course;
	private ArrayList<Lecturers> lecturer;
	private ArrayList<TAs> ta;

	public Convener() {

	}

	public Convener(int conId, ArrayList<Course> course, ArrayList<Lecturers> lecturer, ArrayList<TAs> ta) {
		super();
		this.conId = conId;
		this.course = course;
		this.lecturer = lecturer;
		this.ta = ta;
	}

	public int getConId() {
		return conId;
	}

	public void setConId(int conId) {
		this.conId = conId;
	}

	public ArrayList<Course> getCourseNotAssigned() {
		ArrayList<Course> tempCourse = new ArrayList<Course>();
		boolean allocate = false;


			for (int i = 0; i < this.course.size(); i++) {
				for (int j = 0; j < this.lecturer.size(); j++) {
					for (int k = 0; k < this.lecturer.get(j).getAssignedCourses().size(); k++) {
						if (this.course.get(i).getCourseCode() == this.lecturer.get(j).getAssignedCourses().get(k)
								.getCourseCode()) {
							allocate = true;
						}

					}
				}
				for (int jj = 0; jj < this.ta.size(); jj++) {
					for (int kk = 0; kk < this.ta.get(jj).getAssignedCourses().size(); kk++) {
						if (this.course.get(i).getCourseCode() == this.ta.get(jj).getAssignedCourses().get(kk).getCourseCode()) {
							allocate = true;
						}
					}
				}

				if (allocate == false) {
					tempCourse.add(this.course.get(i));
				}
				allocate = false;
			}
		return tempCourse;
	}
	
	public ArrayList<Course> getCourseAssigned() {
		ArrayList<Course> tempCourse = new ArrayList<Course>();
		boolean allocate = true;

			for (int i = 0; i < this.course.size(); i++) {
				for (int j = 0; j < this.lecturer.size(); j++) {
					for (int k = 0; k < this.lecturer.get(j).getAssignedCourses().size(); k++) {
						if (this.course.get(i).getCourseCode() != this.lecturer.get(j).getAssignedCourses().get(k)
								.getCourseCode()) {
							allocate = false;
						}

					}
				}
				for (int jj = 0; jj < this.ta.size(); jj++) {
					for (int kk = 0; kk < this.ta.get(jj).getAssignedCourses().size(); kk++) {
						if (this.course.get(i).getCourseCode() != this.ta.get(jj).getAssignedCourses().get(kk).getCourseCode()) {
							allocate = false;
						}
					}
				}

				if (allocate == true) {
					tempCourse.add(this.course.get(i));
				}
				allocate = true;
			}

		return tempCourse;
	}

	public ArrayList<Course> getCourse(){
		
		return this.course;
	}
	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}

	public ArrayList<Lecturers> getLecturer() {
		return lecturer;
	}

	public void setLecturer(ArrayList<Lecturers> lecturer) {
		this.lecturer = lecturer;
	}

	public ArrayList<TAs> getTa() {
		return ta;
	}

	public void setTa(ArrayList<TAs> ta) {
		this.ta = ta;
	}

	public void allocateCourse(int courseId, int lectId) {
		this.getLecturer().get(lectId-1).setAssignedCourses(this.course.get(courseId-1));
	}

	public void dropCourse(int courseCode) {
		this.course.remove(courseCode-1);
	}

}
