/* CS 431 Assignment 4
 * Homework by Michael Rosenberg
 * Submitted on 4/3/2015
 * Written and tested on Ubuntu 14.04 using:
 * Eclipse Helios Service Release 1: 
 * Build id: 20100917-0705
 * JRE: JavaSE 1.6
 */


package WordDetectorSftwre;

import java.awt.EventQueue;

public class Main 
{

	/**
	 * @param args
	 */
	
	/* - main - 
	 * Purpose: To run the program. Creates a new File selection window and the program proceeds from there.
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: window
	 * DOC: 3/30/2015
	 * Revision 1.0
	 * Procedures used: 
	 * Citations: None.
	 */
	static Window window;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Window();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
