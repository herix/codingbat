package javabat.string2;

/*
 Returns true if for every '*' (star) in the string, if there are chars both immediately 
 before and after the star, they are the same. 

 sameStarChar("xy*yzz") → true
 sameStarChar("xy*zzz") → false
 sameStarChar("*xa*az") → true
 */

public class SameStarChar {
	public boolean sameStarChar(String str) {

		final String star = "*";
		int i = str.indexOf(star, 1);

		while (i != -1 && i < str.length() - 1) {

			if (str.charAt(i - 1) != str.charAt(i + 1))
				return false;

			i = str.indexOf(star, i + star.length());
		}

		return true;
	}

}
