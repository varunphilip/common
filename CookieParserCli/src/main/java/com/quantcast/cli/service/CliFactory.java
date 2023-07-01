package com.quantcast.cli.service;

import com.quantcast.cli.reader.CsvReader;
import com.quantcast.cli.reader.IFileReader;

public class CliFactory {

	public IFileReader getFileReader() {
		return new CsvReader();
	}
	
	
}
