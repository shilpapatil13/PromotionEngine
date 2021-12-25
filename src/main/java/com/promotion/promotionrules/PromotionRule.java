package com.promotion.promotionrules;

import java.util.List;

import com.promotion.model.Product;

public interface PromotionRule {

	public int applyPromotionRule(List<Product> skus);
}
