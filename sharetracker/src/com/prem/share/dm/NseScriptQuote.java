package com.prem.share.dm;

import com.prem.share.common.NseShareConstant;

public class NseScriptQuote implements ScriptQuote {

	String scriptName = null;
	String[] data = NseShareConstant.DUMMNY_DATA;

	public NseScriptQuote(String scriptName) {
		this(scriptName, false);
	}

	public NseScriptQuote(String scriptName, boolean refresh) {
		setScriptName(scriptName);
		if (refresh) {
			refresh();
		}
	}

	@Override
	public double getScript52WH() {
		return Double.parseDouble(data[NseShareConstant.SCRIPT_52_WEEK_HIGH]);
	}

	@Override
	public double getScript52WL() {
		return Double.parseDouble(data[NseShareConstant.SCRIPT_52_WEEK_LOW]);
	}

	@Override
	public double getScriptChange() {
		String change = data[NseShareConstant.SCRIPT_CHANGE];
		if ("-".equals(change)) {
			change = "0";
		}
		return Double.parseDouble(change);
	}

	@Override
	public double getScriptChangePercentage() {
		String closePrice = data[NseShareConstant.SCRIPT_CHANGE_PERCENTAGE];
		double value = 0.0;
		if (!closePrice.trim().equalsIgnoreCase("-")) {
			value = Double
					.parseDouble(data[NseShareConstant.SCRIPT_CHANGE_PERCENTAGE]);
		}
		return value;
	}

	@Override
	public double getScriptClosePrice() {
		String closePrice = data[NseShareConstant.SCRIPT_CLOSE_PRICE];
		double value = 0.0;
		if (!closePrice.trim().equalsIgnoreCase("-")) {
			value = Double
					.parseDouble(data[NseShareConstant.SCRIPT_CLOSE_PRICE]);
		}
		return value;
	}

	@Override
	public String getScriptCompanyName() {
		return data[NseShareConstant.SCRIPT_COMPANY_NAME];
	}

	@Override
	public String getScriptDataAsOn() {
		return data[NseShareConstant.SCRIPT_DATA_AS_ON];
	}

	@Override
	public double getScriptDayHigh() {
		return Double.parseDouble(data[NseShareConstant.SCRIPT_DAY_HIGH]);
	}

	@Override
	public double getScriptDayLow() {
		return Double.parseDouble(data[NseShareConstant.SCRIPT_DAY_LOW]);
	}

	@Override
	public double getScriptDayOpen() {
		return Double.parseDouble(data[NseShareConstant.SCRIPT_DAY_OPEN]);
	}

	@Override
	public double getScriptLastPrice() {
		String closePrice = data[NseShareConstant.SCRIPT_LAST_PRICE];
		double value = 0.0;
		if (!closePrice.trim().equalsIgnoreCase("-")) {
			value = Double
					.parseDouble(data[NseShareConstant.SCRIPT_LAST_PRICE]);
		}
		return value;
	}

	@Override
	public String getScriptName() {
		return scriptName;
	}

	@Override
	public double getScriptPreviousClose() {
		return Double.parseDouble(data[NseShareConstant.SCRIPT_PREVIOUS_CLOSE]);
	}

	@Override
	public long getScriptTotalTradeQuantity() {
		return Long
				.parseLong(data[NseShareConstant.SCRIPT_TOTAL_TRADE_QUANTITY]);
	}

	@Override
	public String getScriptType() {
		return data[NseShareConstant.SCRIPT_TYPE];
	}

	@Override
	public void setScript52WH(double high52Week) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScript52WL(double low52Week) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScriptChange(double change) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScriptChangePercentage(double changePercentage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScriptClosePrice(double closePrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScriptCompanyName(String companyName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScriptDataAsOn(String dataAsOn) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScriptDayHigh(double dayHigh) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScriptDayLow(double dayLow) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScriptDayOpen(double dayOpen) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScriptLastPrice(double lastPrice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScriptName(String name) {
		this.scriptName = name;

	}

	@Override
	public void setScriptPreviousClose(double previousClose) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScriptTotalTradeQuantity(long totalTradeQuantity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setScriptType(String Type) {
		// TODO Auto-generated method stub

	}

	public void refresh() {
		data = NseQuoteParser.getQuote(getScriptName());
	}

    public boolean equals(Object obj) {
    	boolean equal = false;
    	if(obj != null && obj instanceof NseScriptQuote) {
    		equal = ((NseScriptQuote)obj).getScriptName().equalsIgnoreCase(this.getScriptName());	
    	}
    	return equal;
    }

}
