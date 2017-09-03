package com.servicestraining.userservices.product.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.servicestraining.userservices.product.dao.UserDAO;
import com.servicestraining.userservices.product.dto.User;

public class UserDAOImpl implements UserDAO {
	Map<Integer, User> users = new HashMap<>();

	@Override
	public void create(User u) {
		users.put(u.getId(), u);
	}

	@Override
	public User read(int id) {
		return (users.get(id));
	}

}
