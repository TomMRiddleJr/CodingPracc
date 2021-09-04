package greedyAlgorithm;

import java.util.*;
import imports.*;

public class GasStation {
	
	/*
	 * Smaller solution
	 * 
	public int canCompleteCircuit(final List<Integer> gas, final List<Integer> cost) {
		int currentFuel = 0;
		int remaining = 0;
		int total = 0;
		int start = 0;
		for (int i = 0; i < gas.size(); i++) {
			remaining = gas.get(i) - cost.get(i);
			if (currentFuel >= 0)
				currentFuel += remaining;
			else {
				currentFuel = remaining;
				start = i;
			}
			total += remaining;
		}
		return total >= 0 ? start : -1;
	}
	*/

	static int sum(ArrayList<Integer> a) {
		int sum = 0;
		for (int i : a)
			sum += i;
		return sum;
	}

	public static int canCompleteCircuit(final List<Integer> A, final List<Integer> B) {
		ArrayList<Integer> surDef = new ArrayList<>();

		for (int i = 0; i < A.size(); i++)
			surDef.add(A.get(i) - B.get(i));

		if (sum(surDef) < 0)
			return -1;

		int sum = 0;
		int idx = 0;
		boolean flag = false;
		for (int i = 0; i < surDef.size(); i++) {
			if (sum < 0) {
				flag = false;
				sum = 0;
			}
			if (flag)
				sum += surDef.get(i);
			else {
				if (surDef.get(i) >= 0) {
					sum += surDef.get(i);
					flag = true;
					idx = i;
				}
			}
		}

		return idx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(canCompleteCircuit(TakeMultiple.Int.intList(" "), TakeMultiple.Int.intList(" ")));

	}

}
