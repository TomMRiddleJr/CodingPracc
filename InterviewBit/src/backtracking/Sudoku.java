package backtracking;

import java.util.*;
import imports.*;

public class Sudoku {

	ArrayList<ArrayList<HashSet<Character>>> list;

	public static boolean isValid(ArrayList<ArrayList<Character>> a, int row, int col, char value) {

		int rowStart = row / 3 * 3;
		int colStart = col / 3 * 3;

		for (int i = 0; i < 9; i++) {
			if (a.get(row).get(i) == value)
				return false;
			if (a.get(i).get(col) == value)
				return false;
			if (a.get(rowStart + i / 3).get(colStart + i % 3) == value)
				return false;
		}
		return true;
	}

	public static boolean backTrack(ArrayList<ArrayList<Character>> a, int row) {
		if (row == 9)
			return true;
		else {
			for (int i = 0; i < 9; i++) {
				if (i == 8 && a.get(row).get(i) != '.')
					if (backTrack(a, row + 1))
						return true;
				if (a.get(row).get(i) == '.') {
					for (char curr = '1'; curr <= '9'; curr++) {
						if (isValid(a, row, i, curr)) {
							a.get(row).set(i, curr);
							if (backTrack(a, row))
								return true;
							else
								a.get(row).set(i, '.');
						}
					}
					return false;
				}
			}
			return false;
		}
	}

	public static void solveSudoku(ArrayList<ArrayList<Character>> a) {
		backTrack(a, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Character>> arr = new ArrayList<>();

		for (int i = 0; i < 9; i++) {
			ArrayList<Character> temp = new ArrayList<>();
			for (int j = 0; j < 9; j++)
				temp.add(TakeSingle.oneString().charAt(0));
			arr.add(temp);
		}

		solveSudoku(arr);
	}
}
