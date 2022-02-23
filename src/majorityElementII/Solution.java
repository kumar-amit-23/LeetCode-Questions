package majorityElementII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public List<Integer> majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		List<Integer> list = new ArrayList<>();
		for (int key : map.keySet()) {
			if (map.get(key) >= nums.length / 3)
				list.add(key);
		}

		return list;
	}

	// second solution
	public List<Integer> majorityElement2(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		List<Integer> list = new ArrayList<Integer>();

		for (int num : nums) {
			if (!hm.containsKey(num))
				hm.put(num, 1);
			else {
				hm.put(num, 1 + hm.get(num));
			}
			if (hm.get(num) > nums.length / 3 && !list.contains(num))
				list.add(num);
		}

		return list;
	}

}
