package com.globalrelay.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

	@Test
	void testValidate() throws Exception {		
		IValidator validate = new PasswordValidator();		
		assertEquals(false, validate.validate("abc", 5, 10));
		assertEquals(true, validate.validate("abdfc", 5, 10));
		assertEquals(true, validate.validate("1234567890", 5, 10));
		assertEquals(true, validate.validate("1234567", 5, 10));
		assertEquals(false, validate.validate("sdfsdfsdfsd", 5, 10));
	}

}
