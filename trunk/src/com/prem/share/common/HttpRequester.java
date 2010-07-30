package com.prem.share.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HttpRequester {

	public static String getRequest(URL url) {
		StringBuilder data = new StringBuilder("");
		try {
			URLConnection conn = url.openConnection();
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn
					.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
				if (line.trim().length() > 0) {
					data.append(line);
				}
			}
			rd.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return data.toString();
	}
}
