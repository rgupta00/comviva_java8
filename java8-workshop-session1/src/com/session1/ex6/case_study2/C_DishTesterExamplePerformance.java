package com.session1.ex6.case_study2;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C_DishTesterExamplePerformance {
	
	public static void main(String[] args) {
		
		try(Scanner scanner=new Scanner(System.in)){
			
		}
		
	
		
		//MS: spring boot: 3.x : java 17
//		List<Integer> list=List.of(3,6,7,88,7);
//		Stream<Integer> s1=list.stream();
//		s1.forEach(d-> System.out.println(d));
//		s1.forEach(d-> System.out.println(d));
		
		
		
		
		List<Dish> allDishes=getAllDishes();
		//stream performance:
		/*
		 * 1. lazy evolution
		 * 2. loop fusion
		 * 3. short-circuiting
		 * Note : same stream can not iterate twice: error
		 */
		
		
//		List<String> names = allDishes.stream()
//				.filter(  d ->  d.getCalories() > 300)
//				.peek(d-> System.out.println(d))
//				.map(d-> d.getName())
//				.peek(dn-> System.out.println(dn))
//				.limit(2)
//				.collect(Collectors.toList());	
		
		
		
		
//		List<String> names = allDishes.stream()
//				.filter(  d -> {
//					System.out.println("filer op: "+d);
//					return d.getCalories() > 300;
//				})
//				.map(d-> {
//					System.out.println("map op: "+ d.getName());
//					return d.getName();
//				})
//				.limit(2)
//				.collect(Collectors.toList());	
//		
		
		//names.forEach(dn-> System.out.println(dn));
		
		
//		Stream<String> limit = allDishes.stream()
//				.filter(  d ->{
//					System.out.println("dish is :"+ d);
//					return  d.getCalories() > 300;
//				})
//				.map(d-> {
//					System.out.println("dish name is is :"+ d.getName());
//					return d.getName();
//				})
//				.limit(3);
//		
//		
//		System.out.println("------------------");
		
	}
	

	
	private static List<Dish> getAllDishes() {
		List<Dish> disheds = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH) );
		return disheds;
	}
}
