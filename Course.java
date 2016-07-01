package Project2;
import java.util.*;

public class Course {
	
	Scanner scan = new Scanner(System.in);
	
	//instance variables
	
	private Student[] students;
	private String courseName;	
	private int currentEnrollment;
	private int maxNumStudents;
	
	//constructor
	public Course(String newCourseName, int newMaxNumStudents, int newCurrentEnrollment){
		courseName = newCourseName;
		if (newMaxNumStudents > 0){
			maxNumStudents = newMaxNumStudents;
		} else{
			while (newMaxNumStudents <= 0){
				System.out.println("Error. The maximum number of students must be a positive integer. Enter in a positive integer: ");
				newMaxNumStudents = scan.nextInt();
			}
			maxNumStudents = newMaxNumStudents;
		}
		if (newCurrentEnrollment >= 0){
			currentEnrollment = newCurrentEnrollment;
		} else {
			while (newCurrentEnrollment < 0){
				System.out.println("Error. The current number of students must be greater than equal to zero. Enter in a number greater than or equal to zero.");
				newCurrentEnrollment = scan.nextInt();
			}
			currentEnrollment = newCurrentEnrollment;
		}
		students = new Student[newMaxNumStudents];
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
		} else{
			while (newMaxNumStudents <= 0){
				System.out.println("Error. The maximum number of students must be a positive integer. Enter in a positive integer: ");
				newMaxNumStudents = scan.nextInt();
			}
			maxNumStudents = newMaxNumStudents;
		}
	}
	public void setCurrentEnrollment(int newCurrentEnrollment){
		if (newCurrentEnrollment >= 0){
			currentEnrollment = newCurrentEnrollment;
		} else {
			while (newCurrentEnrollment < 0){
				System.out.println("Error. The current number of students must be greater than equal to zero. Enter in a number greater than or equal to zero.");
				newCurrentEnrollment = scan.nextInt();
			}
			currentEnrollment = newCurrentEnrollment;
		}
	}
	
	//toString method
	public String toString(){
		String s = courseName +", "+ " class has a maximum number of " + maxNumStudents + " students." + "It currently has " + currentEnrollment + " students.";
		return s;
	}
	
	public static void main (String[] args){
		
		for (int i = 1; i <= 100; i++){

		    if (i % 5 == 0) {

		        System.out.println(i);

		    }

		}
	}
}
