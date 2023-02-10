package com.session1.ex0.why_lambda;

import java.util.stream.LongStream;

//calculating prime no bw 1 to 1_000_00

class Prime{
	public static boolean isPrime(Long n){
		boolean isPrimeNumber=true;
		for(int i=2;i<n;i++){
			if(n%i==0)
				isPrimeNumber=false;
		}
		return isPrimeNumber;
	}
}

public class MotivationJava8 {
	
	public static void main(String[] args) {
		
		//calculating prime no bw 1 to 1_000_00
		//time taken: 1150 ms==> 16 core
		//time taken: 1884 ms
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		long start=System.currentTimeMillis();
		
		//F and J framework :(
		
		// :)
		Long nos=LongStream.rangeClosed(1, 1_000_00)
				.filter(Prime::isPrime)
				.parallel()
				.count();
		
		long end=System.currentTimeMillis();
		
		System.out.println("time taken: "+(end-start)+" ms");
		/*
		 * System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
		or

		java -Djava.util.concurrent.ForkJoinPool.common.parallelism=8 MotivationJava8

		 */
	}

}
