package com.tecsup.minishop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MinishopApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void errorDeliberado() {
		assertEquals(99999, 1);
	}

}
