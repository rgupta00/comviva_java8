package com.session1.ex3.behavioural_para;
import java.util.*;
import java.util.function.Consumer;
public class PrintList {
	
	public static void main(String[] args) {
		List<String> list=List.of("foo","bar","hari","bar");
//		list.stream().forEach(name-> System.out.println(name));
		
		//list.forEach(name-> System.out.println(name));
		
//		Consumer<String> c=name-> System.out.println(name);
		
		Consumer<String> c=System.out::println;
		list.forEach(c);
	}

}
