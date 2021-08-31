package dp;

import java.util.*;
import imports.*;

public class BestTime2BuyAndSell3 {

	public static int maxProfit(final List<Integer> a) {
		if (a.size() == 0)
			return 0;

		int fB = Integer.MIN_VALUE;
		int fS = 0;
		int sB = Integer.MIN_VALUE;
		int sS = 0;

		for (Integer curPrice : a) {
			fB = Math.max(fB, -curPrice);
			fS = Math.max(fS, curPrice + fB);
			sB = Math.max(sB, fS - curPrice);
			sS = Math.max(sS, curPrice + sB);
		}

		return sS;
	}
	
	/*
	 * Another implementation
	 * 
	 public int maxProfit(final List<Integer> A) {
        if(A==null||A.size()<2){
            return 0;
        }
        int[] first= new int[A.size()+1];
        int min = A.get(0);
        int size = A.size();
        for(int i = 1; i<size; i++){
            first[i] = Math.max(first[i-1], A.get(i)-min);
            min = Math.min(min, A.get(i));
        }
        int max = A.get(size-1);
        int res = first[size-1];
        int second = 0;
        for(int i = size-2; i>=2; i--){
            second = Math.max(second, max-A.get(i));
            res = Math.max(res, first[i-1]+second);
            max = Math.max(max, A.get(i));
        }
        return res;
    }
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(maxProfit(TakeMultiple.Int.intList(" ")));

	}

}
