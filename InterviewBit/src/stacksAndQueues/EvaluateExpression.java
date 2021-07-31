package stacksAndQueues;

import java.util.*;
import imports.*;

public class EvaluateExpression {

	public static int evalRPN(List<String> A) {
		if (A.size() == 1)
			return Integer.parseInt(A.get(0));
		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < A.size(); i++) {
			String str = A.get(i);

			if (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/"))
				s.add(Integer.parseInt(str));
			else {
				int y = s.pop();
				int x = s.pop();

				if (str.equals("+"))
					s.add(x + y);
				else if (str.equals("-"))
					s.add(x - y);
				else if (str.equals("*"))
					s.add(x * y);
				else
					s.add(x / y);
			}
		}

		return s.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(evalRPN(TakeMultiple.Strr.strList(" ")));
	}

}
