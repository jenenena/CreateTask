package View;

import javax.swing.JFrame;
import controller.CreateController;

public class CreateFrame extends JFrame
{
	private CreateController appController;
	private CreatePanel appPanel;
	
	public CreateFrame (CreateController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new CreatePanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 600);
		this.setTitle(" "); // COME ADD A TITLE
		this.setResizable(false);
		this.setVisible(true);
	}
}
