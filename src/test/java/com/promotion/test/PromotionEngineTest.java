package com.promotion.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.promotion.model.Product;
import com.promotion.promotionrules.PromotionRules;

public class PromotionEngineTest {

	@Autowired
	PromotionRules promotionRules;
	
    @Test
    public void getTotalPrice() {

    	List<Product> skus = new ArrayList();
    	
        Product productA = new Product();
        productA.setName("A");
        productA.setPrice(50);
        productA.setQuantity(1);
        
        Product productB = new Product();
        productB.setName("B");
        productB.setPrice(30);
        productB.setQuantity(1);
        
        Product productC = new Product();
        productC.setName("C");
        productC.setPrice(20);
        productC.setQuantity(1);
        
        Product productD = new Product();
        productD.setName("D");
        productD.setPrice(30);
        productD.setQuantity(0);
        
        skus.add(productD);
        skus.add(productC);
        skus.add(productB);
        skus.add(productA);
        
        assertEquals(4, skus.size());
        assertEquals(100, promotionRules.applyPromotionRule(skus));

    }
}