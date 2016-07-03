
public class Driver {

	public static void main(String[] args) {
		

		
		Student[] student = new Student[6];
		student[0] = new Student("Adam Ant", "S935");
		student[1] = new Student("Bob", "S925");
		student[2] = new Student("Chevy Chase", "S935");
		student[3] = new Student("Doris Day", "S512");
		student[4] = new Student("Emilio Estevez", "S513");
		student[5] = new Student("Farrah Fawcet", "S516");
		
		Course myCourse = new Course("Media Studies", 5, 0);
		//myCourse.toString();
		myCourse.printRoster();
		
		myCourse.addStudent(student[0]);
		myCourse.addStudent(student[1]);
		myCourse.addStudent(student[2]);
		myCourse.addStudent(student[3]);
		myCourse.addStudent(student[4]);
		myCourse.addStudent(student[5]);
		// before dropping

		myCourse.printRoster();
		
		// after dropping
		myCourse.dropStudent(student[4]);
		myCourse.printRoster();
		
		// after adding a new student
		myCourse.addStudent(student[5]);
		myCourse.printRoster();
		
		
		
	}

}
