package dp;

import imports.*;
import java.util.*;

public class BestTime2BuyAndSell2 {
	
	public static int maxProfit(final List<Integer> A) {
		int ans = 0;
		for(int i = 0; i < A.size() - 1; i++) ans += A.get(i + 1) >= A.get(i) ? A.get(i + 1) - A.get(i) : 0;
		return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(maxProfit(TakeMultiple.Int.intList(" ")));

	}

}
