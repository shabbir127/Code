package com.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DAS {
	
	public static void main(String[] args) {
		
		List<Integer> number= Arrays.asList(1,2,3,4,5,6,9,3,4,7,57,8,9,10,19,12,20,15,12);
		
		List<String> names= Arrays.asList("java","springboot","python");
		
		
		
		List<String> firstname = Arrays.asList(
			    "Amit", "Rahul", "Ankit", "Sneha", "Ajay", "Rohit"
			);
		
		number.stream().filter(x->x%2==0).forEach(t -> System.out.print(t+" ") );
		System.out.println();
		//number.stream().map(x->x*x).forEach(t-> System.out.print(t +" "));
		
		List<Integer>result=number.stream().map(x->x*x).toList();
		System.out.println(result);
		
		
		names.stream().map(x->x.toUpperCase()).forEach(x->System.out.print(x+ " "));
		System.out.println();
		
		number.stream().filter(x->x >10).forEach(x->System.out.print(x +" "));
		
		System.out.println();
		long count=firstname.stream().filter(x->x.startsWith("A")).count();
		System.out.println(count);
		
	   int max=number.stream().max(Comparator.naturalOrder()).get();	
	   System.out.println(max);
	   
	   int min=number.stream().min(Comparator.naturalOrder()).get();
	   System.out.println(min);
	   
	   List<Integer> sorted=number.stream().sorted().toList();
	   System.out.println(sorted);
	   
	   List<Integer>duplicated=number.stream().distinct().collect(Collectors.toList());
	   System.out.println(duplicated);
	   
	   Optional<Integer> secondMaxIntegers=number.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	   System.out.println(secondMaxIntegers);
	   
	   
	   
	   
	   
	}

}
