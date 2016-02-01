/* CS 431 Assignment 4
 * Homework by Michael Rosenberg
 * Submitted on 4/3/2015
 * Written and tested on Ubuntu 14.04 using:
 * Eclipse Helios Service Release 1: 
 * Build id: 20100917-0705
 * JRE: JavaSE 1.6
 */


package WordDetectorSftwre;

import java.util.ArrayList;
import java.util.List;

public class WordList
{
	
	private List<Word> l;  
	private int count; 
	
	public WordList()
	{
		l = new ArrayList<Word>(); 			
		count = 0; 
	}
	
	
	/* - addWord -  
	 * Purpose: adds a Word object into the WordList
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: word, count
	 * DOC: 3/31/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public void addWord(Word werd)
	{
		l.add(werd);
		count++; 
	}
	
	/* - getWordByString -  
	 * Purpose: gets a word from the list by the text of the word
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: name, gotWord, werd
	 * DOC: 3/31/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public Word getWordByString(String name)
	{
		Word gotWord = new Word();
		for (Word werd: l)
		{
			if (werd.getWord() == name)
			{
				gotWord = werd;
				break;
			}
		}
		return gotWord;
	}

	/* - getWordAt -  
	 * Purpose: gets a word from the list at a specific location in the list
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: werd, location
	 * DOC: 3/31/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public Word getWordAt(int location)
	{
		Word werd = (Word)this.l.get(location);
		return werd;
	}
	
	/* - getWordCount -  
	 * Purpose: returns the number of words in the list
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: None.
	 * DOC: 3/31/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public int getWordCount()
	{
		return l.size();
	} 
	
	/* - checkForWord -  
	 * Purpose: returns a boolean of whether a word is in the list.
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: None.
	 * DOC: 3/31/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public boolean checkForWord(String s)
	{
		boolean x = false;
		for (Word werd: l)
		{
			if (werd.getWord() == s)
			{
				x= true;
			}
			else
			{
				x= false;
			}
		}
		return x;
	}
	
	/* - isEmpty -  
	 * Purpose: returns whether the list is empty
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: None.
	 * DOC: 3/31/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public boolean isEmpty()
	{
		if (l.isEmpty())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	/* - getIndexByString -  
	 * Purpose: returns the index location of a specified word
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: p, curp, werd
	 * DOC: 3/31/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public int getIndexByString(String word)
	{
		int p = -1;
		int curp = 0;
		for (Word werd: l)
		{
			if (werd.getWord() == word)
			{
				p = l.indexOf(werd);
			}
			curp++;
		}
		return p;
	}
	
	/* - Replace -  
	 * Purpose: replaces a word at a set index, with a new word
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: index, word
	 * DOC: 3/31/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public void Replace(int index, Word word)
	{
		l.set(index, word);
	}
	
	/* - list -  
	 * Purpose: returns the list of Words
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: None
	 * DOC: 3/31/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public List<Word> list()
	{
		return l;
	}
	
	
	/* - printWords -
	 * Purpose: Print out all of the words into terminal
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: i
	 * DOC: 3/31/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public void printWords()
	{
		for (Word i: l)
		{
			System.out.println(i.getWord());
		}
	}
	
	
}
