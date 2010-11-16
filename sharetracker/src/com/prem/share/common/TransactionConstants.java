package com.prem.share.common;

public interface TransactionConstants {

	public enum TransactionType {
	    BUY, SELL, IPO, BONUS, SPLIT 
	}
	
	public enum TransactionMode {
	    INTRA_TRADE, DELIVARY 
	}
}
