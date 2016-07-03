/*
 * Ryan Lim
 * Kyaw Tun
 * Yu-Hsiang Huang
 * Anthony Wong
 * 
 */
public class Student {
	
		private String name;
		private String ID;
		private boolean checkPayment;
		
		public Student(String theName,String theID, boolean theCheckPayment)
		{
			name = theName;
			ID = theID;
			checkPayment = theCheckPayment;
		}
		// getters and setters
		public String getName() {
			return name;
		}
		public String getID(){
			return ID;
		}
		public boolean getCheckPayment(){
			return checkPayment;
		}
		public void setName(String newName)
		{
			name = newName;
		}
		public void setID(String newID)
		{
			name = newID;
		}
		public void setCheckPayment(boolean newCheckPayment) {
			checkPayment = newCheckPayment;
		}
		public String toString()
		{
			String b = name + " " + ID;
			return b;
		}
}
