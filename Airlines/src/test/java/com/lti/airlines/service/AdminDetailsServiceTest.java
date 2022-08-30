package com.lti.airlines.service;

import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.lti.airlines.AirlinesApplication;
import com.lti.airlines.model.AdminDetails;


@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest(classes = AirlinesApplication.class)
class AdminDetailsServiceTest {

	@Autowired
	AdminDetailsService ser;
	
	@Test
	void loginAdminTest() {
		AdminDetails a = new AdminDetails("admin","admin");
		assertEquals(a.getUserid(), ser.getAdminDetails().get(0).getUserid());
	}

}
