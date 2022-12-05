package service;

import model.Student;

public class StudentService implements IService {
	public void getStudentDuty(Student student) {
		student.onDuty();
	}
	
	public void createStudent() {
		Student student1 = new Student("Wee", "123456");
		Student student2 = new Student("Weing Hwee", "567890");
		
		System.out.println("Creating first student: " + student1.toString());
		System.out.println("Creating second student: " + student2.toString());
	}
	
	@Override
	public void executeBusinessLogic() {
		System.out.println("executing first business logic");
	}
}
