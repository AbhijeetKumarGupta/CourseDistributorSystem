package CourseDistributor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int menu, id;
		
		ArrayList<Convener> convSet = new ArrayList<Convener>();
		
		ArrayList<Course> courSet1 = new ArrayList<Course>();
		ArrayList<Course> courSet2 = new ArrayList<Course>();
		ArrayList<Course> courSet3 = new ArrayList<Course>();
		ArrayList<Course> courSet4 = new ArrayList<Course>();
		ArrayList<Course> courSet5 = new ArrayList<Course>();
		
		ArrayList<Lecturers> lectSet1 = new ArrayList<Lecturers>();
		ArrayList<Lecturers> lectSet2 = new ArrayList<Lecturers>();
		ArrayList<Lecturers> lectSet3 = new ArrayList<Lecturers>();
		ArrayList<Lecturers> lectSet4 = new ArrayList<Lecturers>();
		ArrayList<Lecturers> lectSet5 = new ArrayList<Lecturers>();
		
		ArrayList<TAs> taSet1 = new ArrayList<TAs>();
		ArrayList<TAs> taSet2 = new ArrayList<TAs>();
		ArrayList<TAs> taSet3 = new ArrayList<TAs>();
		ArrayList<TAs> taSet4 = new ArrayList<TAs>();
		ArrayList<TAs> taSet5 = new ArrayList<TAs>();

		
		Course c1 = new Course(1, "A", 10);
		Course c2 = new Course(2, "B", 10);
		Course c3 = new Course(3, "C", 10);
		Course c4 = new Course(4, "D", 10);
		Course c5 = new Course(5, "E", 10);
		Course c6 = new Course(6, "F", 10);
		Course c7 = new Course(7, "G", 10);
		Course c8 = new Course(8, "H", 10);
		Course c9 = new Course(9, "I", 10);
		Course c10 = new Course(10, "J", 10);
		Course c11 = new Course(11, "K", 10);
		Course c12 = new Course(12, "L", 10);
		Course c13 = new Course(13, "M", 10);
		Course c14 = new Course(14, "N", 10);
		Course c15 = new Course(15, "O", 10);
		Course c16 = new Course(16, "P", 10);
		
		Lecturers lect1 = new Lecturers(1, "s", "b", 1, "J",c7);
		Lecturers lect2 = new Lecturers(2, "t", "d", 2, "K",c8);
		Lecturers lect3 = new Lecturers(3, "u", "f", 3, "L",c9);
		Lecturers lect4 = new Lecturers(4, "v", "h", 4, "M",c10);
		Lecturers lect5 = new Lecturers(5, "w", "j", 5, "N",c11);
		Lecturers lect6 = new Lecturers(6, "w", "j", 5, "N",c12);
		Lecturers lect7 = new Lecturers(7, "w", "j", 5, "N",c13);
		
		TAs ta1 = new TAs(1, "a", "b", 1, "A",c1);
		TAs ta2 = new TAs(2, "c", "d", 2, "B",c14);
		TAs ta3 = new TAs(3, "e", "f", 3, "C",c3);
		TAs ta4 = new TAs(4, "g", "h", 4, "D",c4);
		TAs ta5 = new TAs(5, "i", "j", 5, "E",c5);
		TAs ta6 = new TAs(6, "k", "l", 6, "F",c6);
		
		convSet.add(new Convener(1,courSet1, lectSet1, taSet1));
		convSet.add(new Convener(2,courSet2, lectSet2, taSet2));
		convSet.add(new Convener(3,courSet3, lectSet3, taSet3));
		convSet.add(new Convener(4,courSet4, lectSet4, taSet4));
		convSet.add(new Convener(5,courSet5, lectSet5, taSet5));
		
		courSet1.add(c1);
		courSet1.add(c2);
		courSet1.add(c3);
		courSet2.add(c4);
		courSet2.add(c5);
		courSet2.add(c6);
		courSet3.add(c7);
		courSet3.add(c8);
		courSet3.add(c9);
		courSet3.add(c10);
		courSet4.add(c11);
		courSet4.add(c12);
		courSet4.add(c13);
		courSet5.add(c14);
		courSet5.add(c15);
		courSet5.add(c16);
		
		lectSet1.add(lect1);
		lectSet2.add(lect2);
		lectSet3.add(lect3);
		lectSet4.add(lect4);
		lectSet5.add(lect5);
		lectSet1.add(lect6);
		lectSet2.add(lect7);
		
		taSet1.add(ta1);
		taSet2.add(ta2);
		taSet3.add(ta3);
		taSet4.add(ta4);
		taSet5.add(ta5);
		taSet5.add(ta6);
		
	
		

		// Menu
		System.out.println("Select the user type -");
		System.out.println("1] Convener");
		System.out.println("2] Lecturer");
		System.out.println("3] TA(Teaching Assistant)");
		menu = scan.nextInt();

		if (menu == 1) {
			System.out.println("Enter your ID : ");
			id = scan.nextInt();
			System.out.println("1] Allocate Course");
			System.out.println("2] Drop Course");
			System.out.println("3] Print a report");

			menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("Lecturers -");
				System.out.println(convSet.get(id-1).getLecturer());
				System.out.println("TAs -");
				System.out.println(convSet.get(id-1).getTa());
				System.out.println("Courses -");
				System.out.println(convSet.get(id-1).getCourseNotAssigned());
				
				System.out.println("Enter the course code to be allocated :");
				int cc = scan.nextInt();
				System.out.println("Enter the Lecturar Id to be allocated :");
				int lid = scan.nextInt();
				convSet.get(id-1).allocateCourse(cc, lid);
				System.out.println(convSet.get(id-1).getLecturer());
			} else if (menu == 2) {
				System.out.println("Courses -");
				System.out.println(convSet.get(id-1).getCourseAssigned());
				System.out.println("Enter the course code to drop : ");
				convSet.get(id-1).dropCourse(scan.nextInt());
				System.out.println(convSet.get(id-1).getCourseAssigned());
			} else if (menu == 3) {
				
				System.out.println("All the courses : -");
				System.out.println(convSet.get(id-1).getCourse());
				System.out.println("All lecturers : -");
				System.out.println(convSet.get(id-1).getLecturer());
				System.out.println("All ta : -");
				System.out.println(convSet.get(id-1).getTa());
				System.out.println("All allocated courses : -");
				System.out.println(convSet.get(id-1).getCourseAssigned());
				System.out.println("All non allocated courses : -");
				System.out.println(convSet.get(id-1).getCourseNotAssigned());

			}

		} else if (menu == 2) {
			System.out.print("Enter your ID : ");
			id = scan.nextInt();
			
			for(int i = 0; i< convSet.size(); i++) {
				for(int j = 0; j < convSet.get(i).getLecturer().size(); j++) {
					if(id == convSet.get(i).getLecturer().get(j).getFacultyID()) {
						System.out.println(convSet.get(i).getLecturer().get(j).toString());
					}
				}
			}

		} else if (menu == 3) {
			System.out.print("Enter your ID : ");
			id = scan.nextInt();

			for(int i = 0; i< convSet.size(); i++) {
				for(int j = 0; j < convSet.get(i).getTa().size(); j++) {
					if(id == convSet.get(i).getTa().get(j).getFacultyID()) {
						System.out.println(convSet.get(i).getTa().get(j).toString());
					}
				}
			}
		}

		scan.close();

	}

}
