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
		int width = (int)(Math.random() * 100);
		int height = (int)(Math.random() * 100);
		int xPosition = (int)(Math.random() * 800);
		int yPosition = (int)(Math.random() * 800);
		
		Rectangle rectangle = new Rectangle(xPosition, yPosition, width, height);
		rectangleList.add(rectangle);
	}
	
	public void addSquare()
	{
		int side = (int)(Math.random() * 200);
		int xPosition = (int)(Math.random() * 800);
		int yPosition = (int)(Math.random() * 800);
		
		Rectangle rectangle = new Rectangle(xPosition, yPosition, side, side);
		squareList.add(rectangle);
	}
	
	public void addEllipse()
	{
		int xPoint = (int)(Math.random() * 1000);
		int yPoint = (int)(Math.random() * 1000);
		int width = (int)(Math.random() * 100);
		int height = (int)(Math.random() * 100);
		
		Ellipse2D currentEllipse = new Ellipse2D.Double(xPoint, yPoint, width, height);
		ellipseList.add(currentEllipse);
	}
	
	public void addCircle()
	{
		int xPoint = (int)(Math.random() * 1000);
		int yPoint = (int)(Math.random() * 1000);
		int diameter = (int)(Math.random() * 100);
		
		Ellipse2D circle = new Ellipse2D.Double(xPoint, yPoint, diameter, diameter);
		circleList.add(circle);
	}
	
	public void addTriangle()
	{
		int [] xPoints = new int [3];
		int [] yPoints = new int [3];
		xPoints[0] = (int)(Math.random() * 800);
		xPoints = new int []{(int)(Math.random() * 800), (int)(Math.random() * 800), (int)(Math.random() * 800)};
		yPoints = new int []{(int)(Math.random() * 800), (int)(Math.random() * 800), (int)(Math.random() * 800)};
		
		Polygon currentTriangle = new Polygon(xPoints, yPoints, 3);
		triangleList.add(currentTriangle);
		
	}
	
	public void addPolygon()
	{
		int numberOfSides = (int)(Math.random() * 10) + 3;
		int [] xPoints = new int [numberOfSides];
		int [] yPoints = new int [numberOfSides];
		
		for (int sides = 0; sides < numberOfSides; sides++)
		{
			xPoints[sides] = (int)(Math.random() * 800);
			yPoints[sides] = (int)(Math.random() * 800);
		}
		
		Polygon polygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(polygon);
	}
	
	
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D)currentGraphics;
		
		drawShapes(mainGraphics, circleList);
		drawShapes(mainGraphics, ellipseList);
		drawShapes(mainGraphics, rectangleList);
		drawShapes(mainGraphics, squareList);
		drawShapes(mainGraphics, triangleList);
		drawShapes(mainGraphics, polygonList);
		
		
	}
	
	private void drawShapes(Graphics2D mainGraphics, ArrayList shapeList)
	{
		for(Object currentShape : shapeList)
		{
			currentShape = (Shape) currentShape;
			int randomStroke = (int)(Math.random() * 10) + 3;
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			mainGraphics.setColor(new Color(red, blue, green));
			mainGraphics.setStroke(new BasicStroke(randomStroke));
			if(currentShape instanceof Polygon)
			{
				mainGraphics.draw((Shape)currentShape);
			}
			else
			{
				mainGraphics.fill((Shape)currentShape);
			}
			
		}
	}
	
	public void clear()
	{
		rectangleList.clear();
		squareList.clear();
		ellipseList.clear();
		circleList.clear();
		polygonList.clear();
		triangleList.clear();
	}
	
}

