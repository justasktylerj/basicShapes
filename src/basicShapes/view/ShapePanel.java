package basicShapes.view;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import javax.swing.*;
import basicShapes.controller.*;
import basicShapes.view.*;

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Rectangle> squareList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	
	public ShapePanel()
	{
		rectangleList = new ArrayList<Rectangle>();
		squareList = new ArrayList<Rectangle>();
		ellipseList = new ArrayList<Ellipse2D>();
		circleList = new ArrayList<Ellipse2D>();
		polygonList = new ArrayList<Polygon>();
		triangleList = new ArrayList<Polygon>();
		
	}
	
	public void addRectangle()
	{
		rectangleList.add(new Rectangle(10, 20, 50, 10));
	}
	
	public void addSquare()
	{
		squareList.add(new Rectangle(10, 20, 50, 10));
	}
	
	public void addEllipse()
	{
		
	}
	
	public void addcircle()
	{
		
	}
	
	public void addtriangle()
	{
		int [] xPoints = new int [3];
		int [] yPoints = new int [3];
		//xPoints[0] = (int)(Math.random() * 250);
		xPoints = new int []{(int)(Math.random() * 250), (int)(Math.random() * 250), (int)(Math.random() * 250)};
		yPoints = new int []{(int)(Math.random() * 250), (int)(Math.random() * 250), (int)(Math.random() * 250)};
		
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		
		triangleList.add(triangle);
		
	}
	
	public void addpolygon()
	{
		int numberOfSides = (int)(Math.random() * 10) + 3;
		int [] xPoints = new int [numberOfSides];
		int [] yPoints = new int [numberOfSides];
		
		for (int sides = 0; sides < numberOfSides; sides++)
		{
			xPoints[sides] = (int)(Math.random() * 300);
			yPoints[sides] = (int)(Math.random() * 300);
		}
		
		Polygon myPolygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(myPolygon);
	}
	
	
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
	}
}

