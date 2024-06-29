package com.dio.web_api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dio.web_api.repository.UserRepository;

@SpringBootTest
class MyFirstWebApiApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	void testFindAllUsers(){
		Assertions.assertTrue(true);
	}


}
