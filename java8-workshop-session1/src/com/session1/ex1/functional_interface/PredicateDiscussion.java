package com.session1.ex1.functional_interface;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDiscussion {

	public static void main(String[] args) {
		
		//BiPredicate<String, String> p4=( s1,  s2)-> s1.length()>s2.length();
			
		
		
		
		Predicate<String> p1=n-> n.contains("raj");
		Predicate<String> p2=n->n.length()>10;
//		
		Predicate<String> p3=p1.or(p2).negate();
//		System.out.println(p3.test("fjdslkjljllkj"));
		
		
		/*
		 * What is functional interface?
		 * 
		 * @FunctionalInterface Interface and diamond problem and solution Interface
		 * evolution: default method , static method examples
		 */
		
	}

}
