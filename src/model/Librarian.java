package model;

public class Librarian extends Student {

	public Librarian(String name, String phone) {
		super(name, phone);
	}
	
	@Override
	public void onDuty() {
		super.onDuty();
		System.out.println("Carrying out duty as Librarian");
	}
	
	public void onDuty(String level) {
		System.out.println("Carrying out duty as Librarian on level " + level);
	}
}
