/* CS 431 Assignment 4
 * Homework by Michael Rosenberg
 * Submitted on 4/3/2015
 * Written and tested on Ubuntu 14.04 using:
 * Eclipse Helios Service Release 1: 
 * Build id: 20100917-0705
 * JRE: JavaSE 1.6
 */


package WordDetectorSftwre;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


@SuppressWarnings("serial")
public class ListWindow extends JFrame {
	
	private JPanel contentPane;
	private DefaultListModel<String> dlm = new DefaultListModel<String>();
	private JList<String> list;
	private WordList wolst;
	private boolean DWords = false;
	
	
	/* - ListWindow - 
	 * Purpose: Creates a ListWindow, a JFrame object which displays a list of words
	 * from the user defined file. Depending on the parameters given when called the
	 * list window will either display words beginning with d or all other words, 
	 * along with how many times that word was used within the file.
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: contentPane, dlm, list, wolst, DWords, wordlist, isDWords, x, ScrollPane, btnClick
	 * DOC: 4/01/2015
	 * Revision 1.0
	 * Procedures used: GetWordAt, GetWord
	 * Citations: None.
	 */
	public ListWindow (WordList wordlist, boolean isDWords) 
	{
		wolst = wordlist;
		DWords = isDWords;
		setResizable(false);
		if (isDWords)
		{
			setTitle("List of D Words");
		}
		else
		{
			setTitle("List of All Other Words");
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Change This
		setDefaultLookAndFeelDecorated(true);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 0, 350, 300);
		contentPane.add(scrollPane);
		
		for (int i=0;i<wolst.getWordCount();i++)
		{
			if (isDWords)
			{
				if (wolst.getWordAt(i).checkIfDWord())
				{
					String x = wolst.getWordAt(i).getWord() + " was used " + wolst.getWordAt(i).getTimesUsed();
					dlm.addElement(x);
				}
			}
			else
			{
				if (!wolst.getWordAt(i).checkIfDWord())
				{
					String x = wolst.getWordAt(i).getWord() + " was used " + wolst.getWordAt(i).getTimesUsed();
					dlm.addElement(x);
				}
			}
		}
		
		list = new JList<String>(dlm);
		scrollPane.setViewportView(list);
		
		if (DWords)
		{
			JButton btnClick = new JButton("Click here to see all other words!");
			btnClick.setBounds(25, 305, 350, 50);
			btnClick.setActionCommand("goToNonD");
			btnClick.addActionListener(new ActionCommands());
			contentPane.add(btnClick);
		}
		else
		{
			JButton btnClick = new JButton("Click here to exit!");
			btnClick.setBounds(25, 305, 350, 50);
			btnClick.setActionCommand("exit");
			btnClick.addActionListener(new ActionCommands());
			contentPane.add(btnClick);
		}
		
	}
	
	/* - Hide - 
	 * Purpose: Hides the current List Window
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: None
	 * DOC: 4/02/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	
	public void Hide()
	{
		this.setVisible(false);
	}
}
