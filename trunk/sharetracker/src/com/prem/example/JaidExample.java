package com.prem.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

public class JaidExample extends JDialog //implements ActionListener 
{
	/**
	 * 
	 */
//	private static final long serialVersionUID = 6625817032440022521L;
//	BorderLayout mainLayout;
//	JPanel mainSyslogPanel, mainTablePanel, mainButtonPanel, sysLogLabelPanel,
//			sysLogTablePanel, rightButtonPanel;
//	JLabel syslogLabel;
//	JButton okayButton, cancelButton, applyButton, helpButton, importButton,
//			printButton;
//	Point launchPoint;
//	private SortableTable sysLogTable = null;
//
//	private SysLogGenTableModel tableModel = null;
//	private AutoFilterTableHeader reportHeader = null;
//	private JFileChooser fileChooser = null;
//
//	public JaidExample() {
//		initialiseComponents();
//
//	}
//
//	private void initialiseComponents() {
//		Container contentPane = getContentPane();
//
//		fileChooser = new JFileChooser();
//
//		launchPoint = new Point(100, 50);
//		mainLayout = new BorderLayout();
//		contentPane.setLayout(mainLayout);
//		/* Initializing the table */
//
//		initTable();
//
//		mainTablePanel = getMainTablePanel();
//		mainButtonPanel = getMainButtonPanel();
//		contentPane.add(mainTablePanel, BorderLayout.WEST);
//		contentPane.add(mainButtonPanel, BorderLayout.SOUTH);
//		setIconImage(Toolkit.getDefaultToolkit().getImage("logo32.gif"));
//		setTitle("SysLog Generation");
//		setLocation(launchPoint);
//		setMinimumSize(new Dimension(700, 600));
//		setVisible(true);
//		addingActionListeners();
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//
//	}
//
//	private void addingActionListeners() {
//		okayButton.addActionListener(this);
//		cancelButton.addActionListener(this);
//		helpButton.addActionListener(this);
//		applyButton.addActionListener(this);
//		printButton.addActionListener(this);
//		importButton.addActionListener(this);
//
//	}
//
//	private void initTable() {
//		tableModel = new SysLogGenTableModel();
//
//		IFilterableTableModel filterableTableModel = new FilterableTableModel(
//				tableModel);
//		SortableTableModel sortableTableModel = new SortableTableModel(
//				filterableTableModel);
//		sysLogTable = new SortableTable(sortableTableModel);
//
//		sysLogTable.setAutoscrolls(true);
//		sysLogTable
//				.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//		reportHeader = new AutoFilterTableHeader(sysLogTable);
//		reportHeader.setAutoFilterEnabled(true);
//		reportHeader.setShowFilterIcon(true);
//		reportHeader.setShowFilterNameAsToolTip(true);
//		sysLogTable.setTableHeader(reportHeader);
//	}
//
//	private JPanel getMainButtonPanel() {
//		mainButtonPanel = new JPanel();
//		mainButtonPanel.setLayout(new GridBagLayout());
//		okayButton = new JButton("OK");
//		cancelButton = new JButton("Cancel");
//		applyButton = new JButton("Apply");
//		helpButton = new JButton("Help");
//
//		mainButtonPanel.add(okayButton, new GridBagConstraints(0, 0, 1, 1, 0.0,
//				0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//				new Insets(10, 425, 10, 0), 0, 0));
//		mainButtonPanel.add(cancelButton, new GridBagConstraints(1, 0, 1, 1,
//				0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//				new Insets(10, 5, 10, 0), 0, 0));
//		mainButtonPanel.add(applyButton, new GridBagConstraints(2, 0, 1, 1,
//				0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//				new Insets(10, 5, 10, 0), 0, 0));
//		mainButtonPanel.add(helpButton, new GridBagConstraints(3, 0, 1, 1, 0.0,
//				0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//				new Insets(10, 5, 10, 10), 0, 0));
//
//		return mainButtonPanel;
//	}
//
//	private JPanel getMainTablePanel() {
//		mainTablePanel = new JPanel();
//		mainTablePanel.setLayout(new GridBagLayout());
//		sysLogTablePanel = getSysLogTablePanel();
//		sysLogLabelPanel = getSysLogLabelPanel();
//		rightButtonPanel = getRtButtonPanel();
//
//		mainTablePanel.add(sysLogLabelPanel, new GridBagConstraints(0, 0, 1, 1,
//				0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//				new Insets(0, 10, 0, 0), 0, 0));
//		mainTablePanel.add(sysLogTablePanel, new GridBagConstraints(0, 1, 1, 1,
//				0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//				new Insets(0, 10, 0, 0), 0, 0));
//
//		mainTablePanel.add(rightButtonPanel, new GridBagConstraints(1, 1, 1, 1,
//				0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//				new Insets(0, 0, 0, 0), 0, 0));
//
//		return mainTablePanel;
//	}
//
//	private JPanel getRtButtonPanel() {
//		rightButtonPanel = new JPanel();
//		rightButtonPanel.setLayout(new GridBagLayout());
//		importButton = new JButton("Import");
//		printButton = new JButton("Print");
//		rightButtonPanel.add(importButton, new GridBagConstraints(0, 0, 1, 1,
//				0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//				new Insets(0, 70, 0, 0), 0, 0));
//		rightButtonPanel.add(printButton, new GridBagConstraints(0, 1, 1, 1,
//				0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
//				new Insets(10, 70, 0, 0), 0, 0));
//
//		return rightButtonPanel;
//	}
//
//	private JPanel getSysLogTablePanel() {
//		sysLogTablePanel = new JPanel();
//		Border margin = new EmptyBorder(2, 2, (int) 0.5, 1);
//		sysLogTablePanel.setBorder(new CompoundBorder(new LineBorder(
//				Color.gray, 1), margin));
//		sysLogTablePanel.setLayout(new GridBagLayout());
//		JScrollPane tablePane = new JScrollPane();
//		tablePane.getViewport().setBackground(Color.WHITE);
//		sysLogTable.getTableHeader().setReorderingAllowed(false);
//		tablePane.setViewportView(sysLogTable);
//		sysLogTablePanel.add(tablePane);
//		return sysLogTablePanel;
//	}
//
//	private JPanel getSysLogLabelPanel() {
//
//		sysLogLabelPanel = new JPanel();
//		sysLogLabelPanel.setBorder(new LineBorder(Color.gray, 1));
//		sysLogLabelPanel.setLayout(new BorderLayout());
//		syslogLabel = new HLabel("  Syslog Generation Tracking", true);
//		sysLogLabelPanel.add(syslogLabel, BorderLayout.CENTER);
//		return sysLogLabelPanel;
//
//	}
//
//	public static void main(String[] args) {
//		new JaidExample();
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource().equals(printButton)) {
//			int[] row = sysLogTable.getSelectedRows();
//			
//			for (int count = 0; count < row.length; count++) {
//				printValues(tableModel.getSysLogEntry(row[count]));
//			}
//
//		}
//		if (e.getSource().equals(cancelButton)) {
//			System.exit(0);
//		}
//		if (e.getSource().equals(importButton)) {
//			File file = null;
//			fileChooser.addChoosableFileFilter(new CSVFilter());
//			int res = fileChooser.showOpenDialog(JaidExample.this);
//			if (res == JFileChooser.APPROVE_OPTION) {
//				file = fileChooser.getSelectedFile();
//			}
//			if (file != null && fileChooser.accept(file)) {
//
//				LinkedList<SysLogGenEntry> retVals = getFileContents(file);
//				for (int count = 0; count < retVals.size(); count++) {
//
//					tableModel.addRow(retVals.get(count));
//				}
//			}
//
//		}
//	}
//
//	private void printValues(SysLogGenEntry sysLogEntry) {
//		StringBuffer buffer = new StringBuffer();
//		buffer.append("\nName: " + sysLogEntry.getName() + "\nBaseLine Time: "
//				+ sysLogEntry.getBaseLineTime() + "\nBackUp Time: "
//				+ sysLogEntry.getBackUpTime() + "\nChange Status: "
//				+ sysLogEntry.getChangeStatus() + "\nBackUp Type: "
//				+ sysLogEntry.getBackupType());
//		System.out.println("-----------Entry Detail-----------");
//		System.out.println(buffer);
//		System.out.println("----------------------------------");
//	}
//
//	private LinkedList<SysLogGenEntry> getFileContents(File file) {
//		LinkedList<SysLogGenEntry> valuesFromFile = new LinkedList<SysLogGenEntry>();
//		BufferedReader bufRdr;
//		String lineFromCSV = null;
//		SysLogGenEntry entry = null;
//		try {
//			bufRdr = new BufferedReader(new FileReader(file));
//			try {
//				while ((lineFromCSV = bufRdr.readLine()) != null) {
//					StringTokenizer token = new StringTokenizer(lineFromCSV,
//							",");
//					while (token.hasMoreTokens()) {
//						entry = new SysLogGenEntry(null, null, null, null, null);
//						entry.setName(token.nextToken());
//						entry.setBaseLineTime(token.nextToken());
//						entry.setBackUpTime(token.nextToken());
//						entry.setChangeStatus(token.nextToken());
//						entry.setBackupType(token.nextToken());
//						valuesFromFile.add(entry);
//						break;
//					}
//				}
//			} catch (IOException e) {
//
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		}
//
//		return valuesFromFile;
//	}
//
//	class CSVFilter extends FileFilter {
//		public boolean accept(File file) {
//			String filename = file.getName();
//			return filename.endsWith(".csv");
//		}
//
//		public String getDescription() {
//			return "*.csv";
//		}
//	}
//	
//	public class SysLogGenTableModel extends DefaultTableModel {
//		/**
//		 * 
//		 */
//		private static final long serialVersionUID = 6733998428928467430L;
//
//		static final String[] columnNames = { "Name", "BaseLine Time",
//				"Backup Time", "Change Status", "Backup Type" };
//
//		private Vector<SysLogGenEntry> syslogEntry = new Vector<SysLogGenEntry>();
//
//		public void addRow(SysLogGenEntry entry) {
//			syslogEntry.add(entry);
//			fireTableRowsInserted(syslogEntry.size() - 1, syslogEntry.size() - 1);
//			// super.addRow(vector);
//		}
//
//		public int getColumnCount() {
//			return columnNames.length;
//		}
//
//		public String getColumnName(int column) {
//			return columnNames[column];
//		}
//
//		public Class getColumnClass(int columnIndex) {
//			return String.class;
//		}
//
//		public boolean isCellEditable(int row, int column) {
//			return false;
//		}
//
//		public Object getValueAt(int row, int column) {
//			SysLogGenEntry entry = syslogEntry.get(row);
//			switch (column) {
//			case 0:
//				return entry.getName();
//			case 1:
//				return entry.getBaseLineTime();
//			case 2:
//				return entry.getBackUpTime();
//			case 3:
//				return entry.getChangeStatus();
//			case 4:
//				return entry.getBackupType();
//
//			default:
//				return "";
//			}
//		}
//
//		public int getRowCount() {
//			if (syslogEntry != null)
//				return syslogEntry.size();
//			else
//				return 0;
//		}
//
//		public SysLogGenEntry getSysLogEntry(int row) {
//			return syslogEntry.get(row);
//		}
//
//	}

}
