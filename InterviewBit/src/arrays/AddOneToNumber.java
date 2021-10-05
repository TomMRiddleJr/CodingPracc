package arrays;

import java.math.BigInteger;
import java.util.*;

import imports.TakeMultiple;

public class AddOneToNumber {
	
	public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		int z = 0;
		ArrayList<String> str = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while(z < A.size()) {
			if(A.get(z) == 0) A.remove(z);
			else break;
		}
		
		if(A.size() == 0) {
			ans.add(1);
			return ans;
		}
		
		for(int i : A) str.add(Integer.toString(i));
		
		String numStr = String.join("", str);
		
		BigInteger num = new BigInteger(numStr);
		num = num.add(BigInteger.ONE);
		
		String ansStr = num.toString();
		
		for(int i = 0; i < ansStr.length(); i++) ans.add(Integer.parseInt(Character.toString(ansStr.charAt(i))));
		
		return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(plusOne((ArrayList<Integer>) TakeMultiple.Int.intList(" ")));

	}

}
