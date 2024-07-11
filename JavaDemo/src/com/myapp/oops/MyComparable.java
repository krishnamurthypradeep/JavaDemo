package com.myapp.oops;

@FunctionalInterface
public interface MyComparable<T> {
	
	public int compareTo(T o1,T o2);
	
	boolean equals(Object obj);
	

	int hashCode();
	
	//public int compare(T o);
	// Suppliers
	// Consumers
	// Predicates
	// Functions

}
