package stringEasy;

public class GoalParserInterpretation {
	public String interpret(String command) {
		String ans = "";
		for (int i = 0; i < command.length(); i++) {
			if (command.charAt(i) == ')' && command.charAt(i - 1) == 'l') {
				ans += "al";
			} else if (command.charAt(i) == ')' && command.charAt(i - 1) == '(') {
				ans += "o";
			} else if (command.charAt(i) == 'G') {
				ans += "G";
			}
		}
		return ans;
	}
}
