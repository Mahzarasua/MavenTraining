package com.servicestraining.product.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.servicestraining.product.dao.ProductDAO;
import com.servicestraining.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("Apple");
		product.setPrice(600);
		
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals(result.getName(), "Iphone");
		
	}

}
