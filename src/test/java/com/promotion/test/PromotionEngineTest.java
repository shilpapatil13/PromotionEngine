package com.promotion.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.promotion.model.Product;
import com.promotion.promotionrules.PromotionRules;

public class PromotionEngineTest {

	PromotionRules promotionRules = new PromotionRules();
	Product productA = new Product();
	Product productB = new Product();
	Product productC = new Product();
	Product productD = new Product();
	
	@BeforeEach
	public void setupData() {
		
	    productA.setName("A");
	    productA.setPrice(50);
	   
	    productB.setName("B");
	    productB.setPrice(30);
	    
	    productC.setName("C");
	    productC.setPrice(20);
	   
	    productD.setName("D");
	    productD.setPrice(30);
	}
    
    @Test
    public void scenario1() {
    	List<Product> skus = new ArrayList();
       
        productA.setQuantity(1);
        productB.setQuantity(1);
        productC.setQuantity(1);
        
        skus.add(productC);
        skus.add(productB);
        skus.add(productA);
        
        assertEquals(3, skus.size());
        assertEquals(100, promotionRules.applyPromotionRule(skus));
    }
    
    @Test
    public void scenarioA() {
    	List<Product> skus = new ArrayList();
       
        productA.setQuantity(1);
        productB.setQuantity(1);
        productC.setQuantity(1);
        
        skus.add(productC);
        skus.add(productB);
        skus.add(productA);
        
        assertEquals(3, skus.size());
        assertEquals(100, promotionRules.applyPromotionRule(skus));
    }
    
    @Test
    public void scenarioB() {
    	List<Product> skus = new ArrayList();
       
        productA.setQuantity(5);
        productB.setQuantity(5);
        productC.setQuantity(1);
        
        skus.add(productC);
        skus.add(productB);
        skus.add(productA);
        
        assertEquals(3, skus.size());
        assertEquals(370, promotionRules.applyPromotionRule(skus));
    }
    
    @Test
    public void scenarioC() {
    	List<Product> skus = new ArrayList();
       
        productA.setQuantity(3);
        productB.setQuantity(5);
        productC.setQuantity(1);
        productD.setQuantity(1);
        
        skus.add(productD);
        skus.add(productC);
        skus.add(productB);
        skus.add(productA);
        
        assertEquals(4, skus.size());
        assertEquals(280, promotionRules.applyPromotionRule(skus));
    }
}