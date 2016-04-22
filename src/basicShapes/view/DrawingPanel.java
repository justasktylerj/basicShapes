package basicShapes.view;

import javax.swing.*;

import basicShapes.controller.*;
import basicShapes.view.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class DrawingPanel extends JPanel
{
	private DrawingController baseController;
	private SpringLayout baseLayout;
	private ShapePanel shapePanel;
	private JButton drawRectangleButton;
	private ArrayList<Rectangle> rectangleList;
	
	public DrawingPanel(DrawingController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		shapePanel = new ShapePanel();
		rectangleList = new ArrayList<Rectangle>();
		
		drawRectangleButton = new JButton("draw the rectangle");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLACK);
		this.add(drawRectangleButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		drawRectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				int xPosition = (int)(Math.random() * 800);
				int yPosition = (int)(Math.random() * 800);
				int width = (int)(Math.random() * 100);
				int height = (int)(Math.random() * 150);
				
				rectangleList.add(new Rectangle(xPosition, yPosition, width, height));
				repaint();
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D)currentGraphics;
		mainGraphics.setColor(Color.GREEN);
		mainGraphics.setStroke(new BasicStroke(5));
		mainGraphics.draw(new Rectangle(90, 10, 20, 40));
		
		for (Rectangle current : rectangleList)
		{
			int randomStroke = (int)(Math.random() * 7);
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			mainGraphics.setColor(new Color(red, blue, green));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			
			mainGraphics.fill(current);
		}
	}
	
	
	
}
