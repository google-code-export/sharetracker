package com.prem.share.common;

public interface NseShareConstant {

	// Data position based on the response from nseindia.com
	// "http://nseindia.com/marketinfo/equities/ajaxGetQuote.jsp?symbol=JPPOWER&series=EQ"
	public static final int SCRIPT_NAME = 1;
	public static final int SCRIPT_TYPE = 2;
	public static final int SCRIPT_52_WEEK_HIGH = 7;
	public static final int SCRIPT_52_WEEK_LOW = 8;
	public static final int SCRIPT_PREVIOUS_CLOSE = 9;
	public static final int SCRIPT_DAY_OPEN = 10;
	public static final int SCRIPT_DAY_HIGH = 11;
	public static final int SCRIPT_DAY_LOW = 12;
	public static final int SCRIPT_LAST_PRICE = 14;
	public static final int SCRIPT_CHANGE = 15;
	public static final int SCRIPT_CHANGE_PERCENTAGE = 16;
	public static final int SCRIPT_TOTAL_TRADE_QUANTITY = 17;
	public static final int SCRIPT_CLOSE_PRICE = 61;
	public static final int SCRIPT_COMPANY_NAME = 51;
	public static final int SCRIPT_DATA_AS_ON = 62;

	public static final int MAX_SCRIPT_EXPECTED = 66;
	public static final String[] DUMMNY_DATA = {"0","0","0","0","0","0","0","0","0","0",
		"0","0","0","0","0","0","0","0","0","0",
		"0","0","0","0","0","0","0","0","0","0",
		"0","0","0","0","0","0","0","0","0","0",
		"0","0","0","0","0","0","0","0","0","0",
		"0","0","0","0","0","0","0","0","0","0",
		"0","0","0","0","0","0"}; 
	                           
	public static final String NSE_JPHYDRO = "JPPOWER";
	public static final String NSE_SATYAM = "SATYAMCOMP";
	public static final String NSE_RNRL = "RNRL";
	public static final String NSE_AQUA = "AQUA";
	public static final String NSE_FORTIS = "FORTIS";
	public static final String NSE_JPINFRATEC = "JPINFRATEC";

}
