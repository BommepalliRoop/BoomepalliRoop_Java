package com.gradedAssigment.Q3;

import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperators {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5);
		Stream<Integer> numberStream = numbers.stream();
		List<Integer> filterStream = numberStream.filter(n -> n%2 !=0).collect(Collectors.toList());
		numberStream = filterStream.stream();
		List<Integer> squares = numberStream.map(n-> n*n).collect(Collectors.toList());
		numberStream = squares.stream();
        int sum = numberStream.mapToInt(Integer::intValue).sum();
//		System.out.println("Input :"+numbers);
//		System.out.println("Odd Numbers :"+filterStream);
//		System.out.println("squares "+squares);
        //Question to find sum
		System.out.println("Sum :"+sum);
		

	}

}
