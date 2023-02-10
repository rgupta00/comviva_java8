package com.session1.ex3.behavioural_para;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*
;public class AppleApp {
	
	public static List<Apple>getApplesOnPredicate(List<Apple> apples, Predicate<Apple> predicate){
		return apples.stream().filter(predicate).collect(toList());
	}
	
}

