package slowestKey;

public class Solution {
	public char slowestKey(int[] releaseTimes, String keysPressed) {
		char key = keysPressed.charAt(0);
		int time = releaseTimes[0];
		for (int i = 1; i < releaseTimes.length; i++) {
			if (releaseTimes[i] - releaseTimes[i - 1] > time) {
				time = releaseTimes[i] - releaseTimes[i - 1];
				key = keysPressed.charAt(i);
			} else if (releaseTimes[i] - releaseTimes[i - 1] == time) {
				if (keysPressed.charAt(i) > key) {
					key = keysPressed.charAt(i);
				}
			}
		}
		return key;
	}

}
