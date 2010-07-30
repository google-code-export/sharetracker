package com.prem.share.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import com.prem.share.common.GuiConstants;
import com.prem.share.common.GuiUtil;

public class ShareWindow extends JFrame implements GuiConstants {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTabbedPane tabbedPane = null;

	public ShareWindow() {
		init();
	}

	private void init() {
		this.setTitle(GuiConstants.SHARE);
		Image icon = GuiUtil.getImageFromResource("bull.jpg");
		this.setIconImage(icon);
		setSize(800, 600);
		setMinimumSize(new Dimension(800, 600));
		tabbedPane = new JTabbedPane();
		QuotePanel quotePanel = new QuotePanel();
		tabbedPane.addTab(QUOTE, quotePanel);
		TradePanel tradePanel = new TradePanel();
		tabbedPane.addTab(TRADE, tradePanel);		
		this.setLayout(new BorderLayout());
		this.add(tabbedPane, BorderLayout.CENTER);
		setVisible(true);
		this.addWindowListener(new ShareWindowListener());
	}

	private class ShareWindowListener implements WindowListener {

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(1);
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.exit(1);
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub

		}
	}
}
