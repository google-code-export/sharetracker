package com.prem.share.dm;

import com.prem.share.common.TransactionConstants;
import com.prem.share.common.TransactionConstants.TransactionType;
import com.prem.share.dm.db.EquityTransaction;

public class Transaction extends EquityTransaction implements Cloneable {
	private String companyName;
	private String sharekhanCode;
	private int quantityBough;
	private int quantitySold;
	private float brokerageTotal;
	private float serviceTax;
	private float stt;
	private TransactionConstants.TransactionType transactionType;
	private TransactionConstants.TransactionMode transactionMode;
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setSharekhanCode(String sharekhanCode) {
		this.sharekhanCode = sharekhanCode;
	}

	public String getSharekhanCode() {
		return sharekhanCode;
	}

	public void setQuantityBough(int quantityBough) {
		this.quantityBough = quantityBough;
	}

	public int getQuantityBough() {
		return quantityBough;
	}

	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}

	public int getQuantitySold() {
		return quantitySold;
	}

	public void setBrokerageTotal(float brokerageTotal) {
		this.brokerageTotal = brokerageTotal;
	}

	public float getBrokerageTotal() {
		return brokerageTotal;
	}

	public void setServiceTax(float serviceTax) {
		this.serviceTax = serviceTax;
	}

	public float getServiceTax() {
		return serviceTax;
	}

	public void setStt(float stt) {
		this.stt = stt;
	}

	public float getStt() {
		return stt;
	}

	public void setTranType(TransactionConstants.TransactionType type) {
		transactionType = type;
	}
	
	public TransactionConstants.TransactionType getTranType() {
		return transactionType;
	}
	
	public TransactionConstants.TransactionMode getTranMode() {
		return transactionMode;
	}

	public void setTranMode(TransactionConstants.TransactionMode mode) {
		transactionMode = mode;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
