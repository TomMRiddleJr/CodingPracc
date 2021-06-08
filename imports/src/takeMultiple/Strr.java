package takeMultiple;

import java.util.*;

import takeSingle.Str;

public class Strr {
	
private static String input = Str.oneString();
	
	public static String[] strArray(String separator) {
		String[] x = input.split(separator);
		
		return x;
	}
	
	public static List<String> strList(String separator) {
		
		String[] arr = input.split(separator);
		
		List<String> x = new ArrayList<>();
		
		for(String str : arr) x.add(str);
		
		return x;
	}

}
