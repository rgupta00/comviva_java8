package com.session1.ex1.functional_interface;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.session1.ex2.iterating.Book;

public class FuctionDiscussion {

	public static void main(String[] args) {
		
	
		//a->b
		
		//Consumer<String> consumer= name-> System.out.println(name);//*
		Consumer<Book> bookConsumer=b-> System.out.println(b);	
		
		//BiConsumer<T, U>
		
		
		//Optional java 8
		Supplier<String> supplier=()-> "some random string";
		
		System.out.println(supplier.get());		
		
		
		
//		Function<Book, Double> function=b->b.getPrice();
//			
//		BiFunction<String, String, String> biFunction=( fName,  lName)->  fName.concat(lName);
//		
//		BiFunction<Integer, Integer, Boolean> function2=(n1,n2)->n1>n2;
	
		
		
		
		/*
		 * What is functional interface?
		 * 
		 * @FunctionalInterface Interface and diamond problem and solution Interface
		 * evolution: default method , static method examples
		 */
		
	}

}
