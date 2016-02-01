/* CS 431 Assignment 4
 * Homework by Michael Rosenberg
 * Submitted on 4/3/2015
 * Written and tested on Ubuntu 14.04 using:
 * Eclipse Helios Service Release 1: 
 * Build id: 20100917-0705
 * JRE: JavaSE 1.6
 */


package WordDetectorSftwre;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Window extends JFrame {
	private JPanel contentPane;
	
	/* - Window - 
	 * Purpose: Creates a Window, a JFrame object which allows the user to select a file
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: contentPane
	 * DOC: 4/01/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public Window () 
	{
		setResizable(false);
		setTitle("Sarner HW #04");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);
		setBounds(100, 100, 200, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOpen = new JButton("Open File");
		btnOpen.setBounds(25, 25, 150, 50); // X, Y, Width, Height
		btnOpen.setActionCommand("openf");
		btnOpen.addActionListener(new ActionCommands());
		contentPane.add(btnOpen);

	}
	
	
}
