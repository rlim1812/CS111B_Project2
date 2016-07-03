/*
 * Ryan Lim
 * Kyaw Tun
 * Yu-Hsiang Huang
 * Anthony Wong
 * 
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
		//student[6] = new Student("Ethan", "S500", true);
		CourseAL myCourse = new CourseAL("Media Studies", 5, 0);
		//myCourse.toString();
		myCourse.printRoster();
		
		myCourse.addStudent(student[0]);
		myCourse.addStudent(student[1]);
		myCourse.addStudent(student[2]);
		myCourse.addStudent(student[3]);
		myCourse.addStudent(student[4]);
		myCourse.addStudent(student[5]);
		//myCourse.addStudent(student[6]);
		// before dropping

		myCourse.printRoster();
		
		// after dropping
		myCourse.dropStudent(student[1]);
		myCourse.printRoster();
		
		// after adding a new student
		myCourse.addStudent(student[5]);
		myCourse.printRoster();
		
		
		
	}

}
