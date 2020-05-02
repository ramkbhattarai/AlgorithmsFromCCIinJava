package ArraysAndString;

public class IsUnique {
	
	/**
	 * Implement an algorithm to determine if a string has all unique characters.
	 *  What if you cannot use additional data structures?
	 * @param args
	 */



static boolean isUniqueChars(String s) {
	if (s.length() > 128) return false;
	
	boolean[] setOfChar= new boolean[128];
	
	for (int i= 0; i < s.length(); i++) {
		
		int value= s.charAt(i);
		if (setOfChar[value]) {
		return false;
		}
		setOfChar[value]= true;
	}
	
	
	return true;
}

static boolean isUniqueChars2(String str) {
	int checker= 0;
	for (int i= 0; i < str.length(); i++) {
		int value= str.charAt(i) - 'a';
		if ((checker & (1 << value)) > 0) {
			return false;
		}
		checker |= (1 << value);
	}
	return true;
}
	
	public static void main(String[] args) {
		System.out.println(isUniqueChars("hi there"));
		System.out.println(isUniqueChars2("hi there"));
	}

}
