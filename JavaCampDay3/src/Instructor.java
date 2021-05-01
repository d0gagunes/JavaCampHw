
public class Instructor extends User{
  String[] lessons;
  
  public Instructor() {
	  
  }
  
  public Instructor(int userId, String firstName,String lastName,String email, String[] lessons) {
	  super(userId, firstName, lastName, email);
	  this.lessons=lessons;
  }

public String[] getLessons() {
	return lessons;
}

public void setLessons(String[] lessons) {
	this.lessons = lessons;
}
}
