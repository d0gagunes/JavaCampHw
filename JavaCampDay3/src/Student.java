
public class Student extends User {
      
       String[] TakenCourses;
       
       public Student() {
    	   
       }
       public Student(int userId, String firstName,String lastName, String email, String[] TakenCourses) {
    	   super(userId, firstName,lastName, email);
    	   this.TakenCourses=TakenCourses;
       }

	public String[] getCourses() {
		return TakenCourses;
	}
	public void setCourses(String[] TakenCourses) {
		this.TakenCourses = TakenCourses;
	}
}
