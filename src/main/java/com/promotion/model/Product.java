package com.promotion.model;

public class Product {
	
	private String name;
	
	private int quantity;
	
	private int price;
	
    // promotions in future can be applied on product Types instead 
	//of giving product names for conditional promotions
	private String productType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}
	
}
