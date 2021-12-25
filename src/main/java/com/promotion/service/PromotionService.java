package com.promotion.service;

import com.promotion.model.Product;

public interface PromotionService {

	void addToCart(Product p);
	
	void clearCart();
	
	Integer calculateTotalPrice();
}
