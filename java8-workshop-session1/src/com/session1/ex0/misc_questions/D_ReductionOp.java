package com.session1.ex0.misc_questions;

import java.util.*;
import java.util.function.BinaryOperator;

public class D_ReductionOp {

	public static void main(String[] args) {

		//Accumation vs reduction : streams processing : immutable
		
		List<Integer> numbers = List.of(4, 6, 7, 1, 2, 5, 744);

		// finding sum of all element of the array:
		// What is binary operator

//		int sum = 0;
//		for (int x : numbers) {
//			sum += x;
//		}

		// how to use reduction
		
		BinaryOperator<Integer> opt=new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer a, Integer b) {
				return null;
			}
		};
		
		
		//Integer val = numbers.stream().reduce(identity, accumulator)
		
//		Integer val = numbers.stream().reduce(0, ( x,  y) ->x+y);
//		System.out.println(val);
		
//		Optional<Integer> valOp = numbers.stream().reduce( ( x,  y) ->x+y);
//		System.out.println(valOp.orElse(-1));


//		Integer val = numbers.stream().reduce(1, ( x,  y) ->x*y);
//		System.out.println(val);
		
//		Integer max = numbers.stream().reduce(1, ( x,  y) ->x>y?x:y);
//		System.out.println(max);
		
	//	Optional<Integer> maxOp = numbers.stream().reduce( Integer::max);
		
		
		// Reduction in case of No initial value

		// Maximum and minimum

		Optional<Integer> max = numbers.stream().reduce(Integer::max);
		Optional<Integer> min = numbers.stream().reduce(Integer::min);

	}

}
