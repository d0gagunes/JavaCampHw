
public class Main {

	public static void main(String[] args) {

    String[] courses={"Java", "C#", "Math"};
	 
	Instructor engin=new Instructor(1,"Engin", "Demirog", "1234@kodlama.io", courses);
	
	Student doga=new Student(1,"Doga","Gunes","dogagunes58@gmail.com", courses);
	
	InstructorManager instructorManager=new InstructorManager();
	instructorManager.Add(engin);
	
	StudentManager studentManager=new StudentManager();
	studentManager.Add(doga);
	
	
	

}
}
