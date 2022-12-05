import controller.StudentController;
import model.Librarian;
import model.Student;
import service.StudentService;
import service.SecondService;

public class Main {

	public static void main(String[] args) {		
		StudentController controller1 = new StudentController();
		Student student1 = new Student("wee", "1234");
		Librarian student2 = new Librarian("wee2", "6789");
		
		student1.onDuty();
		student2.onDuty();
		
		controller1.createStudent();
	}

}
