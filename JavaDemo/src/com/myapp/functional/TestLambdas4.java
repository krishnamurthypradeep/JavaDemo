package com.myapp.functional;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestLambdas4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<MyCity> cities = Set.of(new MyCity("Bengaluru","Karnataka",35000000.0),
				new MyCity("Mysuru","Karnataka",15000000.0),
				new MyCity("Mangaluru","Karnataka",25000000.0),
				new MyCity("Hubli","Karnataka",25000000.0),
				new MyCity("Mumbai","Maharashtra",55000000.0),
				new MyCity("Pune","Maharashtra",27500000.0),
				new MyCity("Nagpur","Maharashtra",185000000.0),
				new MyCity("Hyderabad","Telangana",55000000.0));
		
		
		Map<String, List<MyCity>> citiesPerState =
		
		cities.stream().collect(Collectors.groupingBy(city -> city.state()));
		
		System.out.println("Map Size ="+citiesPerState.size());
		
		//citiesPerState.get("Maharashtra").forEach(System.out::println);
		
	List<MyCity> citiesOfMaharashtra =	 citiesPerState.get("Maharashtra");
	
	citiesOfMaharashtra.forEach(System.out::println);
	
	Iterator<MyCity> iterator =  citiesOfMaharashtra.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	
	Map<String, Long> numberOfCitiesPerState =
	cities.stream().collect(Collectors.groupingBy(city -> city.state(),Collectors.counting()));
		
	
	long count = numberOfCitiesPerState.get("Telangana");
	System.out.println("Count ="+count);
	
	
	
	Map.Entry<String, Long> stateWithMostCities = 
	numberOfCitiesPerState.entrySet().stream()
	.max(Comparator.comparing(entry -> entry.getValue())).orElseThrow();
	
	System.out.println(stateWithMostCities);
	
		
		
		
	

	}

}
