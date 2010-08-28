package com.prem.share.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class UrlRequester {

	public static void request() {
		try {
		    // Construct data
//		    String data = URLEncoder.encode("key1", "UTF-8") + "=" + URLEncoder.encode("value1", "UTF-8");
//		    data += "&" + URLEncoder.encode("key2", "UTF-8") + "=" + URLEncoder.encode("value2", "UTF-8");

		    // Send data
		    URL url = new URL("http://www.nseindia.com/marketinfo/companyinfo/companysearch.jsp?cons=ghcl&section=7");
		    URLConnection conn = url.openConnection();
		    conn.setDoOutput(true);
//		    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
//		    wr.write(data);
//		    wr.flush();

		    // Get the response
		    BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		    String line;
		    while ((line = rd.readLine()) != null) {
		        // Process line...
		    	System.out.println(line);
		    }
//		    wr.close();
		    rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String argc[]) {
		UrlRequester.request();
	}
}
