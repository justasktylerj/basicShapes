package basicShapes.view;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import basicShapes.controller.*;
import basicShapes.view.*;

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	
	public ShapePanel();
	{
		rectangleList = new ArrayList<Rectangle>();
	}
	
	public void addRectangle()
	{
		rectangleList.add(new Rectangle(10, 20, 50, 10));
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		
	}
}

