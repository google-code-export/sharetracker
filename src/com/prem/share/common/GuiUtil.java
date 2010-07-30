package com.prem.share.common;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

public class GuiUtil {

	public static Image getImageFromResource(String imageName) {
		Image image = Toolkit.getDefaultToolkit().getImage(
				com.prem.share.common.GuiConstants.class
						.getResource("resource/" + imageName));
		return image;
	}

	public static ImageIcon getIconFromResource(String iconName) {
		ImageIcon icon = new ImageIcon(com.prem.share.common.GuiConstants.class
				.getResource("resource/" + iconName));
		return icon;
	}
}
