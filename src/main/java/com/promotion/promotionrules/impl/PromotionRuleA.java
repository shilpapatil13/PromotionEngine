package com.promotion.promotionrules.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.promotion.model.Product;
import com.promotion.promotionrules.PromotionRule;

@Component
@Qualifier("PromotionRuleA")
public class PromotionRuleA implements PromotionRule{

	@Override
	public int applyPromotionRule(List<Product> skus) {
		int qtyA = 0;
		int priceA = 50;
		int qtyB = 0;
		int priceB = 30;
		int qtyC = 0;
		int priceC = 20;
		boolean presentC = false;
		boolean presentD = false;
		int totalPriceD = 0;
		
		for(Product p : skus) {
			if(p.getName().equalsIgnoreCase("A")) {
				qtyA = p.getQuantity();
			}
			if(p.getName().equalsIgnoreCase("B")) {
				qtyB = p.getQuantity();
			}
			if(p.getName().equalsIgnoreCase("C")) {
				qtyC = p.getQuantity();
				presentC = true;
			}
			if(p.getName().equalsIgnoreCase("D")) {
				presentD = true;
			}
		}
		
		int totalPriceA = (qtyA / 3) * 130 + (qtyA % 3 * priceA);
        int totalPriceB = (qtyB / 2) * 45 + (qtyB % 2 * priceB);
        int totalPriceC = (qtyC * priceC);
        if(presentC && presentD)
        	totalPriceD = 10;
        
		return totalPriceA + totalPriceB + totalPriceC + totalPriceD;
	}

}
