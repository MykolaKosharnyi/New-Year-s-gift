package model;

import java.util.List;
import java.util.stream.Collectors;

/**
 * New Year's Gift which content sweeties
 * @author		nikolay
 * @version		1.0		12.11.2016
 *
 */
public class NewYearsGift {

	/**
	 * Name of gift
	 */
	private String name;
	
	/**
	 * All sweeties in New Year's Gift
	 */
	private List<Sweet> sweeties;
	
	/**
     * Empty constructor
     */
	public NewYearsGift(){
		this.name = "Standart New Year's Gift";
		this.sweeties = SweetiesInitializator.getSweeties();
	}

	/**
	 * Constructor initialize base fields of New Year's Gift
	 * @param name sweet name
	 * @param sweeties list of sweeties in gift
	 */
	public NewYearsGift(String name, List<Sweet> sweeties) {
		this.name = name;
		this.sweeties = sweeties;
	}

	/**
	 * 
	 * @return all weight of New Year Gift
	 */
	public double getWeight(){
		return sweeties.stream().reduce( 0., (sum, p) -> sum += p.getWeight(), (sum1, sum2) -> sum1 + sum2);
	}
	
	/**
	 * This method sort input array by name
	 * @param sweeties that need to sort by name
	 */
	public List<Sweet> sortSweetiesByName(/*List<Sweet> sweeties*/){
		return sweeties
			        .stream()
			        .sorted((s1, s2) ->  s1.getName().compareTo(s2.getName()) )
			        .collect(Collectors.toList());
	}
	
	/**
	 * 
	 * Method find sweeties in sugar content range.
	 * 
	 * @param sweeties from which we need to get sweeties
	 * @param lowLevel low level of sugar content
	 * @param topLevel height level of sugar content
	 * @return sweeties which content needed level of sugar in sweet
	 */
	public List<Sweet> findSweetBySugarContent(double lowLevel, double topLevel){
		
		return sweeties
        .stream()
        .filter( s -> s.getSugarContent() > lowLevel && s.getSugarContent() < topLevel )
        .collect(Collectors.toList());

	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sweeties == null) ? 0 : sweeties.hashCode());
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
		NewYearsGift other = (NewYearsGift) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sweeties == null) {
			if (other.sweeties != null)
				return false;
		} else if (!sweeties.equals(other.sweeties))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Sweet> getSweeties() {
		return sweeties;
	}

	public void setSweeties(List<Sweet> sweeties) {
		this.sweeties = sweeties;
	}
	
}