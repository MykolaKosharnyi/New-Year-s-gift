package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing class from model NewYearsGift
 * @author nikolay
 *
 */
public class NewYearsGiftTest {
	/**
     * Object that we need to test
     */
	private NewYearsGift model;
	
	/**
     * Creating model object
     */
	@Before
	public void createModel(){
		model = new NewYearsGift("Test gift", SweetiesInitializationTest.getSweeties());
	}
	
	/**
	 * Check sorting sweetie by name
	 */
	@Test
	public void testSortSweetiesByName(){
		Assert.assertTrue(model.sortSweetiesByName().equals(SweetiesInitializationTest.getSortSweetiesByName()));
	}
	
	/**
	 * Check get sum of weight all sweeties in the box.
	 */
	@Test
	public void testGetWeight(){
		Assert.assertTrue(new Double(model.getWeight()).equals(SweetiesInitializationTest.getWeight()));
	}
	
	/**
	 * Check finding sweetie by sugar content in sweet
	 */
	@Test
	public void testFindSweetBySugarContent(){ 
		Assert.assertTrue(model.findSweetBySugarContent(0.3, 0.7).equals(SweetiesInitializationTest.getFindSweetBySugarContent()));
	}
}
