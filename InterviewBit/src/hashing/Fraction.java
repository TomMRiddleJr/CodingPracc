package hashing;

import java.util.*;
import imports.*;

public class Fraction {

	public static String fractionToDecimal(int A, int B) {
		long a = A, b = B;
		if (a % b == 0)
			return String.valueOf(a / b);
		Map<Long, Integer> map = new HashMap<>();
		StringBuilder res = new StringBuilder();
		if ((a > 0 && b < 0) || (a < 0 && b > 0))
			res.append("-");
		a = Math.abs(a);
		b = Math.abs(b);
		res.append(a / b + ".");
		a = (a % b) * 10;
		while (!map.containsKey(a)) {
			map.put(a, res.length());
			res.append(String.valueOf(a / b));
			a = (a % b) * 10;
			if (a == 0)
				return res.toString();
		}
		return res.insert(map.get(a), "(").append(")").toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fractionToDecimal(TakeSingle.oneInt(), TakeSingle.oneInt()));

	}

}
