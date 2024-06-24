package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaPractice {

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		//1. create a stream from a collection in Java 8
		
			List<Integer> asList = Arrays.asList(1, 2, 3, 4);
			Stream<Integer> stream = asList.stream();
		
		// 2. How do you create a stream from an array? 
			
			Arrays.stream(intArray);
			Stream.of(intArray);
			
		// 3. How do you convert a Stream to a List?
			
			List<Integer> collect = stream.collect(Collectors.toList());
			
	}

}
