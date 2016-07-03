
import java.util.*;

public class Course {
	
	Scanner scan = new Scanner(System.in);
	
	//instance variables
	
	private Student[] roster;
	private String courseName;	
	private int currentEnrollment;
	private int maxNumStudents = 5;
	private int index;
	private int numStudentsInArray;
	
	//constructor
	public Course(String newCourseName, int newMaxNumStudents, int newCurrentEnrollment){
		courseName = newCourseName;
		if (newMaxNumStudents > 0){
			maxNumStudents = newMaxNumStudents;
		} 
		if (newCurrentEnrollment >= 0){
			currentEnrollment = newCurrentEnrollment;
		} 
		roster = new Student[newMaxNumStudents];
		index = 0;
		numStudentsInArray = 0;
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
		
		if (currentEnrollment< maxNumStudents){
			roster[index] = s;
			index++;
			currentEnrollment++;
			successfulAdd = true;
		} else {
			System.out.println(s.getName() + " cannot be added.");
			successfulAdd = false;

		}
		
		return successfulAdd;
	}
	public boolean dropStudent(Student s)
	{
		boolean successfulDrop = false;
		int drop_index = 0 ;
		for(int i = 0; i < currentEnrollment; i++)
		{
			if (roster[i] == s)
			{
				drop_index += i;
				currentEnrollment--;
				
				successfulDrop = true;
			}
		}
		for(int j = drop_index; j < currentEnrollment; j++)
		{
				roster[j] = roster[j+1];
		}
		roster[currentEnrollment] = null;
		index = currentEnrollment;
 		
		return successfulDrop;
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
			   System.out.println(roster[i].toString());
			   
		   }
		   
	}
	
	//toString method
	public String toString(){
		String s = courseName +", "+ " class has a maximum number of " + maxNumStudents + " students." + "It currently has " + currentEnrollment + " students.";
		return s;
	}

}