package com.globalrelay.service;

public interface IValidator {
	
	public boolean validate(String password, int minLen, int maxLen) throws Exception;

}
