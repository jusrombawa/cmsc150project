import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SelectorPage extends JFrame implements ActionListener
{
	JButton optimizer,diet;
	JLabel title;
	JTabbedPane tabs;
	JPanel test;
	
	OptimizerUI opt;

	public SelectorPage()
	{
		optimizer = new JButton("Ultimate Optimizer");
		diet = new JButton("Diet Solver");
		opt = new OptimizerUI();
		test = new JPanel(); //temporary placeholder for non-existent diet solver
		
		//set up tabs
		tabs = new JTabbedPane();
		tabs.add("Opt",opt);
		tabs.add("Diet",test);
		this.add(tabs);
		
		//additional frame properties
		this.setTitle("Ultimate Optimizer and Diet Solver");
		this.setSize(1024,576); //16:9 because why the hell not.
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == optimizer)
		{
			opt = new OptimizerUI();
			this.dispose();
		}
	
	}
}
