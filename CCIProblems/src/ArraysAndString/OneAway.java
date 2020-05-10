package ArraysAndString;

/**
 * One Away: There are three types of edits that can be performed on strings: 
 * insert a character, remove a character, or replace a character.
 *  Given two strings, write a function to check if they are one edit (or zero edits) away.
EXAMPLE
pale, ple true pales, pale -> true pale, bale -> true pale, bae -> false
 * @author ramkrishnabhattarai
 *
 */

public class OneAway {
	
	boolean oneEditAway(String first, String second) {
		if (first.length()== second.length()) {
			return oneEditReplace(first, second);
		} else if (first.length()+ 1== second.length()) {
			return oneEditInsert(first, second);
		} else if (first.length() - 1== second.length()) {
			return oneEditInsert(second, first);
		}
		return false;
		}
		
	

		boolean oneEditReplace(String s1, String s2) {
			boolean foundDifference = false;
		
		for (int i= 0; i < s1.length(); i++) {
		if (s1.charAt(i) != s2.charAt(i)) {
			if (foundDifference) {
				return false;
			}
			foundDifference = true;
		}
		}
		return true;
		}
		
		/* Check if you can insert a character into sl to make s2. */ 
		boolean oneEditInsert(String sl, String s2) {
			int indexl = 0;
			int index2 = 0;
			while (index2< s2.length() && indexl< sl.length()) {
			if (sl.charAt(indexl) != s2.charAt(index2)) {
			if (indexl !=index2) {
			return false;
			}
			index2++;
			} else {
			indexl++;
			index2++;
			}
			}
			return true;
		}
		
		// approach 2
		
		
		boolean oneEditAway2(String first, String second) {
			/* Length checks. */
			if (Math.abs(first.length() - second.length()) > 1) {
				return false;
			}
			
			/* Get shorter and longer string.*/
			String sl = first.length()< second.length() ? first : second;
			String s2 =first.length()< second.length() ? second : first;
			int indexl =0;
			int index2 =0;
			boolean foundDifference = false;
			while (index2< s2.length() && indexl< sl.length()) {
			if (sl.charAt(indexl) !=s2.charAt(index2)) {
				
				/* Ensure that this is the first difference found.*/
			
				if (foundDifference) return false;
				
				foundDifference = true;
				if (sl.length() == s2.length()) {//On replace, move shorter pointer
				
				indexl++;
				
				}
			
				} else {
				
				indexl++; // If matching, move shorter pointer
				
				}
				
				index2++; // Always move pointer for longer string
				
				}
				
				return true;
			}
			
}
