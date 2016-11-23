package view;

import java.util.List;

import model.Sweet;

public class View {
	
	public static final String SWEETIES = "Sweeties:";
	public static final String ALL_WEIGHT = "All weight:";
	public static final String SORTING_BY_NAME = "After sorting by name:";
	
	public void outMessage(String message){
		System.out.println();
		System.out.println(message);
	}
	
	public void outSweeties(List<Sweet> sweeties, String message){
		System.out.println();
    	System.out.println(message);
    	for(Sweet s : sweeties){
    		System.out.println(s);
    	}
	}
}
