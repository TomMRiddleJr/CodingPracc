package takeMultiple;

import java.util.*;
import takeSingle.Str;

public class Int {
	
	private static String input = Str.oneString();
	
	public static int[] intArray(String separator) {
		
		String[] arr = input.split(separator);
		
		int[] x = new int[arr.length];
		int i = 0;
		
		for(String str : arr) {
			x[i] = Integer.parseInt(str);
			i++;
		}
		
		return x;
	}
	
	public static List<Integer> intList(String separator) {
		
		String[] arr = input.split(separator);
		
		List<Integer> x = new ArrayList<>();
		
		for(String str : arr) x.add(Integer.parseInt(str));
		
		return x;
	}

}
