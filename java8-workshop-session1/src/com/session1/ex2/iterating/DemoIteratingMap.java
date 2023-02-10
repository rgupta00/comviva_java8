package com.session1.ex2.iterating;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class DemoIteratingMap {
	
	public static void print(String name, int mark) {
		System.out.println(name+": " + mark);
	}
	
	public static void main(String[] args) {
		
		Map<String, Integer> studentMap = getStudentMap();
		
//		studentMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach( e->System.out.println(e));
		
		//studentMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach( e->System.out.println(e));
		
//		studentMap.entrySet().forEach( e-> System.out.println(e.getKey()+" : "+ e.getValue()));
		
		//how to use java 8
		
//		studentMap.forEach(( name,  marks) ->System.out.println(name+": "+ marks));
		
		//studentMap.forEach(DemoIteratingMap::print);
		
		
		
		//printing map
//		Set<String> keySet=studentMap.keySet();
//		for(String key: keySet) {
//			System.out.println(key+" : "+ studentMap.get(key));
//		}
		
//		Set<Entry<String, Integer>> entrySet = studentMap.entrySet();
//		for(Entry<String, Integer> e: entrySet) {
//			System.out.println(e.getKey()+": "+ e.getValue());
//		}
//		
		

	}

	private static Map<String, Integer> getStudentMap() {
		Map<String, Integer> studentMarks=new HashMap<String, Integer>();
		studentMarks.put("ravi", 89);
		studentMarks.put("sunita", 39);
		studentMarks.put("ekta", 85);
		studentMarks.put("gunika", 99);
		studentMarks.put("umesh", 91);
		studentMarks.put("indu", 79);
		
		return studentMarks;
	}

}
