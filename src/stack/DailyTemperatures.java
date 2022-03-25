package stack;


import java.util.Stack;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		int[] ans = new int[temperatures.length];
		Stack<Integer> stack = new Stack<>();
		for (int day = 0; day < ans.length; day++) {
			while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[day]) {
				int prevday = stack.pop();
				ans[prevday] = day - prevday;
			}
			stack.push(day);
		}

		return ans;

	}
}
