package com.myapp.oops;

public class MinMaxArrayImpl<T extends Comparable<T>> implements MinMaxArray<T> {
	
	private T vals[];
	
	//int x=new Integer(10)

	public MinMaxArrayImpl(T[] vals) {
		
		this.vals = vals;
	}

	@Override
	public T min() {
		// TODO Auto-generated method stub
		
		T v = vals[0];
		
		for(T val: vals) {
			if(val.compareTo(v) <0) {
				v=val;
			}
		}
		return v;
	}

	@Override
	public T max() {

		T v = vals[0];
		
		for(T val: vals) {
			if(val.compareTo(v) > 0) {
				v=val;
			}
		}
		return v;
	}
	
	
	public static void main(String[] args) {
		
		 Integer intValueArray[]= {56,45,-1,76,1};
		 
		 
		MinMaxArray<Integer> intArray = new MinMaxArrayImpl<>(intValueArray);
		System.out.println("Min Value "+intArray.min());
		System.out.println("Max Value "+intArray.max());
		
		
		 Double doubleValueArray[]= {56.5,4.5,-0.01,0.2e3,8.0};
		 
		 
			MinMaxArray<Double> doubleArray = new MinMaxArrayImpl<>(doubleValueArray);
			System.out.println("Min Value "+doubleArray.min());
			System.out.println("Max Value "+doubleArray.max());
			
			Character charValueArray[]= {'g','f','e','a'};
			 
			 
			MinMaxArray<Character> charArray = new MinMaxArrayImpl<>(charValueArray);
			System.out.println("Min Value "+charArray.min());
			System.out.println("Max Value "+charArray.max());
		
			
			
Product productValueArray[] = {new Product("Iphone14", 75456.4),new Product("Oneplus14", 45675.5)};
MinMaxArray<Product> productArray = new MinMaxArrayImpl<>(productValueArray);

System.out.println("Min Value "+productArray.min());
System.out.println("Max Value "+productArray.max());

// Collections



	
	
	
	}
	

}
