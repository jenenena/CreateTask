 package view;

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
	private JButton shuffleButton;
	private JLabel titleLabel;
	private JTextField songField;
	private JLabel number;
	private JLabel numberLabel;
//	private int shuffNumber;
	
	public CreatePanel(CreateController appController)
	{
		super();
		this.shuffleButton = new JButton("shuffle");
		this.titleLabel = new JLabel("Need new music? Click the button to get a suggested song.");
		this.songField = new JTextField("Song Here");
		this.number = new JLabel("0");
		this.numberLabel = new JLabel("Number of times shuffled:");
		
		this.appController = appController;
		this.appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.NORTH, number, 0, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, number, 0, SpringLayout.WEST, shuffleButton);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 92, SpringLayout.SOUTH, songField);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, songField);
		appLayout.putConstraint(SpringLayout.SOUTH, songField, -311, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, shuffleButton, 6, SpringLayout.SOUTH, songField);
		appLayout.putConstraint(SpringLayout.EAST, shuffleButton, -351, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, songField, 177, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, songField, -168, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, titleLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, titleLabel, 212, SpringLayout.WEST, this);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(800, 600));
		
		this.add(shuffleButton);
		this.add(titleLabel);
		this.add(songField);
		this.add(number);
		this.add(numberLabel);
	}
	
	private void setupLayout()
	{
		//constraints
	}

	private void setupListeners()
	{
		shuffleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				songField.setText(appController.findSong());
			}
		});
		shuffleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				number.setText(Integer.toString(Integer.parseInt(number.getText()) + 1));
			}
		});
	}
}













