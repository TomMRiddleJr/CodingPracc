package imports;

import java.util.Scanner;

public class TakeSingle {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int oneInt() {
		int x = sc.nextInt();
		return x;
	}
	
	public static String oneString() {
		String x = sc.nextLine();
		return x;
	}
	
	{
		sc.close();
	}

}
