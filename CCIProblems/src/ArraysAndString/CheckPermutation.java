package ArraysAndString;

import java.util.Arrays;

/**
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 * @author ramkrishnabhattarai
 *
 */

public class CheckPermutation {

	// approach 1
	String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	boolean perm(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
}
