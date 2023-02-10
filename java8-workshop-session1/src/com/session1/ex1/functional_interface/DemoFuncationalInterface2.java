package com.session1.ex1.functional_interface;
import java.util.*;
public class DemoFuncationalInterface2 {

	public static void main(String[] args) {

		List<String> list=new ArrayList<>();
		
		Comparator<String> comparator=( o1,  o2)-> o1.length()-o2.length();
			
		
		
		
		
		// Funcation Interface : SAM

		// main diff : ann inner class have its own this
		// while lambad dont have its own this , it have laxical scope*
//		Runnable runnable2=new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("some job of thread..");
//			}
//		};

//		Runnable runnable2 = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("some job of thread..");
//			}
//		};
//
//		Runnable runnable = () -> System.out.println("some job of thread...");

		// FP in java
		// Stream is a declative "data" processing...
		// how we are store the data in java : collection api
		// in java 8 : how to modfify collection api to support declative "data"
		// processing...

		// Collection

		/*
		 * What is functional interface?
		 * 
		 * @FunctionalInterface Interface and diamond problem and solution Interface
		 * evolution: default method , static method examples
		 */
	}

	private static void fooClient(Foof foo) {

	}
}
