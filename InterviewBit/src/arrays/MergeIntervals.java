package arrays;

import java.util.*;
import imports.*;

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
	
	@Override
	public String toString() {
		return String.format("[" + start + ", " + end + "]");
	}
}

public class MergeIntervals {

	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		int start = newInterval.start;
		int end = newInterval.end;
		int i = 0;
		
		while(i < intervals.size()) {
			int tempStart = intervals.get(i).start;
			int tempEnd = intervals.get(i).end;
			
			if(tempStart > end) break;
			if(tempEnd < start) {
				i++;
				continue;
			}
			
			start = Math.min(start, tempStart);
			end = Math.max(end, tempEnd);
			
			i++;
		}
		
		ArrayList<Interval> ans = new ArrayList<>(intervals.subList(0, i));
		ans.add(new Interval(start, end));
		ans.addAll(intervals.subList(i, intervals.size()));
		
		Collections.sort(ans, (a, b) -> a.start - b.start);
		
		int z = 0;
		
		while(z < ans.size() - 1) {
			if(ans.get(z).start >= ans.get(z+1).start) ans.remove(z);
			else z++;
		}
		
		while(z > 0) {
			if(ans.get(z).end <= ans.get(z-1).end) {
				ans.remove(z);
				if(z == ans.size()) break;
			}
			else z--;
		}
		
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = TakeSingle.oneInt();
		int end = TakeSingle.oneInt();
		
		Interval newInterval = new Interval(start, end);
		
		int count = TakeSingle.oneInt();
		ArrayList<Interval> intervals = new ArrayList<>();
		
		for(int i = 0; i < count; i++) {
			int tempStart = TakeSingle.oneInt();
			int tempEnd = TakeSingle.oneInt();
			Interval temp = new Interval(tempStart, tempEnd);
			
			intervals.add(temp);
		}
		
		System.out.println(insert(intervals, newInterval));
	}

}
