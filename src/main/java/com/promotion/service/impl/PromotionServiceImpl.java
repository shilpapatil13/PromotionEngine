package com.promotion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promotion.model.Product;
import com.promotion.promotionrules.impl.PromotionRuleA;
import com.promotion.service.PromotionService;

@Service
public class PromotionServiceImpl implements PromotionService{
	
	@Autowired
	PromotionRuleA promotionRuleA; 

	List<Product> globalList = new ArrayList<Product>();
	
	@Override
	public void addToCart(Product p) {
		// TODO Auto-generated method stub
		globalList.add(p);
	}

	@Override
	public void clearCart() {
		// TODO Auto-generated method stub
		globalList.clear();
	}

	@Override
	public Integer calculateTotalPrice() {
		// TODO Auto-generated method stub
		return promotionRuleA.applyPromotionRule(globalList);
	}

}
