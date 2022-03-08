package stringEasy;

public class CapitalizeTheTitle {
	public String capitalizeTitle(String title) {
		String[] strArr = title.split(" ");
		String ans = "";

		for (String word : strArr) {
			if (word.length() <= 2) {
				for (int i = 0; i < word.length(); i++) {
					int num = word.charAt(i);
					if (num >= 65 && num <= 90) {
						ans += (char) (num + 32);
					} else {
						ans += word.charAt(i);
					}
				}
			} else {
				if (word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
					ans += (char) (word.charAt(0) - 32);
				} else {
					ans += word.charAt(0);
				}
				for (int i = 1; i < word.length(); i++) {
					int num = word.charAt(i);
					if (num >= 65 && num <= 90) {
						ans += (char) (num + 32);
					} else {
						ans += word.charAt(i);
					}
				}

			}
			ans += " ";
		}

		return ans.strip();
	}

}
