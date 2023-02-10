package com.session1.ex2.iterating;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class DemoIteratingMap2 {
	
	public static void print(String name, int mark) {
		System.out.println(name+": " + mark);
	}
	public static void main(String[] args) {
		
		Map<Student, Integer> studentMap = getStudentMap();
		
//		studentMap.forEach((s,m)-> System.out.println(s+": "+ m));
		
//		studentMap.entrySet().stream()
//			.sorted(Map.Entry.comparingByValue())
//			.forEach(e-> System.out.println(e));
		
		
		studentMap.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getMarks).reversed()))
		.forEach(e-> System.out.println(e));
		
		
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

	private static Map<Student, Integer> getStudentMap() {
		Map<Student, Integer> studentMarks=new HashMap<>();
		studentMarks.put(new Student(1, "ravi", 89), 89);
		studentMarks.put(new Student(1, "pooja", 79), 79);
		studentMarks.put(new Student(1, "sunita", 85), 85);
		studentMarks.put(new Student(1, "gunika", 99), 99);
		studentMarks.put(new Student(1, "kapil", 91), 91);
		studentMarks.put(new Student(1, "indu", 79), 79);
		
		return studentMarks;
	}

}
