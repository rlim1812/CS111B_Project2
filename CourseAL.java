/*
 * Ryan Lim
 * Kyaw Tun
 * Yu-Hsiang Huang
 * Anthony Wong
 * 
 */

import java.util.*;

public class CourseAL {
	
	Scanner scan = new Scanner(System.in);
	
	//instance variables
	private ArrayList<Student> rosterlist;
	//private Student[] roster;
	private String courseName;	
	private int currentEnrollment;
	private int maxNumStudents;
	private int index;
	private int numStudentsInArray;
	
	//constructor
	public CourseAL(String newCourseName, int newMaxNumStudents, int newCurrentEnrollment){
		courseName = newCourseName;
		if (newMaxNumStudents > 0){
			maxNumStudents = newMaxNumStudents;
		} 
		if (newCurrentEnrollment >= 0){
			currentEnrollment = newCurrentEnrollment;
		} 
		rosterlist = new ArrayList<Student>();
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
			rosterlist.add(s);
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
		if(rosterlist.contains(s))
		{
			rosterlist.remove(s);
			currentEnrollment--;
			successfulDrop = true;
		}
		else
			System.out.println("Item not found.");

 		
		return successfulDrop;
	}
	public void printRoster(){
		   
		   //print out number of students enrolled
		   System.out.println("There are " + currentEnrollment + " students currently enrolled in the class");
		   if(currentEnrollment == 0)
		   {
		        System.out.println("Error. There is no student enrolled yet.");    
		   }
		   else
		   {
			   for(Student item: rosterlist)
				   System.out.println(item.toString());
		   }
		   //check if there are no students
		   
		   
		   //print out text representation of each of the student objects
		   
		   
	}
	
	//toString method
	public String toString(){
		String s = courseName +", "+ " class has a maximum number of " + maxNumStudents + " students." + "It currently has " + currentEnrollment + " students.";
		return s;
	}

}

