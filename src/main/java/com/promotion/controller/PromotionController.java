package com.promotion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promotion.model.Product;
import com.promotion.promotionrules.PromotionRule;
import com.promotion.service.PromotionService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ExampleObject;

@RestController
public class PromotionController {
	
	@Autowired
	PromotionService promotionService;  

	@Autowired
	@Qualifier("PromotionRuleA")
	PromotionRule promotionRule; 
	
	@Operation(description="Add Products to Cart")
	@RequestMapping(value = "/api/promotion/addToCart/productName/{productName}/quantity/{quantity}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<String> addToCart(@Parameter(description="Product Name", examples = {
			@ExampleObject(name = "A"),
			@ExampleObject(name = "B"),
			@ExampleObject(name = "C"),
			@ExampleObject(name = "D")}, example ="A") @PathVariable(required=true)String productName, 
			@PathVariable(required=true)Integer quantity){
		Product p = new Product();
		p.setName(productName);
		p.setQuantity(quantity);
		promotionService.addToCart(p);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@Operation(description="Calculate Total Price")
	@RequestMapping(value = "/api/promotion/calculateTotalPrice", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<Integer> calculateTotalPrice(){
		Integer price = promotionService.calculateTotalPrice();
		return new ResponseEntity<>(price, HttpStatus.OK);
	}
	
	@Operation(description="Clear Cart")
	@RequestMapping(value = "/api/promotion/clearCart", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<Integer> clearCart(){
		promotionService.clearCart();
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
