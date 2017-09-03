package com.servicestraining.userservices.product.bo.impl;

import com.servicestraining.userservices.product.bo.UserBO;
import com.servicestraining.userservices.product.dao.UserDAO;
import com.servicestraining.userservices.product.dto.User;

public class UserBOImpl implements UserBO {
	UserDAO dao;

	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	public void create(User u) {
		dao.create(u);
	}

	@Override
	public User findUser(int id) {
		return dao.read(id);
	}

}
