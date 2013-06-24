package javabat.string2;

/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. 
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp". 

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
*/

public class ZipZap {

	public String zipZap(String str) {

		final String m = "z.p";
		StringBuilder sb = new StringBuilder(str);
		int i = indexOf(sb, m, 0);

		while (i != -1 && i < str.length() - 1) {
			sb.deleteCharAt(i + 1);
			i = indexOf(sb, m, i + 1);
		}

		return sb.toString();
	}

	private int indexOf(StringBuilder str, String m, int start) {

		for (int i = start; i <= str.length() - m.length(); i++) {
			for (int j = 0; j < m.length(); j++) {
				if (m.charAt(j) == '.')
					continue;
				if (str.charAt(i + j) != m.charAt(j))
					break;
				if (j == m.length() - 1)
					return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		new ZipZap().zipZap("zopzop"); // "zpXzp"
	}

}
