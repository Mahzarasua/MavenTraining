package com.servicestraining.userservices.product.bo.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.servicestraining.userservices.product.bo.UserBO;
import com.servicestraining.userservices.product.dao.UserDAO;
import com.servicestraining.userservices.product.dao.impl.UserDAOImpl;
import com.servicestraining.userservices.product.dto.User;



public class UserBOImplTest {

	@Test
	public void createBOShouldCreateAUser() {
		UserDAO dao = new UserDAOImpl();
		UserBO bo = new UserBOImpl();
		User u = new User();
		
		u.setId(1);
		u.setName("Mike");
		u.setEmail("mahzarasua@hotmail.com");
		
		((UserBOImpl) bo).setDao(dao);
		
		bo.create(u);
		
		User result = bo.findUser(1);
		
		assertNotNull(result);
		assertEquals(result.getName(),"Mike");
		
	}

}
