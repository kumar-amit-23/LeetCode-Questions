package array_easy;

import java.util.HashMap;
import java.util.List;

public class CountItemsMatchingaRule {
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
		HashMap<String, Integer> map = new HashMap<>() {
			{
				put("type", 0);
				put("color", 1);
				put("name", 2);
			}
		};
		for (List<String> list : items) {
			if (list.get(map.get(ruleKey)).equals(ruleValue))
				count++;
		}

		return count;
//		int index = -1;
//
//		switch (ruleKey) {
//		case "type":
//			index = 0;
//			break;
//		case "color":
//			index = 1;
//			break;
//		case "name":
//			index = 2;
//			break;
//		}
//
//		int count = 0;
//
//		for (List<String> list : items) {
//			if (list.get(index).equals(ruleValue))
//				count++;
//		}
//		return count;
	}

}
