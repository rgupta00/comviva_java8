package com.session2.ex3.file_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSVProcessing {
	
	public static void main(String[] args) throws IOException {
		Pattern pattern = Pattern.compile(",");

		try (Stream<String> lines = Files.lines(Path.of("cakes.csv"))) {
		  
		  List<Cake> cakes = lines.skip(1).map(line -> {
		    String[] arr = pattern.split(line);
		    return new Cake(
		        Integer.parseInt(arr[0]), 
		        arr[1], 
		        Integer.parseInt(arr[2]));
		  }).collect(Collectors.toList());

		  cakes.forEach(System.out::println);
		}
	}

}
