package com.prem.share.dm;

import java.net.MalformedURLException;
import java.net.URL;

import com.prem.share.common.HttpRequester;
import com.prem.share.common.NseShareConstant;

public class NseQuoteParser {
	// "http://nseindia.com/marketinfo/equities/ajaxGetQuote.jsp?symbol=JPPOWER&series=EQ");
	private static final String ajaxGetQuote = "http://nseindia.com/marketinfo/equities/ajaxGetQuote.jsp?";
	private static final String SYMBOL = "symbol=";

	public static String[] getQuote(String scriptName) {
		StringBuilder urlString = new StringBuilder();
		urlString.append(ajaxGetQuote).append(SYMBOL).append(scriptName);
		System.out.println("Querry sent for " + scriptName);
		URL url = null;
		try {
			url = new URL(urlString.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return quoteResponceParser(HttpRequester.getRequest(url));
	}

	private static String[] quoteResponceParser(String data) {
		String[] splitdata = data.split(";");
		if(splitdata.length == NseShareConstant.MAX_SCRIPT_EXPECTED) {
			System.out.println("Request is sucessful with length " + splitdata.length);
		}
		else {
			System.out.println("Request failed " + splitdata.length);
			String cloneData[] = NseShareConstant.DUMMNY_DATA.clone();
			cloneData[NseShareConstant.SCRIPT_DATA_AS_ON] = "ERROR";
			splitdata = cloneData;
		}
		return splitdata;
	}
}
