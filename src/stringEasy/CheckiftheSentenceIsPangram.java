package stringEasy;

import java.util.HashSet;

public class CheckiftheSentenceIsPangram {
	public boolean checkIfPangram(String sentence) {

		if (sentence.length() < 26)
			return false;
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < sentence.length(); i++) {
			set.add(sentence.charAt(i));
		}

		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (set.contains(ch))
				continue;
			return false;
		}

		return true;

	}

}
