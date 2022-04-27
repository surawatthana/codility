package algoexpert.array.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class TournamentWinner {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public String solve (List<List<String>> competitions, List<Integer> results) {
		
		int max = -1;
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < competitions.size(); i++) {
			String homeTeam = competitions.get(i).get(0);
			String awayTeam = competitions.get(i).get(1);
			
			if(results.get(i) == 1) {
				extracted(map, homeTeam);
			} else {
				extracted(map, awayTeam);
			}
		}
		
		for (Map.Entry<String, Integer> entry: map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
			}
		}
		
		for (Map.Entry<String, Integer> entry: map.entrySet()) {
			if (entry.getValue() == max) {
				return entry.getKey();
			}
		}
		
		
		
		return "";
	}

	private void extracted(Map<String, Integer> map, String homeTeam) {
		if (map.containsKey(homeTeam) ) {
			map.put(homeTeam, map.get(homeTeam) + 3);
		} else {
			map.put(homeTeam, 3);
		}
	}

}
