package com.globalrelay.service;

public class GlobalRelayMain {

	
	
	public static void main(String[] args) {
		IValidator validate = new PasswordValidator();
		try {
			boolean isValidPasword = validate.validate("abcd", 5, 10);
			System.out.println(validate.validate("1234567890", 5, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
