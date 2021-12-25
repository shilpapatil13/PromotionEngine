package com.promotion.promotionrules;

import java.util.List;

import com.promotion.model.Product;

public class PromotionRules {
	
	public static int applyPromotionRule(List<Product> skus) {
		
		int qtyA = 0;
		int priceA = 0;
		int qtyB = 0;
		int priceB = 0;
		int qtyC = 0;
		int priceC = 0;
		int qtyD = 0;
		int priceD = 0;
		
		
		for(Product p : skus) {
			if(p.getName().equalsIgnoreCase("A")) {
				qtyA = p.getQuantity();
				priceA = p.getPrice();
			}
			if(p.getName().equalsIgnoreCase("B")) {
				qtyB = p.getQuantity();
				priceB = p.getPrice();
			}
			if(p.getName().equalsIgnoreCase("C")) {
				qtyC = p.getQuantity();
				priceC = p.getPrice();
			}
			if(p.getName().equalsIgnoreCase("D")) {
				qtyD = p.getQuantity();
				priceD = p.getPrice();
			}
		}
		
		int totalPriceA = (qtyA / 3) * 130 + (qtyA % 3 * priceA);
        int totalPriceB = (qtyB / 2) * 45 + (qtyB % 2 * priceB);
        int totalPriceC = (qtyC * priceC);
        int totalPriceD = (qtyD * priceD);
		
		return totalPriceA + totalPriceB + totalPriceC + totalPriceD;
	}

}
