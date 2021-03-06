package basicShapes.view;

import javax.swing.*;

import basicShapes.controller.*;
import basicShapes.view.*;

public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private DrawingPanel basePanel;
	private GraphPanel graphPanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		this.baseController = baseController;
		basePanel = new DrawingPanel(baseController);
		graphPanel = new GraphPanel();
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(graphPanel);  //installs the panel in the frame
		this.setSize(800,800);
		this.setTitle("Art app!"); // find a good size for app
		this.setResizable(false); //can't change size of window
		this.setVisible(true);  //must be last line of setupFrame
	}
	
	public DrawingController getBaseController()
	{
		return baseController;
	}
}
