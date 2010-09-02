/*
 * UNPUBLISHED SOURCE CODE 
 * Copyright 2000-2006, Brocade Communications Systems, Incorporated. ALL  
 * RIGHTS RESERVED. 
 *
 * BROCADE HIGHLY CONFIDENTIAL TRADE SECRET INFORMATION
 *
 * Access or possession of this material grants you no right or license, express, implied, 
 * statutory or otherwise, under any Brocade patent, copyright, trade secret right or
 * other intellectual property right.  Any such license 
 * must be contained in a written license agreement signed by an authorized officer of 
 * Brocade.  Additionally, access or possession of this material is limited to Brocade 
 * employees with a need to know or named employees of 
 * Brocade vendors authorized by Brocade in writing to access this material.   
 *
 * Restricted Rights: Use, duplication, or disclosure by the U.S. Government is subject to 
 * restrictions of  FAR 52.227-19 and its successors, or (c)(1)(ii) of the Rights in 
 * Technical Data and Computer Software clause at DFAR 252.227-7013 and its 
 * successors.
 * 
 * Brocade Communications Systems, Inc., 1745 Technology Drive, San Jose, CA 95110
 */
package com.prem.share.common.lib;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * A windows explorer style status bar.
 * 
 * <pre>
 * BStatusBar statusBar = new BStatusBar();
 * statusBar.addRightComponent(progressBarPanel);
 * statusBar.addRightComponent(new JLabel(&quot;User: admin&quot;));
 * statusBar.addRightComponent(new JLabel(&quot;Role: admin&quot;));
 * statusBar.addRightComponent(new JLabel(&quot;Host: 10.32.151.200&quot;));
 * </pre>
 * 
 * @author Premkumar Nandagopal
 */
public class StatusBar extends JPanel {

  // RGB values discovered using ZoomIn
  private static final Color THREE_D_EFFECT_COLOR = new Color(255, 255, 255);
  private static final Color SQUARE_COLOR_LEFT = new Color(184, 180, 163);
  private static final Color SQUARE_COLOR_TOP_RIGHT = new Color(184, 180, 161);
  private static final Color SQUARE_COLOR_BOTTOM_RIGHT = new Color(184, 181, 161);

  // Dimensions
  private static final int WIDTH = 12;
  private static final int HEIGHT = 12;

  /* The message label */
  public JLabel messageLabel;
  /* Main Panel */
  public JPanel mainPanel;
  private JLabel resizeHandle;
  private boolean drawShadow;

  /**
   * Default Constructor
   */
  public StatusBar() {
    setLayout(new BorderLayout(5, 0));
    setPreferredSize(new Dimension(10, 23)); // 10, 23

    messageLabel = new JLabel();
    messageLabel.setVerticalAlignment(JLabel.CENTER);
    messageLabel.setVerticalTextPosition(JLabel.CENTER);
    messageLabel.setBorder(BorderFactory.createEmptyBorder(0, 3, 0, 0));

    initializeComponents();

    resizeHandle = new JLabel();
    TriangleSquareWindowsCornerIcon icon = new TriangleSquareWindowsCornerIcon();
    resizeHandle.setIcon(icon);
    resizeHandle.setCursor(Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR));

    JPanel p = new JPanel(new BorderLayout());
    p.add(BorderLayout.SOUTH, resizeHandle);

    /*
     * MouseMotionAdapter l = new MouseMotionAdapter() { public void
     * mouseDragged(MouseEvent e) { Frame parentFrame =
     * getParentFrame(); if(parentFrame != null) { Point p =
     * e.getPoint(); SwingUtilities.convertPointToScreen(p,
     * resizeHandle); int w = p.x + 10 -
     * parentFrame.getLocationOnScreen().x; int h = p.y + 10 -
     * parentFrame.getLocationOnScreen().y; parentFrame.setSize(w,h);
     * parentFrame.validate(); } } };
     * resizeHandle.addMouseMotionListener(l); add(p,
     * BorderLayout.EAST);
     */
    add(mainPanel, BorderLayout.CENTER);
  }

  public void drawDropShadow(boolean flag) {
    this.drawShadow = flag;
  }

  /**
   * Returns the main message label
   * 
   * @return message label
   */
  public JLabel getMessageLabel() {
    return this.messageLabel;
  }

  public void paint(Graphics g) {
    super.paint(g);
    if (drawShadow) {
      g.setColor(UIManager.getColor("Panel.background"));
      int y = 0;
      g.setColor(new Color(156, 154, 140));
      g.drawLine(0, y, getWidth(), y);
      y++;
      g.setColor(new Color(196, 194, 183));
      g.drawLine(0, y, getWidth(), y);
      y++;
      g.setColor(new Color(218, 215, 201));
      g.drawLine(0, y, getWidth(), y);
    }
  }

  public Frame getParentFrame() {
    return getParentFrame(this);
  }

  public Frame getParentFrame(Component c) {
    Container cont = c.getParent();
    if (cont instanceof Frame) {
      return (Frame) cont;
    } else {
      return getParentFrame((Component) cont);
    }
  }

  /**
   * Displays the status message with normal priority
   * 
   * @param message
   *          message to be displayed in status bar
   */
  public void displayMessage(String message) {
    updateLabel(messageLabel, Color.BLACK, message);
  }

  /**
   * Displays the status message with high priority in red color
   * 
   * @param message
   *          message to be displayed in status bar
   */
  public void displayErrorMessage(String message) {
    updateLabel(messageLabel, Color.BLUE, message);
  }

  /**
   * Clears the status message
   */
  public void clearMessage() {
    messageLabel.setText("");
  }

  /**
   * Add windows style right component.
   * 
   * @param component
   *          swing component to be added
   * @return the added component
   */
  public JComponent addRightComponent(JComponent component) {
    JPanel cPane = new JPanel();
    cPane.setLayout(new BoxLayout(cPane, BoxLayout.LINE_AXIS));

    if (component instanceof JLabel) {
      JLabel label = (JLabel) component;
      label.setVerticalAlignment(JLabel.CENTER);
      label.setVerticalTextPosition(JLabel.CENTER);
    }

    cPane.add(Box.createHorizontalStrut(5));
    JSeparator separator = new JSeparator(JSeparator.VERTICAL);
    cPane.add(separator);
    cPane.add(Box.createHorizontalStrut(5));
    cPane.add(component);
    cPane.add(Box.createHorizontalStrut(5));

    GridBagConstraints gc = new GridBagConstraints();
    gc.fill = GridBagConstraints.HORIZONTAL;
    gc.weightx = 0.0;
    gc.weighty = 1.0;
    mainPanel.add(cPane, gc);

    return component;
  }

  public void initializeComponents() {
    mainPanel = new JPanel();
    mainPanel.setLayout(new GridBagLayout());

    // mainPanel.setBorder(BorderFactory.createEmptyBorder(0,3,0,0));
    // mainPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    GridBagConstraints gc = new GridBagConstraints();
    gc.fill = GridBagConstraints.BOTH;
    gc.weightx = 1.0;
    gc.weighty = 1.0;

    mainPanel.add(messageLabel, gc);

    /*
     * mainPanel = new JPanel(); mainPanel.setLayout(new
     * BoxLayout(mainPanel, BoxLayout.LINE_AXIS));
     * mainPanel.add(messageLabel);
     */
  }

  private void setLabelProperties(JLabel label, Color fg, String text) {
    /* Set the ForeGround color of the Label */
    if (fg != null) {
      label.setForeground(fg);
    }

    /* Set the Labels Text & Tool Tip */
    label.setText(text);
    label.setToolTipText(text);

    /* Paint the label to update the changes on display */
    repaintLabelImmediately(label);
  }

  public void updateLabel(final JLabel label, final Color color, final String text) {
    if (SwingUtilities.isEventDispatchThread()) {
      setLabelProperties(label, color, text);
    } else {
      Runnable clLabelUpdater = new Runnable() {
        public void run() {
          StatusBar.this.setLabelProperties(label, color, text);
        }
      };
      SwingUtilities.invokeLater(clLabelUpdater);
    }
  }

  private void repaintLabelImmediately(JComponent label) {
    int iWidth, iHeight;
    Rectangle clRectangle;

    /* Validate the passed label. */
    if (label == null) {
      return;
    }

    /* Paint the Label. */
    iWidth = label.getWidth();
    iHeight = label.getHeight();
    clRectangle = new Rectangle(0, 0, iWidth, iHeight);
    label.paintImmediately(clRectangle);
  }

  class TriangleSquareWindowsCornerIcon implements Icon {

    public int getIconHeight() {
      return WIDTH;
    }

    public int getIconWidth() {
      return HEIGHT;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
      // Layout a row and column "grid"
      int firstRow = 0;
      int firstColumn = 0;
      int rowDiff = 4;
      int columnDiff = 4;

      int secondRow = firstRow + rowDiff;
      int secondColumn = firstColumn + columnDiff;
      int thirdRow = secondRow + rowDiff;
      int thirdColumn = secondColumn + columnDiff;

      // Draw the white squares first, so the gray squares will overlap
      draw3dSquare(g, firstColumn + 1, thirdRow + 1);

      draw3dSquare(g, secondColumn + 1, secondRow + 1);
      draw3dSquare(g, secondColumn + 1, thirdRow + 1);

      draw3dSquare(g, thirdColumn + 1, firstRow + 1);
      draw3dSquare(g, thirdColumn + 1, secondRow + 1);
      draw3dSquare(g, thirdColumn + 1, thirdRow + 1);

      // draw the gray squares overlapping the white background squares
      drawSquare(g, firstColumn, thirdRow);

      drawSquare(g, secondColumn, secondRow);
      drawSquare(g, secondColumn, thirdRow);

      drawSquare(g, thirdColumn, firstRow);
      drawSquare(g, thirdColumn, secondRow);
      drawSquare(g, thirdColumn, thirdRow);

    }

    private void draw3dSquare(Graphics g, int x, int y) {
      Color oldColor = g.getColor(); // cache the old color
      g.setColor(THREE_D_EFFECT_COLOR); // set the white color
      g.fillRect(x, y, 2, 2); // draw the square
      g.setColor(oldColor); // reset the old color
    }

    private void drawSquare(Graphics g, int x, int y) {
      Color oldColor = g.getColor();
      g.setColor(SQUARE_COLOR_LEFT);
      g.drawLine(x, y, x, y + 1);
      g.setColor(SQUARE_COLOR_TOP_RIGHT);
      g.drawLine(x + 1, y, x + 1, y);
      g.setColor(SQUARE_COLOR_BOTTOM_RIGHT);
      g.drawLine(x + 1, y + 1, x + 1, y + 1);
      g.setColor(oldColor);
    }

  }
}
