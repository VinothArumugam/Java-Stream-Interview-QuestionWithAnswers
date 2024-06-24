package com.main;

import java.util.Arrays;
import java.util.stream.Stream;

public class JavaPractice {

	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		// How do you create a stream from an array? 
			Arrays.stream(intArray);
			Stream.of(intArray);
	}

}
