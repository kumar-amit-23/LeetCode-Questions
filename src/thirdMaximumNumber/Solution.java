package thirdMaximumNumber;

import java.util.Arrays;

public class Solution {

	public int thirdMax(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		int len = nums.length - 1;
		int val = nums[len];
		for (int i = len; i >= 0; i--) {
			if (nums[i] != val) {
				count += 1;
				val = nums[i];
			}
			if (count == 2)
				return val;
		}
		return nums[len];

	}
}
