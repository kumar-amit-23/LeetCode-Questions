package majorityElement;

import java.util.HashMap;

public class Solution {
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int n = nums.length / 2;
		int majorKey = 0;
		for (int key : map.keySet()) {
			if (map.get(key) > n) {
				majorKey = key;
			}
		}
		return majorKey;

	}

	// other solution

	public int majorityElement2(int[] nums) {
		int element = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == 0)
				element = nums[i];
			if (nums[i] == element)
				count++;
			else 
				count--;
		}
		return element;

	}

}
