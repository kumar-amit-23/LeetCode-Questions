package summaryRanges;

import java.util.ArrayList;

public class Solution {
	public List<String> summaryRanges(int[] nums) {
		ArrayList<String> list = new ArrayList<>();
		String str = "";
		for(int i = 0; i<nums.length; i++) {
			str = "";
			if(i == 0) {
				str += nums[i];
			}else {
				if(nums[i] == nums[i-1] + 1) {
					str += nums[i];
				}
			}
				
		}
	}
}
