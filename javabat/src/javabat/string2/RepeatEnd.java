package javabat.string2;


/*
Given a string and an int N, return a string made of N repetitions of the last N characters of the string. 
You may assume that N is between 0 and the length of the string, inclusive.
repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
*/

public class RepeatEnd {
	public String repeatEnd(String str, int n) {
		
		if (n > str.length()) {
			throw new IllegalArgumentException(
				String.format("The suffix cant be greater than the whole string. String=%s, suffix length=%d", str, n));
		}

		String suffix = str.substring(str.length() - n);
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i++) {
			result.append(suffix);
		}

		return result.toString();
	}
}
