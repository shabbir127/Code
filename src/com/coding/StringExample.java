package com.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StringExample {
	
	public static void main(String[] args) {
		
	
	String name="Shabbir";
	
	Map<Character, Long> map=name.chars().mapToObj(c -> (char) c)
			.collect(Collectors.groupingBy(c->c,Collectors.counting()));
	 
	map.forEach((ch,count)-> System.out.print(ch+ "= "+ count+ " , "));

	System.out.println("\n"+ map.entrySet().stream().max(Map.Entry.comparingByValue()).get());
	
	System.out.println("done with this");
	
	int n=10;
	
	int a=0;
	int b=1;
	int sum;
	
	System.out.println("Stating from here:-" + a + " "+b);
	for(int i=1 ;i<=n;i++)
	{
		sum=a+b;
		a=b;
		b=sum;
		System.out.print(" "+ sum);
	}

	}
}
