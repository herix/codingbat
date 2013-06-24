package javabat.string2;


/*
Given a string, does "xyz" appear in the middle of the string? To define middle, 
we'll say that the number of chars to the left and right of the "xyz" must 
differ by at most one. This problem is harder than it looks. 

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false

*/

public class XyzMiddle {
	

	public boolean xyzMiddle(String str) {

		final String xyz = "xyz";

		if (str.length() < xyz.length()) {
			return false;
		}

		int mid = str.length() / 2;
		int start = mid - 1;

		if (middleEquals(start, str, xyz)) {
			return true;
		} else {

			start = start - 1;
			String front = str.substring(0, start);
			String end = str.substring(start + xyz.length());

			return middleEquals(start, str, xyz)
					&& Math.abs(front.length() - end.length()) <= 1;
		}

	}

	private boolean middleEquals(int start, String str, String mid) {
		String strMid = str.substring(start, start + mid.length());
		return strMid.equals(mid);
	}

}
