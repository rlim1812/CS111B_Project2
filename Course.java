package Project2;
import java.util.*;

public class Course {
	
	Scanner scan = new Scanner(System.in);
	
	//instance variables
	
	private Student[] roster;
	private String courseName;	
	private int currentEnrollment;
	private int maxNumStudents;
	private int index;
	
	//constructor
	public Course(String initialCourseName, int initialMaxNumStudents, int initialCurrentEnrollment){
		courseName = initialCourseName;
		if (initialMaxNumStudents > 0){
			maxNumStudents = initialMaxNumStudents;
		} 
		if (initialCurrentEnrollment >= 0){
			currentEnrollment = initialCurrentEnrollment;
		} 
		roster = new Student[initialMaxNumStudents];
		index = 0;
	}
	
	//getters and setters
	public String getCourseName(){
		return courseName;
	}
	public int getMaxNumStudents(){
		return maxNumStudents;
	}
	public int getCurrentEnrollment(){
		return currentEnrollment;
	}
	
	public void setCourseName(String newCourseName){
		courseName = newCourseName;;
	}
	public void setMaxNumStudents(int newMaxNumStudents){
		if (newMaxNumStudents > 0){
			maxNumStudents = newMaxNumStudents;
		}
	}
	public void setCurrentEnrollment(int newCurrentEnrollment){
		if (newCurrentEnrollment >= 0){
			currentEnrollment = newCurrentEnrollment;
		}
	}
	
	public boolean addStudent (Student s){
		boolean successfulAdd;
		
		if (currentEnrollment < maxNumStudents){
			roster[index] = s;
			index++;
			currentEnrollment++;
			successfulAdd = true;
		} else {
			successfulAdd = false;
		}
		
		return successfulAdd;
	}
	
	public void printRoster(){
		   
		   //print out number of students enrolled
		   System.out.println("There are " + currentEnrollment + " students currently enrolled in the class");
		   
		   //check if there are no students
		   if(currentEnrollment == 0)
		   {
		        System.out.println("Error. There is no student enrolled yet.");    
		   }
		   
		   //print out text representation of each of the student objects
		   for (int i = 0; i < currentEnrollment; i++){
			   System.out.print(roster[i].toString());
		   }
		   
	}
	
	//toString method
	public String toString(){
		String s = courseName +", "+ " class has a maximum number of " + maxNumStudents + " students." + "It currently has " + currentEnrollment + " students.";
		return s;
	}

}