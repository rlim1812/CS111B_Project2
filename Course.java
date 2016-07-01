/*
 * Phyo Khine
 * CS 111B (Online)
 * 
 */
public class Course {
	private String courseName;
	private int maxStudents;
	private Student[] roster;
	private int studentEnrolled;
	
	// Constructor
	public Course(String theCourseName, int theMaxStudents) {
		courseName = theCourseName;
		maxStudents = theMaxStudents;
		roster = new Student[maxStudents];
		studentEnrolled = 0;
	}
	
	// Get the number of student enrolled
	public int getStudentEnrolled() {
		return studentEnrolled;
	}
	
	// Set the number of student enrolled
	public void setStudentEnrolled(int theStudentEnrolled) {
		studentEnrolled = theStudentEnrolled;
	}
	
	// Get course name
	public String getCourseName() {
		return courseName;
	}
	// Set course name
	public void setCourseName(String theCourseName) {
		courseName = theCourseName;
	}
	
	// Get maximum students the course can hold
	public int getMaxStudents() {
		return maxStudents;
	}
	
	// Set maximum students the course can hold
	public void setMaxStudents(int theMaxStudents) {
		maxStudents = theMaxStudents;
	}
	
	// toString method
	public String toString() {
		String s = courseName + " ( " + maxStudents + " student capacity )";
		return s;
	}
	
	// Get the roster
	public Student[] getRoster() {
		return roster;
	}
	// Set the roster
	public void setRoster(Student[] theRoster) {
		roster = theRoster;
	}
	
	/* This method is for adding students and returning true when there is room for that student
	 * 
	 * @param s for each student object
	 * @return true when added, otherwise false
	 */
	public boolean addStudent(Student s) {
		boolean boool = false;
		if (studentEnrolled < roster.length) {
			if (roster[studentEnrolled] == null) {
				roster[studentEnrolled] = s;
				boool = true;
				studentEnrolled++;
			} 
		} else {
				System.out.println( s.toString() + " cannot be added.");
				System.out.println("  ");
				boool = false;
		}
		
		return boool;
	}
		
	
	/* This method is for removing student 
	 * 
	 * @param s to hold each student object
	 * @return true when a student is removed, otherwise false
	 */
	public boolean dropStudent(Student s) {
		boolean bool = true;
		for(int i = 0; i < roster.length; i++) {
			if (roster[i] == s) { 
				//roster[i] = null;
				for(int j = i; j < roster.length-1; j++) {
					roster[j] = roster[j+1];
				}
				roster[roster.length-1] = null;
				studentEnrolled--;
				bool = true;
			} else {
				bool = false;
			}
		}
		return bool;
	}
	
	 /* printRoster method is to print the roster, describing the number of students enrolled
	  * and the name of each student with his/her id
	  * 
	  */
	public void printRoster() {
		if(studentEnrolled == 0) {
			System.out.println("--No Student Enrolled--");
			System.out.println(" ");
		} else {
			System.out.println("Enrollment: " + studentEnrolled);
			for(int i = 0; i < roster.length; i++) {
				if(roster[i] != null) {
					System.out.println(roster[i].toString());
				}	
			}
			System.out.println(" ");
		}
	}
}

