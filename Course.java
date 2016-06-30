
public class Course {
	
    private int currentEnrollment;
	private String courseName;	
	private int maxNumStudents;
	
	public Course(String courseName, int maxNumStudents){
		this.courseName = newcourseName;
		this.maxNumStudents = newmaxNumStudents;
		currentEnrollment =0;
	}
	
	public int getCurrentEnrollment(){
		return currentEnrollment;
	}
	public String getCourseName(){
		return courseName;
	}
	public int getMaxNumStudents(){
		return maxNumStudents;
	}
	public void setCourseName(String courseName){
		this.courseName = newcourseName;;
	}
	public void setMaxNumStudents(int maxNumStudents){
		this.maxNumStudents = newmaxNumStudents;
	}
	
	public String toString(){
		String s = courseName +", "+ maxNumStudents;
		return s;
	}
	
}
