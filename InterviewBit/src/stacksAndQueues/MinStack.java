package stacksAndQueues;

import java.util.*;

public class MinStack {

	Stack<Integer> s;
	Stack<Integer> ss;

	public MinStack() {
		// TODO Auto-generated constructor stub
		s = new Stack<>();
		ss = new Stack<>();
	}

	public void push(int x) {
		s.add(x);
		if (ss.empty() || x < ss.peek())
			ss.add(x);
	}

	public void pop() {
		if (!s.empty()) {
			int x = s.pop();
			if (x == ss.peek())
				ss.pop();
		}
	}

	public int top() {
		return s.empty() ? -1 : s.peek();
	}

	public int getMin() {
		return ss.empty() ? -1 : ss.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
