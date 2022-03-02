package array_easy;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j])
					count++;
			}
			result[i] = count;
		}
		return result;
	}
}
