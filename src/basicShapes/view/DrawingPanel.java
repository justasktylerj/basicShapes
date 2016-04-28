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
