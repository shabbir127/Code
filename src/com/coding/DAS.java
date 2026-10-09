package com.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAS {
	
	public static void main(String[] args) {
		
		List<Integer> number= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<String> names= Arrays.asList("java","springboot","python");
		
		number.stream().filter(x->x%2==0).forEach(t -> System.out.print(t+" ") );
		System.out.println();
		//number.stream().map(x->x*x).forEach(t-> System.out.print(t +" "));
		
		List<Integer>result=number.stream().map(x->x*x).toList();
		System.out.println(result);
		
		
		names.stream().map(x->x.toUpperCase()).forEach(x->System.out.print(x+ " "));
		
		
	}

}
