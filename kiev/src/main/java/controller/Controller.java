package controller;

import model.NewYearsGift;
import view.View;

public class Controller {
	private NewYearsGift model;
	private View view;

	public Controller(NewYearsGift model, View view){
		this.model=model;
		this.view=view;
	}
	
	public void work(){
		view.outSweeties(model.getSweeties(), View.SWEETIES);
    	
    	view.outMessage(View.ALL_WEIGHT +  model.getWeight());
    	
    	view.outSweeties(model.sortSweetiesByName(), View.SORTING_BY_NAME);

    	view.outSweeties(model.findSweetBySugarContent(0.3, 0.7), "Search by sugar content, in range from 0.3 to 0.7:");
	}
}
