package array_easy;

public class SumofAllOddLengthSubarrays {

	public static void main(String[] arg) {
		int[] arr = { 1, 4, 2, 5, 3 };
		System.out.println(sumOddLengthSubarrays(arr));
	}

	public static int sumOddLengthSubarrays(int[] arr) {
		int finalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int indx = 1;
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (indx % 2 == 1) {
					finalSum += sum;
				}
				indx++;
			}
		}
		return finalSum;
	}

}
