package com.prem.share.common;

import java.util.List;

import javax.swing.JComponent;

import com.prem.share.common.lib.StatusBar;

public class StStatusBar extends StatusBar {
	//private static final ImageIcon IMAGE_LOCK 		= new ImageIcon(Toolkit.getDefaultToolkit().getImage(StStatusBar.class.getResource("/tool_lock.gif")));
	
	/**
	 * constructor
	 */
	public StStatusBar() {
		this(true);
	}
	
	/**
	 * constructor	
	 * @param initialize true if the status bar has to be initialized
	 * if false, the initialization should be done later using init
	 */
	public StStatusBar(boolean initialize) {
		if (initialize)
			init(null, null);
	}
	
	/**
	 * constructor
	 * @param leftComponents Components to the left of the standard components
	 * @param rightComponents Components to the right of the standard components
	 */
	public StStatusBar(JComponent[] leftComponents, JComponent[] rightComponents) {
		init(leftComponents, rightComponents);
	}

	/**
	 * constructor
	 * @param leftComponents Components to the left of the standard components
	 * @param rightComponents Components to the right of the standard components
	 */
	public StStatusBar(List /*<JComponent>*/ leftComponents, List /*<JComponent>*/ rightComponents) {
		init((JComponent[])leftComponents.toArray(), (JComponent[])leftComponents.toArray());
	}
	
	/**
	 * initialize
	 * @param leftComponents Components to the left of the standard components
	 * @param rightComponents Components to the right of the standard components
	 */
	public void init(JComponent[] leftComponents, JComponent[] rightComponents) {		
		if (leftComponents != null) {
			 for (JComponent component : leftComponents) {
				 addRightComponent(component);
			}
		}
		
		addStandardComponents();
	
		if (rightComponents != null) {
			for (JComponent component : rightComponents) {
				addRightComponent(component);
			}
		}
	}
	
	//TODO: Add any default component to be present at middle of the status bar	public void addStandardComponents() {

	}

	/**
	 * cleanup. remove the listeners
	 */
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

}


