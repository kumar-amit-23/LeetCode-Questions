package maximumNumberofWordsFoundinSentences;

public class Solution {
	public int mostWordsFound(String[] sentences) {
		int max = 0;
		int len = 0;
		for (int i = 0; i < sentences.length; i++) {
			len = sentences[i].split(" ").length;
			max = Math.max(max, len);
			len = 0;
		}
		return max;
	}
}
