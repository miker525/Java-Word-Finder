/* CS 431 Assignment 4
 * Homework by Michael Rosenberg
 * Submitted on 4/3/2015
 * Written and tested on Ubuntu 14.04 using:
 * Eclipse Helios Service Release 1: 
 * Build id: 20100917-0705
 * JRE: JavaSE 1.6
 */


package WordDetectorSftwre;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Word extends java.lang.Object implements Serializable
{
	private String wordString = "";
	private boolean startsWithD = false;
	private int timesUsed = 0;
	
	public Word()
	{
		wordString = "";
		timesUsed = 0;
	}
	public Word(String thisWord)
	{
		wordString = thisWord;
		timesUsed = 0;
	}
	
	/* - setWord - 
	 * Purpose: sets the string of the word
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: word, wordString
	 * DOC: 3/30/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public void setWord(String word) 
	{
		this.wordString = word;
		
	}
	
	/* - getWord - 
	 * Purpose: returns string of the word
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: wordString
	 * DOC: 3/30/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public String getWord()
	{
		return this.wordString;
	}
	
	/* - setStartsWithD - 
	 * Purpose: sets the boolean of whether the word starts with a d
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: startsWithD, troof
	 * DOC: 3/30/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public void setStartsWithD(boolean troof)
	{
		startsWithD = troof;
	}
	
	/* - checkIfDWord - 
	 * Purpose: returns whether the word starts with a D
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: startsWithD
	 * DOC: 3/30/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public boolean checkIfDWord()
	{
		return startsWithD;
	}
	
	/* - IncrementWordCount -  
	 * Purpose: Increments the number of times used by one
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: timesUsed
	 * DOC: 3/30/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public void IncrementWordCount()
	{
		timesUsed++;
	}
	
	/* - IncrementWordCount -  
	 * Purpose: Increments the number of times used by the passed number
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: timesUsed, number
	 * DOC: 3/30/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public void IncrementWordCount(int number)
	{
		timesUsed += number;
	}
	
	/* - getTimesUsed -  
	 * Purpose: Returns the number of times the word is used
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: timesUsed
	 * DOC: 3/30/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public int getTimesUsed()
	{
		return timesUsed;
	}
	
}
