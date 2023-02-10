package com.session1.ex3.behavioural_para;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class AppleTester {

		
		public static void main(String[] args) {

			
//	  Predicate<Apple> p1=a->a.getColor().equals("green");
//	  Predicate<Integer> p2=no->no>250;
//	 
//	  Predicate<Apple> p3=p1.an
			
			
		List<Apple> apples = Arrays.asList(new Apple("red", 400), new Apple(
				"green", 300), new Apple("green", 200), new Apple("red", 250));
		 
		Predicate<Apple> heavyApplePredicate=Apple::isHeay;
		
		
		
		
		Predicate<Apple> greenApplePredicate=Apple::isGreen;
		
		
		List<Apple>heayApples=AppleApp.getApplesOnPredicate(apples,heavyApplePredicate );
		List<Apple>greenApples=AppleApp.getApplesOnPredicate(apples,greenApplePredicate );
		
		Predicate<Apple> heavyAndGeenPredicate= heavyApplePredicate.and(greenApplePredicate);
		List<Apple>greenAndHeavyApples=AppleApp.getApplesOnPredicate(apples,heavyAndGeenPredicate );
			
			
		
		//Most imp functional interface in java 8
		
		//Predicate	
			
		//Function
		
		//Consumer
		
		//biConsumer
		Map<String, Integer>map=new HashMap<String, Integer>();
		
		//Supplier
	
		
		//BiFunction
	
		
		
		
	}
}

















