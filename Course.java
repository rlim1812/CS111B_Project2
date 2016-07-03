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
		
		if (numStudentsInArray < maxNumStudents){
			roster[index] = s;
			index++;
			numStudentsInArray++;
			successfulAdd = true;
		} else {
			successfulAdd = false;
		}
		
		return successfulAdd;
	}
	
	//toString method
	public String toString(){
		String s = courseName +", "+ " class has a maximum number of " + maxNumStudents + " students." + "It currently has " + currentEnrollment + " students.";
		return s;
	}

}