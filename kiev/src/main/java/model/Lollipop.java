package model;

/**
 * Entity of lollipop candy
 * Class Lollipop
 *
 * @version         1.0   12.11.2016
 * @author          Kosharny Mykola
 *
 */
public class Lollipop extends Sweet {
	// Specific variables
	private String color;
	
	/**
     * Empty constructor
     */
	public Lollipop(){}

	/**
	 * Constructor initialize base fields of new Lollipop
	 * @param name is name of sweet
	 * @param weight is name of sweet
	 * @param sugarContent quantity sugar in sweet
	 * @param color of Lollipop
	 */
	public Lollipop(String name, double weight, double sugarContent, String color) {
		super(name, weight, sugarContent);
		this.color = color;
	}
	
	public Lollipop(String name, double weight, double sugarContent) {
		super(name, weight, sugarContent);
		this.color = "green";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lollipop other = (Lollipop) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Lollipop: " + super.toString();
	}
}