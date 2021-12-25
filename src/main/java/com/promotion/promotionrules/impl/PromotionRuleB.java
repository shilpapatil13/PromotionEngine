package com.promotion.promotionrules.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import com.promotion.model.Product;
import com.promotion.promotionrules.PromotionRule;

@Component
public class PromotionRuleB implements PromotionRule{
	
	@Override
	public int applyPromotionRule(List<Product> skus) {
		//Can add other business rule engine combination
		return 0;
	}

}
