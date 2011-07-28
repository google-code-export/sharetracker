/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IPV6.java
 *
 * Created on May 7, 2010, 10:28:57 PM
 */

package com.prem.share.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.prem.share.common.GuiConstants;
import com.prem.share.common.StStatusBar;
import com.prem.share.dm.Transaction;
import com.prem.share.dm.db.ShareBroker;
import com.prem.share.dm.db.ShareBrokerExample;
import com.prem.share.dm.db.dao.impl.ShareBrokerDAOImpl;
import com.prem.share.sharekhan.SharekhanHtmlParser;

/**
 *
 * @author Administrator
 */
public class TradePanel extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;

	JTable transactionTable = null;
//	JButton refreshButton = null;
	TransactionTableModel model = null;
	JTextField scriptName = null;
	StStatusBar statusBar = ShareWindow.getStatusBar();

    public TradePanel() {
        init();
    }
    
	private void init() {
		// Init for Center panel for the table and model
		model = new TransactionTableModel();
		model.setColHeaders();
		
		transactionTable = new JTable(model);
		transactionTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		JScrollPane scrollPane = new JScrollPane(transactionTable);
		// scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		// scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		transactionTable.setFillsViewportHeight(true);
		transactionTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		// End of init Center Panel

		// Init North Panel
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new BorderLayout());
		
		JPanel actionPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//		refreshButton = new JButton(GuiConstants.REFRESH);
//		refreshButton.setPreferredSize(new Dimension(110, 25));
//		refreshButton.addActionListener(new RefreshActionListener());
//		refreshButton.setMnemonic('R');
//		refreshButton.setMultiClickThreshhold(500);
//		actionPanel.add(refreshButton);
		
		JPanel transactionActionPanel = new JPanel();
		scriptName = new JTextField(20);
		JButton browseButton = new JButton(GuiConstants.BROWSE);
		browseButton.addActionListener(new BrowseActionListener());
		JButton saveButton = new JButton(GuiConstants.SAVE_TO_DB);
		saveButton.addActionListener(new SaveActionListener());
		transactionActionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		transactionActionPanel.add(scriptName);
		transactionActionPanel.add(browseButton);
		transactionActionPanel.add(saveButton);
		
		northPanel.add(actionPanel, BorderLayout.EAST);
		northPanel.add(transactionActionPanel, BorderLayout.CENTER);
		// End of init North Panel

		this.setLayout(new BorderLayout());
		this.add(scrollPane, BorderLayout.CENTER);
		this.add(northPanel, BorderLayout.NORTH);
		this.setVisible(true);
	}

	private class RefreshActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

		}
	}

	private class BrowseActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
		    // Note: source for ExampleFileFilter can be found in FileChooserDemo,
		    // under the demo/jfc directory in the Java 2 SDK, Standard Edition.
//		    ExampleFileFilter filter = new JFileFilter();
//		    filter.addExtension("jpg");
//		    filter.addExtension("gif");
//		    filter.setDescription("JPG & GIF Images");
//		    chooser.setFileFilter(filter);
		    int returnVal = chooser.showOpenDialog(TradePanel.this);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       try {
				scriptName.setText(chooser.getSelectedFile().getCanonicalPath());
				SharekhanHtmlParser parser = new SharekhanHtmlParser();
				HashSet<Transaction> transactions = parser.parse(scriptName.getText());
				Iterator<Transaction> iter = transactions.iterator();
				while (iter.hasNext()) {
					Transaction transaction = iter.next();
					transaction.setTransactionType(transaction.getTranType().toString());
					model.add(transaction);
				}
				model.fireTableDataChanged();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    }
			
		}
	}

	private class SaveActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
		}
	}

	public class TransactionTableModel extends AbstractTableModel implements
			GuiConstants {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private ArrayList<String> colHeaders = new ArrayList<String>();
		ArrayList<Transaction> transactionModel = new ArrayList<Transaction>();

		public void add(Transaction rowData) {
			transactionModel.add(rowData);
		}

		private void setColHeaders() {
			colHeaders.add(companyName);
			colHeaders.add(shareKhanCode);
			colHeaders.add(nseCode);
			colHeaders.add(transaction);
			colHeaders.add(quantityBought);
			colHeaders.add(quantitySold);
			colHeaders.add(ratePerShare);
			colHeaders.add(totalCost);
			colHeaders.add(brokerageTotal);
			colHeaders.add(serviceTax);
			colHeaders.add(stt);
			colHeaders.add(clientCode);
			colHeaders.add(contractNumber);
			colHeaders.add(tradeDate);
		}

		@Override
		public void setValueAt(Object value, int row, int col) {
			Transaction transaction = transactionModel.get(row);
	        transaction.setScriptScriptId((String)value);
	        fireTableCellUpdated(row, col);
	    }
		
		@Override
		public String getColumnName(int col) {
			return colHeaders.get(col);
		}

		@Override
		public int getColumnCount() {
			return colHeaders.size();
		}
		
		@Override
		public boolean isCellEditable(int row, int col) {
	        //Note that the data/cell address is constant,
	        //no matter where the cell appears onscreen.
	        if (col == 2) {
	            return true;
	        } else {
	            return false;
	        }
	    }
		
		@Override
		public int getRowCount() {
			return transactionModel.size();
		}

		@Override
		public Object getValueAt(int row, int col) {
			Object value = null;
			if (row < transactionModel.size()) {
				Transaction transaction = transactionModel.get(row);
				String colName = colHeaders.get(col);
				if (colName.equals(companyName)) {
					value = transaction.getCompanyName();
				} else if (colName.equals(shareKhanCode)) {
					value = transaction.getSharekhanCode();
				} else if (colName.equals(nseCode)) {
					value = transaction.getScriptScriptId();
				} else if (colName.equals(GuiConstants.transaction)) {
					value = transaction.getTransactionType();
				} else if (colName.equals(quantityBought)) {
					value = transaction.getQuantityBough();
				} else if (colName.equals(quantitySold)) {
					value = transaction.getQuantitySold();
				} else if (colName.equals(ratePerShare)) {
					value = transaction.getPrice();
				} else if (colName.equals(totalCost)) {
					value = transaction.getMarketValue();
				} else if (colName.equals(brokerageTotal)) {
					value = transaction.getBrokerageTotal();
				} else if (colName.equals(serviceTax)) {
					value = transaction.getServiceTax();
				} else if (colName.equals(stt)) {
					value = transaction.getStt();
				} else if (colName.equals(clientCode)) {
					value = transaction.getClientCode();
				} else if (colName.equals(contractNumber)) {
					value = transaction.getContractNo();
				}else if (colName.equals(tradeDate)) {
					Date date = transaction.getTransactionDate();
					String dateString = "" + date.getDate() + "/" + date.getMonth() + "/" + date.getYear(); 
					value = dateString;
				}
			}
			return value;
		}
	}
	

    public static void main(String argv[]) {
    	ShareBrokerExample sb = new ShareBrokerExample();
    	sb.createCriteria().andNameEqualTo("Sharekhan");
    	
    	Resource resource = new FileSystemResource(
    		"sharetracker/sharetracker/src/com/prem/share/dm/db/maps/spring-ibatis.xml");
//    	Resource classPathResource = new ClassPathResource(
//		"spring-ibatis.xml");
    	BeanFactory beanFactory = new XmlBeanFactory(resource);
    	ShareBrokerDAOImpl share_brokerImpl = (ShareBrokerDAOImpl)beanFactory.getBean("share_broker");
    	List<ShareBroker> ls = share_brokerImpl.selectShareBrokerByExample(sb);

    	for(int i =0 ; i<ls.size(); i++) {
    		System.out.println("Name: " + ls.get(i).getId());
    		System.out.println("Name: " + ls.get(i).getName());
    		System.out.println("Name: " + ls.get(i).getDescription());
    	}
    }
}
