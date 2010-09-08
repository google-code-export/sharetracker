package com.prem.share.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.logging.Logger;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.prem.share.common.GuiConstants;
import com.prem.share.common.GuiUtil;

public class AboutDialog extends JDialog {
    private static Logger logger = Logger.getLogger(AboutDialog.class
            .getName());

    JTabbedPane tabbedPanel = new JTabbedPane();
    
    public AboutDialog(JFrame parent) {
    	super(parent);
    	init();
    }
    
    public void init() {
    	setLayout(new BorderLayout());
    	
        JPanel aboutPanel = new JPanel(new GridLayout(4, 1));
        JPanel aboutPanelFlow = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        final JLabel logo = new JLabel();
        logo.setIcon(GuiUtil.getIconFromResource("splash_st.gif"));
        
        final JLabel product = new JLabel(GuiConstants.PRODUCT_LABEL + ": " + GuiConstants.PRODUCT);
        final JLabel version = new JLabel(GuiConstants.VERSION_LABEL + ": " + GuiConstants.VERSION);
        final JLabel copyright = new JLabel(GuiConstants.COPYRIGHT_LABEL + ": " + GuiConstants.COPYRIGHT);
        final JLabel auther = new JLabel(GuiConstants.AUTHER_LABEL + ": " + GuiConstants.AUTHER);
        final JLabel comments = new JLabel(GuiConstants.COMMENTS_LABEL + ": " + GuiConstants.COMMENTS);

        aboutPanel.add(product);
        aboutPanel.add(version);
        aboutPanel.add(copyright);
        aboutPanel.add(auther);
        
        aboutPanelFlow.add(aboutPanel);
        
        this.add(logo, BorderLayout.CENTER);
        this.add(aboutPanelFlow, BorderLayout.EAST);
        
        aboutPanel.setSize(220, 150);
        setSize(654, 234);
        setTitle(GuiConstants.ABOUT);
        setVisible(true);
        setResizable(false);
    }
}
