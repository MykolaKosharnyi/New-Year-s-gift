package main;

import java.util.stream.Stream;

import model.NewYearsGift;
import model.Sweet;
import view.View;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
//        .filter(s -> {
//            System.out.println("filter: " + s);
//            return s.startsWith("a");
//        })
//        .sorted((s1, s2) -> {
//            System.out.printf("sort: %s; %s\n", s1, s2);
//            return s1.compareTo(s2);
//        })
//        .map(s -> {
//            System.out.println("map: " + s);
//            return s.toUpperCase();
//        })
//        .forEach(s -> System.out.println("forEach: " + s));
    	
    	View view = new View();
    	
    	NewYearsGift gift = new NewYearsGift();
    	
    	view.outSweeties(gift.getSweeties(), "Sweeties:");
    	
    	view.outMessage("All weight:" +  gift.getWeight());
    	
    	view.outSweeties(gift.sortSweetiesByName(), "After sorting:");

    	view.outSweeties(gift.findSweetBySugarContent(0.3, 0.6), "Search by sugar content, from 0.3 to 0.6:");
    	
    }
}
