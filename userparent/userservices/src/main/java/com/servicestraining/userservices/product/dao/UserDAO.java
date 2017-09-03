package com.servicestraining.userservices.product.dao;

import com.servicestraining.userservices.product.dto.User;

public interface UserDAO {
	void create(User u);

	User read(int id);
}
