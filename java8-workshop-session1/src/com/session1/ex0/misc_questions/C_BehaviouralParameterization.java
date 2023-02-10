package com.session1.ex0.misc_questions;
//Strategy DP
@FunctionalInterface
interface Operation{
	public int apply(int a, int b);
}
class Cal{
	
	public static int applyOperation(int a, int b,Operation operation) {
		return operation.apply(a, b);
	}
}

public class C_BehaviouralParameterization {
	
	public static void main(String[] args) {
		
		Operation addOp=( a,  b) -> a+b;

		Operation mulOp=( a,  b) -> a*b;
		
		Operation diffOp=( a,  b) -> a-b;
		
		
		System.out.println(Cal.applyOperation(1, 1, diffOp));
		
	}

}
