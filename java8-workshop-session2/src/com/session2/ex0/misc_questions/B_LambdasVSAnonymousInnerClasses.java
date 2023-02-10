package com.session2.ex0.misc_questions;

//class Demo {
//	void method() {
//		final int cnt = 16;
//
//		Runnable r = new Runnable() {
//			public void run() {
//				System.out.println("count: " + cnt);
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
//
//		// cnt ++; // error: cnt is final
//	}
//}

class Demo {
	private int i = 44;

	void method() {
		final int i = 16;

		Runnable r = new Runnable() {
			int i = 77;

			public void run() {
				System.out.println("count: " + this.i);
			}
		};
		Thread t = new Thread(r);
		t.start();

		// cnt++; // error: cnt is final
	}

}

public class B_LambdasVSAnonymousInnerClasses {

	public static void main(String[] args) {

		Demo demo = new Demo();
		demo.method();

		// 1. Syntax: lambda is more simplified then ann inner class
		// 2.Runtime Overhead
		// 3. Variable Binding: variable capture: an inner class has access to all final
		// variables of its enclosing context
		// same with lambda

		// ann inner class have its own scope
	}

}
