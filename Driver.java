/*
 * Ryan Lim
 * Kyaw Tun
 * Yu-Hsiang Huang
 * Anthony Wong
 * 
 * our program is currently running with CourseAL
 */
public class Driver {

	public static void main(String[] args) {
		
		Student[] student = new Student[6];
		student[0] = new Student("Adam Ant", "S935", true);
		student[1] = new Student("Bob", "S925", true);
		student[2] = new Student("Chevy Chase", "S935", true);
		student[3] = new Student("Doris Day", "S512", true);
		student[4] = new Student("Emilio Estevez", "S513", true);
		student[5] = new Student("Farrah Fawcet", "S516", true);
		
		CourseAL myCourse = new CourseAL("Media Studies", 5, 0);
		
		// prints the course
		System.out.println(myCourse.toString());
		System.out.println("");
		
		// prints the roster
		myCourse.printRoster();
		System.out.println("");
		
		myCourse.addStudent(student[0]);
		myCourse.addStudent(student[1]);
		myCourse.addStudent(student[2]);
		myCourse.addStudent(student[3]);
		myCourse.addStudent(student[4]);
		
		// trying to add the 6th student but it will be an error message.
		myCourse.addStudent(student[5]);
		
		//print the roster before dropping one student
		myCourse.printRoster();
		System.out.println("");
		
		//print the roster again after dropping the student
		myCourse.dropStudent(student[2]);
		myCourse.printRoster();
		System.out.println("");
		
		// print after adding a new student
		myCourse.addStudent(student[5]);
		myCourse.printRoster();
		
		
		
	}

}
