package com.globalrelay.service;

public class PasswordValidator implements IValidator {

	@Override
	public boolean validate(String password, int minLen, int maxLen) throws Exception {
		int passwordLength = password == null ? 0 : password.length();
		return (passwordLength >= minLen && passwordLength <= maxLen);
	}

}
