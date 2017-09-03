package com.servicestraining.userservices.product.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.servicestraining.userservices.product.dao.UserDAO;
import com.servicestraining.userservices.product.dto.User;

public class UserDAOImplTest {

	@Test
	public void createShouldCreateAUser() {
		UserDAO dao = new UserDAOImpl();
		User u = new User();
		
		u.setId(1);
		u.setName("Mike");
		u.setEmail("mahzarasua@hotmail.com");
		
		dao.create(u);
		
		User result = dao.read(1);
		
		assertNotNull(result);
		assertEquals(result.getName(),"Mike");
		
	}

}
