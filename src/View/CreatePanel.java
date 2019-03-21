 package View;

 import javax.swing.*;
 import java.awt.Color;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import controller.CreateController;
 import java.awt.Dimension;
 
public class CreatePanel extends JPanel
{
	private SpringLayout appLayout;
	private CreateController appController;
	//Text fields and labels here
	
	
	public CreatePanel(CreateController appController)
	{
		super();
		
		//nameofvariable = new type(value)
		
		this.appController = appController;
		this.appLayout = new SpringLayout(); // Layout constraints go below this line
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setBackground(Color.darkGray);
		this.setPreferredSize(new Dimension(800, 600));
		
		// this.add(my data members);
	}
	
	private void setupLayout()
	{
		
	}

	
}













