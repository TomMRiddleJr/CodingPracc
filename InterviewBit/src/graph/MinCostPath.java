package graph;

import java.util.*;
import imports.*;

class Matrix {
	int x;
	int y;
	int cost;
	char dir;

	public Matrix(int x, int y, int cost, char dir) {
		super();
		this.x = x;
		this.y = y;
		this.cost = cost;
		this.dir = dir;
	}

}

public class MinCostPath {

	public static int solve(List<String> C, int A, int B) {
		Queue<Matrix> q = new PriorityQueue<>((a, b) -> a.cost - b.cost);
		Set<String> v = new HashSet<>();

		q.offer(new Matrix(0, 0, 0, C.get(0).charAt(0)));

		while (!q.isEmpty()) {
			Matrix m = q.poll();
			int x = m.x;
			int y = m.y;
			int cost = m.cost;
			char dir = m.dir;

			if (x == A - 1 && y == B - 1)
				return cost;
			if (cost >= A + B - 2)
				return A + B - 2;

			v.add(x + " " + y);

			int x1 = x > 0 ? x - 1 : 0;
			int x2 = x < A - 1 ? x + 1 : A - 1;
			int y1 = y > 0 ? y - 1 : 0;
			int y2 = y < B - 1 ? y + 1 : B - 1;

			if (!v.contains(x1 + " " + y)) {
				int temp = cost;
				if (dir != 'U')
					temp = temp + 1;
				q.offer(new Matrix(x1, y, temp, C.get(x1).charAt(y)));
			}
			if (!v.contains(x2 + " " + y)) {
				int temp = cost;
				if (dir != 'D')
					temp = temp + 1;
				q.offer(new Matrix(x2, y, temp, C.get(x2).charAt(y)));
			}
			if (!v.contains(x + " " + y1)) {
				int temp = cost;
				if (dir != 'L')
					temp = temp + 1;
				q.offer(new Matrix(x, y1, temp, C.get(x).charAt(y1)));
			}
			if (!v.contains(x + " " + y2)) {
				int temp = cost;
				if (dir != 'R')
					temp = temp + 1;
				q.offer(new Matrix(x, y2, temp, C.get(x).charAt(y2)));
			}
		}

		return A + B - 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solve(TakeMultiple.Strr.strList(" "), TakeSingle.oneInt(), TakeSingle.oneInt()));

	}

}

/*
 * This solution has better time complexity.

class Move {
    int x;
    int y;
    int cost;
    public Move(int x, int y, int cost){
        this.x=x;
        this.y=y;
        this.cost=cost;
    }
}

public class Solution {
    public int solve(int A, int B, ArrayList<String> C) {
        Deque<Move> q = new LinkedList<>();
        int[][] costMatrix = new int[A][B];
        for(int[] arr:costMatrix) Arrays.fill(arr, Integer.MAX_VALUE);

        q.add(new Move(0, 0, 0));
        costMatrix[0][0]=0;
        while(!q.isEmpty()){
            Move m = q.remove();
            char c = C.get(m.x).charAt(m.y);
            int cost=m.cost;
            addIfSafe(q, m.x+1, m.y, A, B, cost, c=='D', costMatrix);
            addIfSafe(q, m.x-1, m.y, A, B, cost, c=='U', costMatrix);
            addIfSafe(q, m.x, m.y+1, A, B, cost, c=='R', costMatrix);
            addIfSafe(q, m.x, m.y-1, A, B, cost, c=='L', costMatrix);
        }
        return costMatrix[A-1][B-1];
    }
    
    private void addIfSafe(Deque<Move> q, int x, int y, int A, int B, int cost,
        boolean followsPath, int[][] costMatrix){
        if(x>=0&&x<A && y>=0&&y<B){
            int costToAdd = followsPath ? cost : cost+1;
            if(costToAdd < costMatrix[x][y]){
                Move m = new Move(x, y, costToAdd);
                if(followsPath) q.addFirst(m);
                else q.add(m);
                costMatrix[x][y]=costToAdd;
            }
        }
    }
}
*/
