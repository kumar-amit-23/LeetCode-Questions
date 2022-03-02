package array_easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int greatest = 0;
		List<Boolean> list = new ArrayList<>();
		for (int num : candies) {
			if (num > greatest) {
				greatest = num;
			}
		}

		for (int num : candies) {
			if (num + extraCandies >= greatest)
				list.add(true);
			else {
				list.add(false);
			}
		}
		return list;
	}
}
