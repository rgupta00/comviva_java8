package com.blogapp.api;

interface Operation {
	public int add(int a, int b);
}

public class DemoDoubts {

	public static void main(String[] args) {

//		Operation op = (int a, int b) -> {
//			return a + b;
//		};
		
		Operation op = ( a,  b) -> a + b;
		
	}

}
