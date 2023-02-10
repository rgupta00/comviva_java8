package com.session1.ex1.functional_interface;


//

//interface Foo{
//	void foo();
//	
//	//interface evoluation
//	default void bar() {
//		System.out.println("some default imp..");
//		barPrivate();
//	}
//	
//	static void barStatic() {
//		System.out.println("some barStatic..");
//	}
//	
//	
//	private void barPrivate() {
//		System.out.println("some default imp..");
//	}
//}
//
//class FooImp1 implements Foo{
//
//	@Override
//	public void foo() {
//		System.out.println("---ravi imp---");
//	}
//	
//	public void bar() {
//		System.out.println("some default imp..overriden");
//	}
//	
//}
//
//class FooImp2 implements Foo{
//
//	@Override
//	public void foo() {
//		System.out.println("---rashim imp---");
//	}
//	
//}

//diamond problem

//interface Foo {
//
//	default void foo() {
//		System.out.println("some default imp..");
//	}
//
//}
//
//interface Bar {
//
//	default void foo() {
//		System.out.println("some default imp..");
//	}
//
//}
//
//class X implements Foo, Bar{
//	public  void foo() {
//		Foo.super.foo();
//	}
//}

//FI---> Streams--> Funcation interface(SAM) --> interface evoulation

@FunctionalInterface
interface Foof {
	void foof();

	// void foof2();
	default void foofDefault() {

	}

	default void foofDefault2() {

	}
}

//What is the power of FI: they support FI and Lambda expression (higher order function)
public class DemoFuncationalInterface {

	public static void main(String[] args) {

//		Foof foo=new Foof() {
//			
//			@Override
//			public void foof() {
//				System.out.println("it is a ann inner class");
//			}
//		};

		Foof foo = () ->System.out.println("it is a ann inner class");
		

		fooClient(foo);//HOF

//		Foo foo=new FooImp1();
//		foo.bar();

		// What is functional interface?

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
