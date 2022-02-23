package addingSpaceToAString;

import java.util.ArrayList;

public class Solution {

	public String addSpaces(String s, int[] spaces) {
		int n = spaces.length, i = 0, j = 0;
		StringBuilder res = new StringBuilder();

		while (i < s.length()) {

			if (j < n && i == spaces[j]) {
				res.append(" ");
				j++;
			}

			res.append(s.charAt(i));
			i++;
		}

		return res.toString();
	}

	// exceeds time limit
	public String addSpaces2(String s, int[] spaces) {
		ArrayList<String> list = new ArrayList<>();
		list.add(s.substring(0, spaces[0]));

		for (int i = 1; i < spaces.length; i++) {

			list.add(s.substring(spaces[i - 1], spaces[i]));

		}
		list.add(s.substring(spaces[spaces.length - 1]));
		String ans = "";
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				ans += list.get(i);
			} else {
				ans += list.get(i) + " ";
			}
		}

		return ans;
	}

}
