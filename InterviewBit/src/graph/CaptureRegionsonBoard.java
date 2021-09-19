package graph;

import java.io.*;
import java.util.*;

public class CaptureRegionsonBoard {
	static Set<String> v;

	static void bfs(ArrayList<ArrayList<Character>> a, int x, int y) {
		Queue<String> q = new LinkedList<>();
		q.offer(x + " " + y);

		while (!q.isEmpty()) {
			String pos = q.poll();
			v.add(pos);
			String[] coords = pos.split(" ");
			int i = Integer.parseInt(coords[0]);
			int j = Integer.parseInt(coords[1]);

			if (a.get(i).get(j) == 'X')
				continue;

			if (i - 1 > -1 && a.get(i - 1).get(j) == 'O' && !v.contains((i - 1) + " " + j))
				q.offer((i - 1) + " " + j);
			if (j - 1 > -1 && a.get(i).get(j - 1) == 'O' && !v.contains(i + " " + (j - 1)))
				q.offer(i + " " + (j - 1));
			if (i + 1 < a.size() && a.get(i + 1).get(j) == 'O' && !v.contains((i + 1) + " " + j))
				q.offer((i + 1) + " " + j);
			if (j + 1 < a.get(0).size() && a.get(i).get(j + 1) == 'O' && !v.contains(i + " " + (j + 1)))
				q.offer(i + " " + (j + 1));
		}

	}

	public static void solve(ArrayList<ArrayList<Character>> a) {
		int[] i = new int[] { 0, a.size() - 1 };
		int[] j = new int[] { 0, a.get(0).size() - 1 };
		v = new HashSet<>();

		for (int m : i)
			for (int n = 0; n < a.get(0).size(); n++)
				if (!v.contains(m + " " + n))
					bfs(a, m, n);

		for (int n : j)
			for (int m = 0; m < a.size(); m++)
				if (!v.contains(m + " " + n))
					bfs(a, m, n);

		for (int x = 0; x < a.size(); x++)
			for (int y = 0; y < a.get(0).size(); y++)
				if (a.get(x).get(y) == 'O' && !v.contains(x + " " + y))
					a.get(x).set(y, 'X');

		System.out.println(a);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<ArrayList<Character>> l = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			ArrayList<Character> temp = new ArrayList<>();
			for (char c : s.toCharArray())
				temp.add(c);
			l.add(temp);
		}

		br.close();

		solve(l);

	}

}
