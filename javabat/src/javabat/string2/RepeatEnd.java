package javabat.string2;

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
