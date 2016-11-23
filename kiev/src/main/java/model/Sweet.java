package model;

/**
 * Abstract class of all child sweet
 * Class Sweet
 *
 * @version         1.0   12.11.2016
 * @author          Kosharny Mykola
 *
 */
public abstract class Sweet {
	
	/**
	 * Name of sweet
	 */
	private String name;
	
	/**
	 * Weight of sweet
	 */
    private double weight;
    
    /**
     * Percent of sugar in sweet
     */
	private double sugarContent;
	
	/**
     * Empty constructor
     */
	public Sweet(){}

	/**
	 * Constructor initialize base fields of new sweet
	 * @param name is name of sweet
	 * @param weight is name of sweet
	 * @param sugarContent quantity sugar in sweet
	 */
	public Sweet(String name, double weight, double sugarContent) {
		this.name = name;
		this.weight = weight;
		this.sugarContent = sugarContent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(double sugarContent) {
		this.sugarContent = sugarContent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sugarContent);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweet other = (Sweet) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(sugarContent) != Double.doubleToLongBits(other.sugarContent))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "name=" + name + ", weight=" + weight + ", sugarContent=" + sugarContent;
	}
	
	
	
}