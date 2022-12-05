package controller;

public abstract class AbstractController implements IController {
	@Override
	public void authenticate() {
		System.out.println("authenticating user");
	}
}
