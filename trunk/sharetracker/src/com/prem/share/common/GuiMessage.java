package com.prem.share.common;

import java.awt.Component;

import javax.swing.JOptionPane;

public final class GuiMessage {
	//public static String  = "";
	public static String ADD_DUPLICATE = "Quote already available in the list";
	public static String DELETE_QUOTE = "Selected quotes will be deleted from the list\nDo you want to continue?";
	public static String NO_SELECTION = "Select quotes from the list";
	
	public static void informationMessage (Component parentComponent, String message) {
		JOptionPane.showMessageDialog(parentComponent, message, GuiConstants.SHARE, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int confirmationMessage (Component parentComponent, String message) {
		return JOptionPane.showConfirmDialog(parentComponent, message, GuiConstants.SHARE, JOptionPane.OK_CANCEL_OPTION);
	}
}
