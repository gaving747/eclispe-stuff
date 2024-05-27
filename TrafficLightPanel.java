package edu.ilstu.it287.pgm01.gegarc3;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrafficLightPanel extends JPanel {

	private static final long serialVersionUID = 12345;
	private static final int PANEL_HEIGHT = 400;
	private static final int PANEL_WIDTH = 400;
	
	public TrafficLightPanel() {
	
		setPreferredSize(new Dimension(PANEL_HEIGHT, PANEL_WIDTH));
		setBackground(Color.WHITE);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// PUT CODE HERE TO PAINT CIRCLES & RETANGLES!
		g.setColor(Color.RED);
		g.fillOval(150,0,100,100);
		g.setColor(Color.YELLOW);
		g.fillOval(150,120,100,100);
		g.setColor(Color.GREEN);
		g.fillOval(150,230,100,100);
		
	}
	
	/**
	 * @param layout
	 */
	public TrafficLightPanel(LayoutManager layout) {
		super(layout);
	}

	/**
	 * @param isDoubleBuffered
	 */
	public TrafficLightPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
	}

	/**
	 * @param layout
	 * @param isDoubleBuffered
	 */
	public TrafficLightPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Window Title Here");
		TrafficLightPanel panel = new TrafficLightPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}	
	
}
