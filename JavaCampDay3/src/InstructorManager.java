
public class InstructorManager {
	
	 public void Add(Instructor instructor) {
		   System.out.println("Egitmen sisteme eklenmistir.");
		   }
		   public void Delete(Instructor instructor) {
			   System.out.println("Egitmen sistemden silinmistir. ");
		   }
		   public void Update(Instructor instructor) {
			   System.out.println("Egitmen bilgileri guncellenmistir. ");
		   }
		   public void AddCourse(Instructor instructor) {
			   System.out.println("Derse egitmen olarak atanmistir.  ");
		   }
		   public void DeleteCourse(Instructor instructor) {
			   System.out.println("Ders egitmenliginden cikarilmistir.  ");
		   }
}
