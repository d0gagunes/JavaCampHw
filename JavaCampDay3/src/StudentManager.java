
public class StudentManager extends UserManager{
	
   public void Add(Student student) {
   System.out.println("Ogrenci sisteme eklenmistir.");
   }
   public void Delete(Student student) {
	   System.out.println("Ogrenci sistemden silinmistir. ");
   }
   public void Update(Student student) {
	   System.out.println("Ogrenci bilgileri guncellenmistir. ");
   }
   public void AddCourse(Student student) {
	   System.out.println("Ogrenci derse eklenmistir. ");
   }
   public void DeleteCourse(Student student) {
	   System.out.println("Ogrenci dersten silinmistir. ");
   }
} 
