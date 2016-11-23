package main;

import controller.Controller;
import model.NewYearsGift;
import view.View;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller(new NewYearsGift(), new View() );
		controller.work();
	}

}
