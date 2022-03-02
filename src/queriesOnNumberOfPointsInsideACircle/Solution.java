package queriesOnNumberOfPointsInsideACircle;

public class Solution {
	public int[] countPoints(int[][] points, int[][] queries) {
		int[] result = new int[queries.length];
		int inside;
		int r2;
		for (int i = 0; i < queries.length; i++) {
			inside = 0;
			r2 = queries[i][2] * queries[i][2];
			for (int j = 0; j < points.length; j++) {
				if ((queries[i][0] - points[j][0]) * (queries[i][0] - points[j][0])
						+ (queries[i][1] - points[j][1]) * (queries[i][1] - points[j][1]) <= r2) {
					inside++;
				}
			}
			result[i] = inside;
		}
		return result;
	}
}
