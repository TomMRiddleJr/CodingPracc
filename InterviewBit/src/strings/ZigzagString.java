package strings;

import imports.TakeSingle;
import java.util.*;
import java.util.stream.Collectors;

public class ZigzagString {
	
	public static String convert(String A, int B) {
		if(B == 1 || B == 0) return A;
		
		ArrayList<Character>[] al = new ArrayList[B];
		
		for(int i = 0; i < B; i++) {
			al[i] = new ArrayList<>();
		}
		
		int idx = 0;
		boolean flag = true;
		
		for(int j = 0; j < A.length(); j++) {
			char c = A.charAt(j);
			al[idx].add(c);
			
			if(flag) idx++;
			else idx--;
			
			if(idx == al.length - 1) flag = false;
			if(idx == 0) flag = true;
		}
		
		StringBuilder str = new StringBuilder();
		
		for(ArrayList<Character> chars : al) {
			String temp = (String) chars.stream().map(String::valueOf).collect(Collectors.joining());
			str.append(temp);
		}
		
		return str.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(convert(TakeSingle.oneString(), TakeSingle.oneInt()));

	}

}
