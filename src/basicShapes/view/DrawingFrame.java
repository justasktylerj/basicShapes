package basicShapes.view;

import javax.swing.*;

import basicShapes.controller.*;
import basicShapes.view.*;

public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private DrawingPanel basePanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		this.baseController = baseController;
		basePanel = new DrawingPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);  //installs the panel in the frame
		this.setSize(800,800);
		this.setTitle("ChatBot app!"); // find a good size for app
		this.setResizable(false); //can't change size of window
		this.setVisible(true);  //must be last line of setupFrame
	}
	
	public DrawingController getBaseController()
	{
		return baseController;
	}
}
