package math;

import java.util.*;
import imports.TakeSingle;

public class PowerOfTwoIntegers {
	
	public static ArrayList<Integer> factors(int A) {
		int B = A;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 2; i <= Math.sqrt(A) + 1; i++) if(A % i == 0) {
			list.add(i);
			A /= i;
			i--;
		}
		if(A != B && A != 1) list.add(A);
		return list;
	}
	
	public static int isPower(int A) {
		if(A == 1) return 1;
		
		if(factors(A).size() == 0) return 0;
		
		for(int i : factors(A)) if(factors(A).indexOf(i) == factors(A).lastIndexOf(i)) return 0;
		
		return 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPower(TakeSingle.oneInt()));

	}

}
