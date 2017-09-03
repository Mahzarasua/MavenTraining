package com.servicestraining.product.bo.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.servicestraining.product.bo.ProductBO;
import com.servicestraining.product.dao.ProductDAO;
import com.servicestraining.product.dao.impl.ProductDAOImpl;
import com.servicestraining.product.dto.Product;

public class ProductBOImplTest {

	@Test
	public void createBOShouldCreateAProduct() {
		ProductBO bo = new ProductBOImpl();
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("Apple");
		product.setPrice(600);
		
		((ProductBOImpl) bo).setDao(dao);
		
		bo.create(product);
		
		Product result = bo.findProduct(1);
		
		assertNotNull(result);
		assertEquals(result.getName(), "Iphone");
		
	}

}
