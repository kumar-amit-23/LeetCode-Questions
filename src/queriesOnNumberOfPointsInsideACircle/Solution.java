package queriesOnNumberOfPointsInsideACircle;

public class Solution {
	public int[] countPoints(int[][] points, int[][] queries) {
		for(int i = 0; i<points.length; i++) {
			if(Math.pow((points[i][0] - queries[i][0]),2) + Math.pow((points[i][1] - queries[i][1]), 2) <= Math.pow(queries[i][2], 2)) {
				
			}
			
		}
	}
}
