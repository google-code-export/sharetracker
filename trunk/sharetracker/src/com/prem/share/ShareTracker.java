package com.prem.share;

import java.awt.Graphics2D;
import java.awt.SplashScreen;

import com.prem.share.gui.ShareWindow;

public class ShareTracker {

	public static void main(String argv[]) {
		ShareWindow share = new ShareWindow();
		displaySplashScreen();
        share.setVisible(true);
	}

	public static void displaySplashScreen() {
		final SplashScreen splash = SplashScreen.getSplashScreen();
		if (splash != null) {
            System.out.println("SplashScreen.getSplashScreen() returned null");
            Graphics2D g = splash.createGraphics();
            try {
            	Thread.sleep(3000);
            }
            catch(InterruptedException e) {
            }
//            splash.close();
        }
	}
}
