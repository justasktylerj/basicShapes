package basicShapes.view;

import javax.swing.*;

import basicShapes.controller.*;
import basicShapes.view.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class DrawingPanel extends JPanel
{
	private DrawingController baseController;
	private SpringLayout baseLayout;
	private ShapePanel shapePanel; 
	private JButton drawRectangleButton;
	private JButton drawEllipseButton;
	private JButton drawPolygonButton;
	private JButton drawSquareButton;
	private JButton drawCircleButton;
	private JButton drawTriangleButton;
	
	public DrawingPanel(DrawingController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		shapePanel = new ShapePanel();
		drawRectangleButton = new JButton("rectangle");
		drawEllipseButton = new JButton("ellipse");
		drawPolygonButton = new JButton("polygon");
		drawSquareButton = new JButton("square");		
		drawCircleButton = new JButton("circle");		
		drawTriangleButton = new JButton("triangle");
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLACK);
		this.add(drawRectangleButton);
		this.add(drawEllipseButton);
		this.add(drawPolygonButton);
		this.add(drawSquareButton);
		this.add(drawCircleButton);
		this.add(drawTriangleButton);	
		this.add(shapePanel);
		this.setLayout(baseLayout);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 100, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, -20, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, -20, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, drawRectangleButton, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, drawRectangleButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, drawEllipseButton, 0, SpringLayout.NORTH, drawRectangleButton);
		baseLayout.putConstraint(SpringLayout.EAST, drawEllipseButton, -5, SpringLayout.WEST, drawPolygonButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawPolygonButton, 0, SpringLayout.NORTH, drawRectangleButton);
		baseLayout.putConstraint(SpringLayout.EAST, drawPolygonButton, -6, SpringLayout.WEST, drawRectangleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawSquareButton, 0, SpringLayout.NORTH, drawRectangleButton);
		baseLayout.putConstraint(SpringLayout.EAST, drawSquareButton, -20, SpringLayout.WEST, drawEllipseButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawCircleButton, 6, SpringLayout.SOUTH, drawEllipseButton);
		baseLayout.putConstraint(SpringLayout.EAST, drawCircleButton, -10, SpringLayout.EAST, drawEllipseButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawTriangleButton, 6, SpringLayout.SOUTH, drawRectangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, drawTriangleButton, 30, SpringLayout.EAST, drawCircleButton);
		
	}
	
	private void setupListeners()
	{
		drawRectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangle();
				repaint();
			}
		});
		
		drawEllipseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addEllipse();
				repaint();
			}
		});
		
		drawPolygonButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addPolygon();
				repaint();
			}
		});
		
		drawSquareButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addSquare();
				repaint();
			}
		});
		
		drawCircleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addCircle();				
				repaint();
			}
		});
		
		drawTriangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
	
				shapePanel.addTriangle();
				repaint();
			}
		});
	}
	
	
	
	
	
}
