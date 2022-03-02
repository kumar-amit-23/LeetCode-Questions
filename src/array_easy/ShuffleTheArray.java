package array_easy;

public class ShuffleTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 1, 3, 4, 7 };
		int[] res = shuffle(arr, 3);
		for (int num : res) {
			System.out.println(num);
		}
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				ans[i] = nums[i];
			} else {
				ans[i] = nums[n + i];
			}

		}
		return ans;
	}

}
