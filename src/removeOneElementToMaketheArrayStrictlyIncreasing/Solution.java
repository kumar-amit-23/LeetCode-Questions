package removeOneElementToMaketheArrayStrictlyIncreasing;

public class Solution {
	public boolean canBeIncreasing(int[] nums) {
		int dips = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] <= nums[i - 1]) {
				if (++dips == 2)
					return false;
			}
		}
		return true;
	} 
}
