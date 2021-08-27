package tree;

import java.util.*;
import imports.*;

public class KthSmallestElementInTree {

	static PriorityQueue<Integer> pq;

	static void solve(TreeNode A, int B, PriorityQueue<Integer> pq) {
		if (A == null)
			return;

		pq.offer(A.val);
		if (pq.size() > B)
			pq.poll();

		solve(A.left, B, pq);
		solve(A.right, B, pq);
	}

	public int kthsmallest(TreeNode A, int B) {
		pq = new PriorityQueue<>(Collections.reverseOrder());
		solve(A, B, pq);
		return pq.poll();
	}

}
