package tree;

import imports.*;
import java.util.*;

public class SortedArrayToBalancedBST {

	public TreeNode sortedArrayToBST(final int[] A) {
		if (A.length == 0)
			return null;
		int i = 0, j = A.length;
		int mid = (i + j) / 2;
		TreeNode ans = new TreeNode(A[mid]);

		ans.left = sortedArrayToBST(Arrays.copyOfRange(A, i, mid));
		ans.right = sortedArrayToBST(Arrays.copyOfRange(A, mid + 1, j));

		return ans;

	}

}
