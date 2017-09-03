package com.servicestraining.product.bo;

import com.servicestraining.product.dto.Product;

public interface ProductBO {
	public void create(Product product);

	public Product findProduct(int id);
}
