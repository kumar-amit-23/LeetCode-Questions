package deleteColumnstoMakeSorted;

public class Solution {
	public int minDeletionSize(String[] strs) {
		int col_no = 0;
		int total_col = 0;
		
		for(int i = 0; i<strs.length-1; i++) {
			if(strs[i+1].charAt(col_no) < strs[i].charAt(col_no))
				total_col++;
			col_no++;
		}
		
		return total_col;
		
	}
}
