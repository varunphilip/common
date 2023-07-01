package com.quantcast.cli.service;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.quantcast.cli.CookieParserCliMain;
import com.quantcast.cli.model.CookieVo;
import com.quantcast.cli.reader.IFileReader;
import com.quantcast.cli.utils.CliUtils;

public class CliService implements ICliService {

	@Override
	public void filterCookies(List<CookieVo> cookies, String cookieId) throws Exception {
		CookieParserCliMain.results = cookies.stream().filter(item -> item.getCookie().equals(cookieId)).collect(Collectors.toList());
	}

	@Override
	public void filterCookies(List<CookieVo> cookies, Date cookieDate) throws Exception {
		CookieParserCliMain.results = new CliUtils().filterCookies(cookies, cookieDate);
	}

	@Override
	public void findActiveCookies(File file, Date cookieDate) throws Exception {
		IFileReader fileReader = new CliFactory().getFileReader();
		if(cookieDate == null)
			CookieParserCliMain.results = fileReader.findActiveCookies(file);
		else
			CookieParserCliMain.results = fileReader.findActiveCookies(file, cookieDate);
	}

	@Override
	public void findActiveCookies(Date cookieDate) throws Exception {
		CliUtils utils = new CliUtils();
		if(cookieDate == null)
			CookieParserCliMain.results = utils.findActiveCookies();
		else
			CookieParserCliMain.results = utils.findActiveCookies(cookieDate);
		
	}

	@Override
	public void listAll(File file) throws Exception {
		IFileReader fileReader = new CliFactory().getFileReader();
		CookieParserCliMain.results = fileReader.read(file);		
	}

	@Override
	public void list(File file, Date cookieDate) throws Exception {
		IFileReader fileReader = new CliFactory().getFileReader();
		CookieParserCliMain.results = fileReader.read(file, cookieDate);	
		
	}

	@Override
	public void list(File file, String cookieId) throws Exception {
		IFileReader fileReader = new CliFactory().getFileReader();
		CookieParserCliMain.results = fileReader.read(file, cookieId);	
		
	}

}
