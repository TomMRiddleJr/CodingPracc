package strings;

import java.util.*;

import imports.TakeSingle;

public class ReverseTheString {
	
	public static String solve(String A) {
		
		String[] strArr = A.split(" ");
		
		Stack<String> revStr = new Stack<>();
		
		for(String s : strArr) if(!s.isEmpty()) revStr.push(s.trim());
		
		StringBuilder sb = new StringBuilder();
		
		while(revStr.size() > 0) {
			sb.append(revStr.pop() + " ");
		}
		
		
		return sb.toString().trim();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solve(TakeSingle.oneString()));

	}

}
