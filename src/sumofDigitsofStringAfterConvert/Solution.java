package sumofDigitsofStringAfterConvert;

public class Solution {
	public int getLucky(String s, int k) {
		String number ="";
		for(int i = 0; i<s.length(); i++) {
			number +=  ((int)s.charAt(i) - 97);
		}
		
		
		return Integer.parseInt(number);
	}

}
