package com.servicestraining.product.bo.impl;

import com.servicestraining.product.bo.ProductBO;
import com.servicestraining.product.dao.ProductDAO;
import com.servicestraining.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	ProductDAO dao;

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
