package com.prem.share.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingWorker;
import javax.swing.table.AbstractTableModel;

import com.prem.share.common.GuiConstants;
import com.prem.share.common.GuiUtil;
import com.prem.share.common.NseShareConstant;
import com.prem.share.dm.NseScriptQuote;
import com.prem.share.dm.ScriptQuote;

public class QuotePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTable quoteTable = null;
	JButton refreshButton = null;
	QuoteTableModel model = null;
	JTextField scriptName = null;

	public QuotePanel() {
		init();
	}

	private void init() {
		// Init for Center panel for the table and model
		model = new QuoteTableModel();
		model.setColHeaders();
		
		quoteTable = new JTable(model);
		quoteTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		JScrollPane scrollPane = new JScrollPane(quoteTable);
		// scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		// scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		quoteTable.setFillsViewportHeight(true);
		quoteTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// End of init Center Panel

		// Init North Panel
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new BorderLayout());
		
		JPanel actionPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		refreshButton = new JButton(GuiConstants.REFRESH);
		refreshButton.setPreferredSize(new Dimension(110, 25));
		refreshButton.addActionListener(new RefreshActionListener());
		refreshButton.setMnemonic('R');
		refreshButton.setMultiClickThreshhold(500);
		actionPanel.add(refreshButton);
		
		JPanel scriptActionPanel = new JPanel();
		scriptName = new JTextField(20);
		JButton addButton = new JButton(GuiConstants.ADD_QUOTE);
		addButton.addActionListener(new AddActionListener());
		JButton deleteButton = new JButton(GuiConstants.DELETE_QUOTE);
		deleteButton.addActionListener(new DeleteActionListener());
		scriptActionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		scriptActionPanel.add(scriptName);
		scriptActionPanel.add(addButton);
		scriptActionPanel.add(deleteButton);
		
		northPanel.add(actionPanel, BorderLayout.EAST);
		northPanel.add(scriptActionPanel, BorderLayout.CENTER);
		// End of init North Panel

		this.setLayout(new BorderLayout());
		this.add(scrollPane, BorderLayout.CENTER);
		this.add(northPanel, BorderLayout.NORTH);
		this.setVisible(true);
		SwingWorker worker = new SwingWorker() {
			protected Object doInBackground() throws Exception {
				setRefreshIcon();
				ScriptQuote quote1 = new NseScriptQuote(
						NseShareConstant.NSE_JPINFRATEC, true);
				model.add(quote1);
				ScriptQuote quote2 = new NseScriptQuote(
						NseShareConstant.NSE_FORTIS, true);
				model.add(quote2);
				ScriptQuote quote3 = new NseScriptQuote(
						NseShareConstant.NSE_RNRL, true);
				model.add(quote3);
				return null;
			}

			public void done() {
				resetRefreshIconToText();
				model.fireTableDataChanged();
			}
		};
		worker.execute();
	}
	
	

	private void setRefreshIcon() {
		refreshButton.setText("");
		refreshButton.setIcon(GuiUtil
				.getIconFromResource("Fast_spinning_1.gif"));
		refreshButton.setRolloverIcon(GuiUtil
				.getIconFromResource("Fast_spinning_1.gif"));
		refreshButton.setRolloverSelectedIcon(GuiUtil
				.getIconFromResource("Fast_spinning_1.gif"));
	}

	private void resetRefreshIconToText() {
		refreshButton.setIcon(null);
		refreshButton.setRolloverSelectedIcon(null);
		refreshButton.setRolloverIcon(null);
		refreshButton.setText(GuiConstants.REFRESH);
	}

	private class RefreshActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			SwingWorker worker = new SwingWorker() {
				protected Object doInBackground() throws Exception {
					setRefreshIcon();
					int quoteListSize = model.quoteModel.size();
					for (int i = 0; i < quoteListSize; i++) {
						model.quoteModel.get(i).refresh();
					}
					return null;
				}

				public void done() {
					resetRefreshIconToText();
					model.fireTableDataChanged();
				}
			};
			worker.execute();
		}
	}

	private class AddActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			final String name = scriptName.getText().trim();
			if(!name.equals("")) {
				final NseScriptQuote newQuote = new NseScriptQuote(name, false);
				if (!model.quoteModel.contains(newQuote)) {
					model.quoteModel.add(newQuote);
					model.fireTableDataChanged();
				
					SwingWorker worker = new SwingWorker() {
						protected Object doInBackground() throws Exception {
							newQuote.refresh();						
							return null;
						}
		
						public void done() {
							model.fireTableDataChanged();
						}
					};
					worker.execute();
				}
			}
		}
	}

	private class DeleteActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int selectedRow = quoteTable.getSelectedRow();
			if (selectedRow != -1) {
				int nameColumnPosition = quoteTable.getColumnModel().getColumnIndex(GuiConstants.SCRIPT_NAME);
				int selectedrows[] = quoteTable.getSelectedRows();
				for (int i = 0; i < selectedrows.length; i++) {
					String scriptName = (String)quoteTable.getValueAt(selectedrows[i], nameColumnPosition);
					model.quoteModel.remove(new NseScriptQuote(scriptName));
				}
				model.fireTableDataChanged();
			}	
			else {
				//TODO: Show information message
			}
		}
	}

	public class QuoteTableModel extends AbstractTableModel implements
			GuiConstants {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private ArrayList<String> colHeaders = new ArrayList<String>();
		ArrayList<ScriptQuote> quoteModel = new ArrayList<ScriptQuote>();

		public void add(ScriptQuote rowData) {
			quoteModel.add(rowData);
		}

		private void setColHeaders() {
			colHeaders.add(SCRIPT_NAME);
			colHeaders.add(LAST_PRICE);
			colHeaders.add(CHANGE_WITH_PERCENTAGE);
//			colHeaders.add(CHANGE_PERCENTAGE);
			colHeaders.add(PREVIOUS_CLOSE);
			colHeaders.add(OPEN);
			colHeaders.add(DAY_H_L);
			colHeaders.add(W52_H_L);
//			colHeaders.add(HIGH);
//			colHeaders.add(LOW);
			colHeaders.add(DATA_AS_ON);
		}

		public String getColumnName(int col) {
			return (String) colHeaders.get(col);
		}

		@Override
		public int getColumnCount() {
			return colHeaders.size();
		}

		@Override
		public int getRowCount() {
			return quoteModel.size();
		}

		@Override
		public Object getValueAt(int row, int col) {
			Object value = null;
			if (row < quoteModel.size()) {
				ScriptQuote quote = (ScriptQuote) quoteModel.get(row);
				String colName = (String) colHeaders.get(col);
				if (colName.equals(SCRIPT_NAME)) {
					value = quote.getScriptName();
				} else if (colName.equals(LAST_PRICE)) {
					value = quote.getScriptLastPrice();
				} else if (colName.equals(CHANGE)) {
					value = quote.getScriptChange();
				} else if (colName.equals(CHANGE_PERCENTAGE)) {
					value = quote.getScriptChangePercentage();
				} else if (colName.equals(CHANGE_WITH_PERCENTAGE)) {
					value = quote.getScriptChange() + " (" + quote.getScriptChangePercentage() + ")";
				} else if (colName.equals(OPEN)) {
					value = quote.getScriptDayOpen();
				} else if (colName.equals(HIGH)) {
					value = quote.getScriptDayHigh();
				} else if (colName.equals(LOW)) {
					value = quote.getScriptDayLow();
				} else if (colName.equals(PREVIOUS_CLOSE)) {
					value = quote.getScriptClosePrice();
				} else if (colName.equals(DATA_AS_ON)) {
					value = quote.getScriptDataAsOn();
				} else if (colName.equals(W52_H_L)) {
					value = quote.getScript52WL() + " - " + quote.getScript52WH();
				} else if (colName.equals(DAY_H_L)) {
					value = quote.getScriptDayLow() + " - " + quote.getScriptDayHigh();
				}
			}
			return value;
		}
	}
}
