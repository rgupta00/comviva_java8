package com.session2.ex3.file_handling;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FileProcessing {

	public static void main(String[] args) throws Exception {

		// Using Files.lines()

//		Stream<String> lines = Files.lines(Path.of("demo.txt"));
//		lines.forEach(System.out::println);

		// Using BufferedReader.lines()

//		BufferedReader br = Files.newBufferedReader(Paths.get("demo.txt"));
//		Stream<String> lines = br.lines();
//		lines.forEach(System.out::println);

		// Using Files.readAllLines()

//		List<String> strList = Files.readAllLines(Path.of("demo.txt"));
//		Stream<String> lines = strList.stream();
//		lines.forEach(System.out::println);

		// Importance of try-with-resources
//		try (Stream<String> lines = Files.lines(Path.of("demo.txt"))) {
//			lines.forEach(System.out::println);
//		}

		
		//Reading From CSV Files Into Java Objects
		
	}

}
