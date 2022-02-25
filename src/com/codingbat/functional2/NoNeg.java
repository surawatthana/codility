package com.codingbat.functional2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class NoNeg {

	@Test
	void test() {
		
//		assertEquals(Arrays.asList("ay", "by", "cy"), this.noYY(Arrays.asList("a", "b", "c"))); 
//		assertEquals(Arrays.asList("yyxy", "zzzy"), this.word0(new String[]{"a", "b"}));
		this.word0(new String[]{"a", "bb", "a", "bb"});
		

		
	}
	
	public List<Integer> rightDigit(List<Integer> nums) {
		return nums.stream().map(a -> a%10).collect(Collectors.toList());
	}
	
	public List<String> addStar(List<String> strings) {
		return strings.stream().map(a -> a.replace("x", "")).collect(Collectors.toList());
	}
	
	public Map<String, Integer> word0(String[] strings) {
//		Map<String, Long> myMap = Arrays.asList(strings).stream().collect(Collectors.groupingBy(Function.identity(), Function.identity().andThen(a -> Long.valueOf(a .toString().length()))));
//		
//		Map<String, Integer> result = new HashMap<>();
//		
//		myMap.forEach(  (String key, Long value) ->
//			result.put(key, 0)
//		);
//		
//		return result;
//		
//	}
		return null;}

}
