/**
 * CS442, Programming Design Patterns
 * StringOperations -- Performs string operations on input stream
 * @author	Victor Wu
 */ 

import java.util.Hashtable;
import java.util.Set;
import java.util.ArrayList;

class StringOperations {

	private ArrayList<String>  maxKey = new ArrayList<String>(); //< The list of all the keys matching the maximum value
	private Integer maxValue; //< The maximum value in the hashtable

	Hashtable<String, Integer> names; //< Hashtable of all occurances of word counts
	StringOperations() {
		maxKey = new ArrayList<String>();
		names = new Hashtable<String, Integer>();		
	}

	/**
	 * Process a string line, extract the name, and add it into the hashtable.
	 * @param line the string to be processed
	 */
	void add(String line){	
	int index = line.indexOf("element name") + 14;
	if (index != 13) {	
		//! Beware of corrupt input XML files, ex. quotations in name	
		int index_end = line.indexOf('\"', index);
		String name = line.substring(index, index_end);
		Integer count = names.get(name);
		if (count == null) names.put(name, 1);
		else {
			names.put(name, count+1);
		}
	}
}
	/**
	 * Computes the maximum value from the hashTable. Use accessor getValue() to retrieve.
	 */
	void max() {			
		maxValue = Integer.MIN_VALUE;	
		Set<String> set = names.keySet();	
		for (String name : set) {	
			if (names.get(name) > maxValue) {
				maxValue = names.get(name);	
			}
		}
	}

	/**
	 * Gets the maxValue. Be sure to call max() before getValue().
	 *
	 * @return the maxValue obtained from max()
	 */
	int getValue() {
		return maxValue;	
	}

	ArrayList<String> getKeys(){	
		maxKey.clear(); //< Clears all the existing values
		Set<String> set = names.keySet();
		for (String name : set) {
			if (names.get(name) == maxValue) {
				maxKey.add(name);
			}
		}
		return maxKey;
	}

	// To be implemented, when the need for debugging arises
	public String toString() {
		return super.toString();
	}
}
