package imports;

import java.util.Scanner;

public class TakeSingle {
	
	public static int oneInt() {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		
		return x;
	}
	
	public static String oneString() {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();
		
		sc.close();
		
		return x;
	}

}
