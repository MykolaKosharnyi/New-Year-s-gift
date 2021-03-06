package model;

import java.util.Arrays;
import java.util.List;

public class SweetiesInitializator {
	public static List<Sweet> getSweeties() {
		return Arrays.asList(
				new Lollipop("l3", 500, 0.5), 
				new Lollipop("l2", 700, 0.9), 
				new Lollipop("l1", 100, 0.1),
				new Chocolate("c3", 800, 0.8), 
				new Chocolate("c1", 200, 0.4), 
				new Chocolate("c2", 300, 0.3)
			);
	}
}
