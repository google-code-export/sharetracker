package com.prem.share.sharekhan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

import com.prem.share.common.TransactionConstants;
import com.prem.share.dm.Transaction;

public class SharekhanHtmlParser {

	Transaction transaction = null;
	HashSet transactions = new HashSet<Transaction>();
	String transactionDate = null;
	String clientCode = null;
	String contractNumber = null;
	
	public SharekhanHtmlParser() {
	}

	public HashSet parse(String path) {
		if (path != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(path));

				new ParserDelegator().parse(reader,
						new SharekhanCallbackHandler(), true);
			} catch (IOException ioe) {
				System.out.println("IOE: " + ioe);
			}
		}
		Iterator< Transaction> trans = transactions.iterator();
		while (trans.hasNext()) {
			Transaction transaction = (Transaction) trans.next();
			transactionDate.trim();
			String[] dateArray = transactionDate.split("/");
			Date d = new Date(Integer.parseInt(dateArray[2]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[0]));
			transaction.setTransactionDate(d);
			transaction.setClientCode(clientCode);
			transaction.setContractNo(Integer.parseInt(contractNumber));
		}
		return transactions;
	}

	private class SharekhanCallbackHandler extends HTMLEditorKit.ParserCallback {
		private short transactionState = 0;
		private boolean transactionStart;
		private boolean contractStart;
		private boolean clientCodeStart;
		private boolean tradeDateStart;
		/**
		 * Creates the CallbackHandler.
		 */
		public SharekhanCallbackHandler() {
		}

		public void handleText(char[] data, int pos) {
			String text = (new String(data)).trim();
			if (text.equals("Contract Note No")) {
				contractStart = true;
			}
			else if (contractStart) {
				System.out.println("Contract Number: " + text);
				contractNumber = text;
				contractStart = false;
			}
			if (text.equals("Client Code")) {
				clientCodeStart = true;
			}
			else if (clientCodeStart) {
				System.out.println("Client Code: " + text);
				clientCode = text;
				clientCodeStart = false;
			}
			else if (text.equals("Contract Note Date")) {
				tradeDateStart = true;
			}
			else if (tradeDateStart) {
				System.out.println("Trade Date: " + text);
				transactionDate = text;
				tradeDateStart = false;
			}		
			else if (text.startsWith("As Per Annexure")) {
				transactionStart = true;
				transactionState++;
				System.out.println("Transaction Begins >>>>>>>");
				if(transaction == null) {
					transactions.clear();
					transaction = new Transaction();
				}
			}
			else if (transactionStart) {
				transactionParser(text);
			}
		}

		private void transactionParser (String text) {
			text.trim();
			if(text.startsWith(" ")) {
				text = text.substring(2).trim();
				if(text.endsWith(" ")) {
					text = text.substring(0,text.length()-2).trim();				}
			}
			switch (transactionState) {
			case 1:
				System.out.println("Company Name: " + text);
				transaction.setCompanyName(text);
				transactionState++;
				break;
			case 2:
				System.out.println("Quantity bought: " + text);
				if(!text.trim().equals("")) {
					transaction.setQuantityBough(Integer.parseInt(text));
					transaction.setTranType(TransactionConstants.TransactionType.BUY);
				}
				else {
					transaction.setQuantityBough(0);
				}
				transactionState++;
				break;
			case 3:
				System.out.println("Quantity Sold: " + text);
				if(!text.trim().equals("")) {
					transaction.setQuantitySold(Integer.parseInt(text));
					transaction.setTranType(TransactionConstants.TransactionType.SELL);
				}
				else {
					transaction.setQuantitySold(0);
				}
				transactionState++;
				break;
			case 4:
				System.out.println("Rate per share: " + text);
				transaction.setPrice(BigDecimal.valueOf(Float.parseFloat(text)));
				transactionState++;
				break;
			case 5:
				System.out.println("Total cost: " + text);
				transaction.setMarketValue(BigDecimal.valueOf(Float.parseFloat(text)));
				transactionState++;
				break;
			case 6:
				System.out.println("Brokerage total: " + text);
				transaction.setBrokerageTotal(Float.parseFloat(text));
				transactionState++;
				break;
			case 7:
				System.out.println("Service Tax: " + text);
				transaction.setServiceTax(Float.parseFloat(text));
				transactionState++;
				break;
			case 8:
				System.out.println("STT: " + text);
				transaction.setStt(Float.parseFloat(text));
				transactionState++;
				break;
			case 9:
				System.out.println("Amount: " + text);
				transaction.setActualValue(BigDecimal.valueOf(Float.parseFloat(text)));
				transactionState++;
				break;
			}
		}
		
		public void handleStartTag(HTML.Tag t, MutableAttributeSet a, int pos) {
			
		}

		public void handleEndTag(HTML.Tag t, int pos) {
			if (transactionStart && t.equals(HTML.Tag.TR)) {
				transactionStart = false;
				transactionState = 0;
				transactions.add(transaction.clone());
				System.out.println("Transaction Ends");
			}
		}
	}
	
	public static void main(String argv[]) {
	}
}
