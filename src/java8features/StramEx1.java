package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Sneha", "Swetha", "Jesi", "Varshini", "Ramya", "Haridha");
		
		//create a stream
		Stream<String> allNames = names.stream();
		
		//perform intermediate operation
		Stream<String> longNames = allNames.filter(str -> str.length() < 7);
		
		//perform terminal opefration
		System.out.println("Using forEach() : ");
		longNames.forEach(str -> System.out.println(str));
		
		//single line
		//collect(Collectors.toList()) : used to convert stream into List
		List<String> namesCollect = names.stream().filter(str -> str.length() < 7).collect(Collectors.toList());
		System.out.println("\nUsing collect() : ");
		
		//names.Collect.forEach(str -> System.out.println(str));
		namesCollect.forEach(System.out::println);
		

	}

}
