package com.prem.share.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.prem.share.common.GuiConstants;
import com.prem.share.common.GuiUtil;
import com.prem.share.common.StStatusBar;

public class ShareWindow extends JFrame implements GuiConstants {
	private static final long serialVersionUID = 1L;
	JTabbedPane tabbedPane = null;
	final static StStatusBar statusBar = new StStatusBar();

	public ShareWindow() {
		init();
	}

	private void init() {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
			this.setLayout(new BorderLayout());
			this.setTitle(GuiConstants.SHARE);
			Image icon = GuiUtil.getImageFromResource("bull.jpg");
			this.setIconImage(icon);
			setSize(800, 600);
			setMinimumSize(new Dimension(800, 600));

			// Init Menu Bar
			initMenuBar();
			// Init Tab Pannel
			initTabPanel();

			this.add(statusBar, BorderLayout.SOUTH);
			this.add(tabbedPane, BorderLayout.CENTER);
			this.addWindowListener(new ShareWindowListener());

			this.pack();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void initMenuBar() {
		Menu helpMenu = new Menu(GuiConstants.HELP);
		MenuItem aboutMenu = new MenuItem(GuiConstants.ABOUT);
		helpMenu.add(aboutMenu);

		Menu fileMenu = new Menu(GuiConstants.FILE);
		MenuItem exitMenu = new MenuItem(GuiConstants.EXIT);
		fileMenu.add(exitMenu);
		exitMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		aboutMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// ShareTracker.displaySplashScreen();
				AboutDialog about = new AboutDialog(ShareWindow.this);
				about.setVisible(true);
			}
		});

		MenuBar menuBar = new MenuBar();
		setMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
	}

	private void initTabPanel() {
		tabbedPane = new JTabbedPane();
		QuotePanel quotePanel = new QuotePanel();
		tabbedPane.addTab(QUOTE, quotePanel);
		TradePanel tradePanel = new TradePanel();
		tabbedPane.addTab(TRADE, tradePanel);
	}

	public static StStatusBar getStatusBar() {
		return statusBar;
	}

	private class ShareWindowListener implements WindowListener {
		@Override
		public void windowActivated(WindowEvent e) {
		}

		@Override
		public void windowClosed(WindowEvent e) {
			System.exit(1);
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(1);
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
		}

		@Override
		public void windowIconified(WindowEvent e) {
		}

		@Override
		public void windowOpened(WindowEvent e) {
		}
	}
}
