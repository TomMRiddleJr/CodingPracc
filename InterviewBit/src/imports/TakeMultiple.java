package imports;

import java.util.ArrayList;
import java.util.List;

public class TakeMultiple {

	private static String input = TakeSingle.oneString();

	public static class Int {

		public static int[] intArray(String separator) {
			String[] arr = input.split(separator);

			int[] x = new int[arr.length];
			int i = 0;

			for (String str : arr) {
				x[i] = Integer.parseInt(str);
				i++;
			}

			return x;
		}

		public static List<Integer> intList(String separator) {
			String[] arr = input.split(separator);

			List<Integer> x = new ArrayList<>();

			for (String str : arr)
				x.add(Integer.parseInt(str));

			return x;
		}

	}

	public static class Strr {

		public static String[] strArray(String separator) {
			String[] x = input.split(separator);

			return x;
		}

		public static List<String> strList(String separator) {
			String[] arr = input.split(separator);

			List<String> x = new ArrayList<>();

			for (String str : arr)
				x.add(str);

			return x;
		}

	}
}
