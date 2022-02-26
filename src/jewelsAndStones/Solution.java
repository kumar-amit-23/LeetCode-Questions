package jewelsAndStones;

import java.util.ArrayList;

public class Solution {
	public int numJewelsInStones(String jewels, String stones) {
		ArrayList<Character> list = new ArrayList<>();
		
		for(int i = 0; i<jewels.length(); i++)
			list.add(jewels.charAt(i));
		
		int total = 0;
		for(int i = 0; i<stones.length(); i++) 
			total += list.contains(stones.charAt(i)) ? 1 : 0 ;
		
		return total;
			
	}
}
