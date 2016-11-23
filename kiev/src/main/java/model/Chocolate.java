package model;

/**
 * Entity of chocolate candy
 * Class Chocolate
 *
 * @version         1.0   12.11.2016
 * @author          Kosharny Mykola
 *
 */
public class Chocolate extends Sweet {
	
	public Chocolate(){}
	
	public Chocolate(String name, double weight, double sugarContent){
		super(name, weight, sugarContent);
	}

	@Override
	public String toString() {
		return "Chocolate: " + super.toString();
	}
	
	
}