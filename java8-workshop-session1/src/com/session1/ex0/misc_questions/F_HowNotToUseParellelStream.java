package com.session1.ex0.misc_questions;

import java.util.LongSummaryStatistics;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.LongConsumer;
import java.util.stream.LongStream;

public class F_HowNotToUseParellelStream {

	public static void main(String[] args) {

		// 500000500000
//		long sum=0;
		
		//how u can achive thread safty
		//2 ways to achive ts: 1. syn vs 2. immuablity
		
//		
//		long sum2=LongStream.rangeClosed(1, 1_000_000)
//				.parallel().reduce(0, (x,y)->x+y);
//		
		
		
//		long sum2=LongStream.rangeClosed(1, 1_000_000)
//				.parallel().sum();
		
		//System.out.println(sum2);
		
		LongSummaryStatistics summaryStatistics = 
				LongStream.rangeClosed(1, 1_000_000)
				.parallel().summaryStatistics();
		System.out.println(summaryStatistics.getMax());
		System.out.println(summaryStatistics.getMin());
		System.out.println(summaryStatistics.getAverage());
		
		
		
		
//		
//		for(long i=0;i<=1_000_000; i++) {
//			sum+=i;
//		}
//		
//		System.out.println(sum);

		// Accumulation
		//long sum2=0L;
		
	//	long[] sum2 = new long[] { 0L };
		
		
		
//		
//		LongStream.rangeClosed(1, 1_000_000).parallel().forEach(new LongConsumer() {
//
//			@Override
//			public void accept(long i) {
//				System.out.println(Thread.currentThread().getName());
//				sum2[0]+=i;
//			}
//		});
		
//		LongStream.rangeClosed(1, 1_000_000).forEach( i-> sum2[0]+=i);
//		
//		System.out.println(sum2[0]);
		//System.out.println(Runtime.getRuntime().availableProcessors());
	//	LongStream.rangeClosed(1, 1_000_000).parallel().forEach( i-> sum2[0]+=i);
		
//		LongStream.rangeClosed(1, 1_000_000).parallel().forEach( i-> sum2[0]+=i);
//		
//		System.out.println(sum2[0]);
		
//		LongStream.rangeClosed(1, 1_000_000).parallel().forEach(new LongConsumer() {
//
//			@Override
//			public void accept(long i) {
//				System.out.println(Thread.currentThread().getName());
//				synchronized (this) {
//					sum2[0]+=i;
//				}
//			}
//		});
//		
//		System.out.println(sum2[0]);
		
		//AtomicInteger vs syn kb?
		
	}
	

}





