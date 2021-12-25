package com.promotion.promotionrules;

import java.util.List;

import org.springframework.stereotype.Service;

import com.promotion.model.Product;

@Service
public class PromotionRules {
	
	public int applyPromotionRule(List<Product> skus) {
		
		int qtyA = 0;
		int priceA = 0;
		int qtyB = 0;
		int priceB = 0;
		int qtyC = 0;
		int priceC = 0;
		boolean presentC = false;
		boolean presentD = false;
		int totalPriceD = 0;
		
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
