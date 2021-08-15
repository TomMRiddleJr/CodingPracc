package heapsAndMaps;

import java.util.*;

public class LRUCache {
	private Map<Integer, Integer> map;

	public LRUCache(int capacity) {
		map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {

			@Override
			protected boolean removeEldestEntry(Map.Entry eldest) {
				return size() > capacity;
			}
		};
	}

	public int get(int key) {
		if (!map.containsKey(key))
			return -1;
		return map.get(key);
	}

	public void set(int key, int value) {
		if (!map.containsKey(key))
			map.put(key, value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache c = new LRUCache(1);

		c.set(1, 3);
		c.set(4, 2);
		c.get(5);
		c.set(5, 6);

		System.out.println(c.map);
	}

}
