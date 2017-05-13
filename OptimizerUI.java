import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OptimizerUI extends JPanel
{
	BoxLayout mainLayout;
	JLabel header;
	
	JRadioButton maxButton;
	JRadioButton minButton;
	ButtonGroup mode;
	
	JLabel obj;
	JPanel objective;
	int counter;

	public OptimizerUI()
	{
		mainLayout = new BoxLayout(this,BoxLayout.Y_AXIS);
		this.setLayout(mainLayout);
		
		//header
		header = new JLabel("Ultimate Optimizer");
		header.setFont(new Font("Sans Serif", Font.PLAIN, 24));
		this.add(header);
		
		//radio buttons
		maxButton = new JRadioButton("Maximize");
		minButton = new JRadioButton("Minimize");
		mode = new ButtonGroup();
		mode.add(maxButton);
		mode.add(minButton);
		this.add(maxButton);
		this.add(minButton);
		
		//objective function
		counter = 0;
		obj = new JLabel("Objective Function");
		objective = new JPanel();
		this.add(obj);
		this.add(objective);
		
		
	}
}
