package greedyAlgorithm;

import java.util.*;
import imports.*;

public class HighestProduct {

	public static int maxp3(List<Integer> A) {
		Collections.sort(A);
		return Math.max(A.get(A.size() - 1) * A.get(A.size() - 2) * A.get(A.size() - 3),
				A.get(A.size() - 1) * A.get(0) * A.get(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(maxp3(TakeMultiple.Int.intList(" ")));

	}

}
