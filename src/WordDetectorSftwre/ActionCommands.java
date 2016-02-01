/* CS 431 Assignment 4
 * Homework by Michael Rosenberg
 * Submitted on 4/3/2015
 * Written and tested on Ubuntu 14.04 using:
 * Eclipse Helios Service Release 1: 
 * Build id: 20100917-0705
 * JRE: JavaSE 1.6
 */

package WordDetectorSftwre;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ActionCommands implements ActionListener{

	static ListWindow lwindow;
	static ListWindow dwindow;
	private WordList wolst;
	
	/* - actionPerformed - 
	 * Purpose: Handles all button clicks, across both File select & list display forms.
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: textDoc, fileChooser, result, selectedFile, processor, lwindow, dwindow, wolst, 
	 * DOC: 3/30/2015
	 * Revision 1.5
	 * Procedures used: None.
	 * Citations: None.
	 */
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getActionCommand().equals("openf"))
   	 	{
			String textDoc = "";
			JFileChooser fileChooser = new JFileChooser();
			UIManager.put("FileChooser.openDialogTitleText", "Select Your Text File");
			fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
			fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files(.txt)", "txt"));
			SwingUtilities.updateComponentTreeUI(fileChooser);
			int result = fileChooser.showOpenDialog(null);
			if (result == JFileChooser.APPROVE_OPTION) 
			{
				File selectedFile = fileChooser.getSelectedFile();
				if (selectedFile.isFile())
				{
					textDoc = readFile(selectedFile.getAbsolutePath());
					Processor processor = new Processor(textDoc);
					processor.Process();
					wolst = processor.getWords();
					dwindow = new ListWindow(wolst, true);
					lwindow = new ListWindow(wolst, false);
					dwindow.setVisible(true);
					Main.window.setVisible(false);
				}
			}
   	 	}
		else if (arg0.getActionCommand().equals("goToNonD"))
		{
			dwindow.setVisible(false);
			lwindow.setVisible(true);
		}
		else if (arg0.getActionCommand().equals("exit"))
		{
			System.exit(0);
		}
	}
	
	
	/* - readFile - 
	 * Purpose: Takes a file path and opens the file extracting all text into the returning string
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: pathname, file, scanner, fileContents, lineSeparator
	 * DOC: 3/30/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	private String readFile(String pathname)
	{
	    File file = new File(pathname);
	    Scanner scanner = null;
	    StringBuilder fileContents = new StringBuilder((int)file.length());
	    try
	    {
	    	scanner  = new Scanner(file);
	    }
	    catch (FileNotFoundException fnfe)
	    {
	    	System.out.println("Somehow this file don't exist.");
	    }
	    String lineSeparator = System.getProperty("line.separator");
	    try 
	    {
	        while(scanner.hasNextLine()) 
	        {        
	            fileContents.append(scanner.nextLine() + lineSeparator);
	        }
	        return fileContents.toString();
	    } finally {
	        scanner.close();
	    }
	}
	

}
