package com.myapp.functional;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;

import com.myapp.oops.Product;

public class TestAverageProductpriceUsinglambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Product p1 = new Product("Iphone15", 75456.5);
		
		Product p2 = new Product("Oneplus11R", 65456.5);
		
		Product p3 = new Product("SamsungFlip", 55456.5);
		
		List<Product> products = List.of(p1,p2,p3);
		
		
		DoubleStream doubleStream= 
		products.stream().filter(product -> product.getPrice() > 65000.0)
		.mapToDouble(product -> product.getPrice());
		
		System.out.println("Distinct"+doubleStream.distinct());
		
		
		
		DoubleSummaryStatistics stats = 
				
		products.stream().filter(product -> product.getPrice() > 65000.0)
		.mapToDouble(product -> product.getPrice()).summaryStatistics();
		
		System.out.println("Average "+stats.getAverage());
		System.out.println("Count "+stats.getCount());
		System.out.println("Min "+stats.getMin());
		System.out.println("Max "+stats.getMax());
		System.out.println("Sum "+stats.getSum());
//		
//		int sum= 0;
//		int count =0;
//		
//		for(Product product:products) {
//			if(product.getPrice() > 65000.0) {
//				count++;
//				sum += product.getPrice();
//			}
//		}
//
//		double average =0d;
//		if(count > 0 ) {
//			average = sum/count;
//		}
//		System.out.println("Average "+average);
		
	}

}
