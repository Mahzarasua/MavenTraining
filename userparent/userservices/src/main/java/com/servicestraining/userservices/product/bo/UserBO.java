package com.servicestraining.userservices.product.bo;

import com.servicestraining.userservices.product.dto.User;

public interface UserBO {
	public void create(User u);

	public User findUser(int id);
}
