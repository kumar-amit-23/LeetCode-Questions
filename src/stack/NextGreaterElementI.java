package stack;

public class NextGreaterElementI {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {

		int[] ans = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			ans[i] = nextGreater(nums2, nums1[i]);
		}

		return ans;

	}

	private int nextGreater(int[] nums2, int value) {
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] == value) {
				int num = nums2[i];
				while (i < nums2.length) {
					if (nums2[i] > num)
						return nums2[i];
					i++;
				}
			}
		}
		return -1;
	}

}
