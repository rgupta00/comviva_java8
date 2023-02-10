package com.session2.ex0.misc_questions;

import java.util.*;
import java.util.function.BinaryOperator;

public class D_ReductionOp {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(4, 6, 7, 1, 2, 5, 744);

		// finding sum of all element of the array:
		// What is binary operator

		int sum = 0;
		for (int x : numbers) {
			sum += x;
		}

		// how to use reduction

		// Reduction in case of No initial value

		// Maximum and minimum

		Optional<Integer> max = numbers.stream().reduce(Integer::max);
		Optional<Integer> min = numbers.stream().reduce(Integer::min);

	}

}
