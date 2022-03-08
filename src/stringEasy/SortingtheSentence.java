package stringEasy;

public class SortingtheSentence {
	public static void main(String[] ans) {
		System.out.println(sortSentence("is2 sentence4 This1 a3"));
	}

	public static String sortSentence(String s) {

		String[] arr = s.split(" ");
		String[] temp = new String[arr.length];

		for (String word : arr) {
			temp[word.charAt(word.length() - 1) - '1'] = word.substring(0, word.length() - 1);
		}
		return String.join(" ", temp);

	}

}
