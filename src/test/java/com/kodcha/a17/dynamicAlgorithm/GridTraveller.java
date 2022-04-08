package com.kodcha.a17.dynamicAlgorithm;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class GridTraveller {

	@Test
	void test() {
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("0,0", 0L);
		map.put("1,1", 1L);
		for (int i = 1; i <= 34; i++) {
			System.out.println(i + "x" + i + "=\t" + gridTravel(i, i, map));
		}
	}

	public long gridTravel(int rows, int columns, Map<String, Long> map) {
		if (map.containsKey(rows+","+columns)) {
			return map.get(rows+","+columns );
		}
		
		if (rows == 0 || columns == 0) {
			if (map.containsKey(rows+","+columns)) {
				return map.get(rows+","+columns);
			}
			map.put(rows+","+columns, 0L);
			map.put(columns+","+rows, 0L);
			return 0;
		}

		Long travelDown = 0L;
		Long travelright = 0L;

		if (map.containsKey(rows - 1+","+columns)) {
			travelDown = map.get(rows - 1+","+columns );
		} else {
			travelDown = gridTravel(rows - 1, columns, map);
			map.put((rows - 1)+","+columns, travelDown);
			map.put(columns+","+(rows - 1), travelDown);
		}
		
		if (map.containsKey( rows+","+(columns - 1))) {
			travelright = map.get(rows+","+(columns-1));
		} else {
			travelright = gridTravel(rows, columns - 1, map);
			map.put(rows+","+(columns- 1 ), travelright);
			map.put((columns- 1)+","+ rows, travelright);
		}

		return travelDown + travelright;
	}
}
