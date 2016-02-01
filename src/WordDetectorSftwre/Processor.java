/* CS 431 Assignment 4
 * Homework by Michael Rosenberg
 * Submitted on 4/3/2015
 * Written and tested on Ubuntu 14.04 using:
 * Eclipse Helios Service Release 1: 
 * Build id: 20100917-0705
 * JRE: JavaSE 1.6
 */


package WordDetectorSftwre;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* - Processor - 
 * Purpose: This Processor class is the main class. It is used to process all data in order 
 * to get all the words from a string (taken from a file) separated and inserted into their
 * own Word object with the accurate information assigned to that word. Then puts each word
 * into a WordList object.
 * Written by: Michael Rosenberg
 * Language: Programming: Java | Words: English
 * Identifiers: None.
 * DOC: 3/30/2015 - 4/2/2015
 * Revision 3.0
 * Procedures used: 
 * Citations: None.
 */
public class Processor
{
	private String document = "";
	private String[] words;
	private WordList wordlist = new WordList();
	
	public Processor()
	{
		document = "";
	}
	public Processor(String str)
	{
		document = str;
	}
	
	public void Process(String str)
	{
		document = removeInterference(str);
		words = document.split("\\s+");
	}
	
	/* - Process - 
	 * Purpose: Processes all data:
	 * takes the text data and removes all excess data (not words)
	 * brings words into a string array and then converts all text to Uppercase
	 * the array is then sorted into A-Z.
	 * Creates a Hashset. Then it does through each word string, inserts it into a
	 * Word object with information as to whether it is a word beginning with D as
	 * well as how many times that word occurs in the file. 
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: document, words, set, copy, strList, werd
	 * DOC: 3/30/2015 - 4/2/2015
	 * Revision 1.7
	 * Procedures used: None.
	 * Citations: None.
	 */
	public void Process()
	{
		document = removeInterference(document);
		words = document.split("\\s+");
		for (int i=0;i<words.length;i++)
		{
			words[i] = words[i].toUpperCase();
		}
		Arrays.sort(words);
		HashSet<String> set = new HashSet<String>();
		String[] copy = words;
		for (int i=0;i<words.length;i++)
		{
			Word werd = new Word(words[i].toUpperCase());
			if (werd.getWord().toUpperCase().startsWith("D"))
			{
				werd.setStartsWithD(true);
			}
			else
			{
				werd.setStartsWithD(false);
			}
			List<String> strList = new LinkedList<String>(Arrays.asList(copy));;
			int occurrences = Collections.frequency(strList, words[i]);
			werd.IncrementWordCount(occurrences);
			if (!set.contains(words[i].toUpperCase()))
			{
				set.add(words[i].toUpperCase());
				wordlist.addWord(werd);
			}
		}
	}
	/* - getWords - 
	 * Purpose: returns the WordList wordlist
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: wordlist
	 * DOC: 3/30/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public WordList getWords()
	{
		return wordlist;
	}
	
	/* - getProcessedString - 
	 * Purpose: returns the string document
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: document
	 * DOC: 3/30/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	public String getProcessedString()
	{
		return document;
	}
	
	
	/* - removeInterface - 
	 * Purpose: Removes bullets, commas, slashes, question marks, exclamation marks, and indpendant dashes from the passed string.
	 * Written by: Michael Rosenberg
	 * Language: Programming: Java | Words: English
	 * Identifiers: doc
	 * DOC: 3/30/2015
	 * Revision 1.0
	 * Procedures used: None.
	 * Citations: None.
	 */
	private String removeInterference(String doc)
	{
		doc = doc.replace(".", "");
		doc = doc.replace(",", "");
		doc = doc.replace("\"", "");
		doc = doc.replace("?", "");
		doc = doc.replace("!", "");
		doc = doc.replace(" - ", "");
		return doc;
	}

	
	
}
