package com.myapp.oops;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Comparable<Product>,Serializable{
	
	private static final long serialVersionUID = 1L;

	private String productName;
	
	private double price;
	
	private Double rating;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
	}

	
	
	
	
	

	public Product(String productName, double price, Double rating) {
		this.productName = productName;
		this.price = price;
		this.rating = rating;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	


	public Double getRating() {
		return rating;
	}


	public void setRating(Double rating) {
		this.rating = rating;
	}


	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return ((Double)this.price).compareTo(o.price);
	}


	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", rating=" + rating + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(price, productName, rating);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(productName, other.productName) && Objects.equals(rating, other.rating);
	}
	
	


//	@Override
//	public String toString() {
//		return "Product [price=" + price + "]";
//	}
	
	
	
	
	
	

}

// <product>
// <productName></productName>
// <price></price>
//</product>

// JSON
// {
// {
//"Product":{
// "productName":"Iphone15",
// "price":75456.5
// }
// }