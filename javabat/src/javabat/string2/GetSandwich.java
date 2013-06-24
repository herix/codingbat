package javabat.string2;
public class GetSandwich {
	
/*
 * A sandwich is two pieces of bread with something in between. 
 * Return the string that is between the first and last appearance of "bread" in the given string, 
 * or return the empty string "" if there are not two pieces of bread. 
 
getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
*/
	public String getSandwich(String str) {

		final String bread = "bread";
		int firstSlice = str.indexOf(bread);
		int lastSlice = str.lastIndexOf(bread);

		if (firstSlice == lastSlice)
			return "";

		int firstSliceEnd = firstSlice + bread.length();

		return str.substring(firstSliceEnd, lastSlice);
	}
}
