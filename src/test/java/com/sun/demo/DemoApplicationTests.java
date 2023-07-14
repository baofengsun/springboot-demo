package com.sun.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {

		System.out.println("test");
		System.out.println("test1");

		Assertions.assertTrue(false);
	}

}
