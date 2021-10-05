package arrays;

import java.util.*;
import imports.*;

public class MergeOverlappingIntervals {

	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		Collections.sort(intervals, (a, b) -> a.start - b.start);
		
		int i = 0;
		
		while(i < intervals.size() - 1) {
			if(intervals.get(i).end >= intervals.get(i+1).start) {
				int start = Math.min(intervals.get(i).start, intervals.get(i+1).start);
				int end = Math.max(intervals.get(i).end, intervals.get(i+1).end);
				
				intervals.set(i, new Interval(start, end));
				intervals.remove(i+1);
			} else i++;
		}
		
		return intervals;
	}
	
	// 1 3 2 6 -> 1 6 2 6

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = TakeSingle.oneInt();
		ArrayList<Interval> intervals = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			int tempStart = TakeSingle.oneInt();
			int tempEnd = TakeSingle.oneInt();
			Interval temp = new Interval(tempStart, tempEnd);

			intervals.add(temp);
		}

		System.out.println(merge(intervals));
	}

}
