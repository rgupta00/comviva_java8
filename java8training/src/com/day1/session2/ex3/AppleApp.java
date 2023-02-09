package com.day1.session2.ex3;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*
;public class AppleApp {
	
	public static List<Apple>getApplesOnPredicate(List<Apple> apples, Predicate<Apple> predicate){
		return apples.stream().filter(predicate).collect(toList());
	}
	
}

