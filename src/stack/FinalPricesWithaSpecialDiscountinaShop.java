package stack;

public class FinalPricesWithaSpecialDiscountinaShop {
	public int[] finalPrices(int[] prices) {
//		int[] ans = new int[prices.length];
//		int idx = 0;
//		boolean flag = false;
//		for (int i = 0; i < prices.length; i++) {
//			flag = false;
//			for (int j = i + 1; j < prices.length; j++) {
//				if (prices[j] <= prices[i]) {
//					ans[idx++] = prices[i] - prices[j];
//					flag = true;
//					break;
//				}
//
//			}
//			if (!flag)
//				ans[idx++] = prices[i];
//		}
//
//		return ans;

		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] <= prices[i]) {
					prices[i] -= prices[j];
					break;
				}
			}
		}

		return prices;
	}

}
