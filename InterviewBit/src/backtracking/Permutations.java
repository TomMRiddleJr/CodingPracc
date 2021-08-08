package backtracking;

import java.util.*;
import imports.*;

public class Permutations {
	static ArrayList<ArrayList<Integer>> sol;
	
	static void helper(ArrayList<Integer> A, String ans) {
		if(A.size() == 0) {
			ArrayList<Integer> temp = new ArrayList<>();
			for(char c : ans.toCharArray()) {
				temp.add(Integer.parseInt(Character.toString(c)));
			}
			sol.add(temp);
			return;
		}
		
		for(int i = 0; i < A.size(); i++) {
			ArrayList<Integer> temp = new ArrayList<>(A);
			int idx = temp.remove(i);
			
			helper(temp, ans+A.get(i));
		}
	}
	
	
	public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
		sol = new ArrayList<ArrayList<Integer>>();
		helper(A, "");
		return sol;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(permute((ArrayList<Integer>) TakeMultiple.Int.intList(" ")));

	}

}
