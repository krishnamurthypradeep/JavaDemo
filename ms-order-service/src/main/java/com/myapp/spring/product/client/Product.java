package com.myapp.spring.product.client;

public class Product {
	

	private String id;

	private String productName;
	
	private Double price;
	
	private Double starRating;
	
	
	private String productCode;
	
	private String productAvailable;
	
	private String imageUrl;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(String productName, Double price, Double starRating, String productCode, String productAvailable,
			String imageUrl) {
		this.productName = productName;
		this.price = price;
		this.starRating = starRating;
		this.productCode = productCode;
		this.productAvailable = productAvailable;
		this.imageUrl = imageUrl;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Double getStarRating() {
		return starRating;
	}


	public void setStarRating(Double starRating) {
		this.starRating = starRating;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public String getProductAvailable() {
		return productAvailable;
	}


	public void setProductAvailable(String productAvailable) {
		this.productAvailable = productAvailable;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
	
	

}
