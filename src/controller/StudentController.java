package controller;

import service.StudentService;
import service.IService;

public class StudentController extends AbstractController {
	private StudentService businessService;
	
	public StudentController() {
		this.businessService = new StudentService();
	}
	
	@Override
	public void log() {
		System.out.println("logging info");
	}

	@Override
	public void getConfig() {
		System.out.println("getting configuration");
	}
	
	public void invoke() {
		businessService.executeBusinessLogic();	
	}
	
	public void createStudent() {
		businessService.createStudent();
	}
}
