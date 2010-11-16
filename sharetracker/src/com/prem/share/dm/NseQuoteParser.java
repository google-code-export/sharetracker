package com.prem.share.dm;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.prem.share.common.HttpRequester;
import com.prem.share.common.NseShareConstant;

public class NseQuoteParser {
	private static final String HEADER_REFERER = "Referer";
	private static final String ajaxGetQuote = "http://nseindia.com/marketinfo/equities/ajaxGetQuote.jsp?";
	private static final String SYMBOL = "symbol=";
	private static final String HEADER_REFERER_VALUE = "http://www.nseindia.com/marketinfo/companyinfo/companysearch.jsp?cons=";
	private static final String HEADER_REFERER_VALUE_SECTION = "&section=7";
//	static Logger logger = Logger.getLogger("com.prem.share.dm.NseQuoteParser");
	public static String[] getQuote(String scriptName) {
		StringBuilder urlString = new StringBuilder();
		urlString.append(ajaxGetQuote).append(SYMBOL).append(scriptName);
		
		System.out.println("Querry sent for " + scriptName);
		URL url = null;
		try {
			url = new URL(urlString.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
//			logger.error(e);
		}
		Map<String, String> header = new HashMap();
		header.put(HEADER_REFERER,
				HEADER_REFERER_VALUE + scriptName + HEADER_REFERER_VALUE_SECTION);
		HttpRequester request = null;
		try {
			request = new HttpRequester(url, header);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return quoteResponceParser(request.getRequest());
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
