package com.kodcha.a03.timecomplexity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FrogJump {
	@Test
	public void case1() {
		assertEquals(3, new FrogJump().solution(10, 85, 30));
	}

	public int solution(int X, int Y, int D) {
		return (X < Y) ? (Y - X) / D + ((Y - X) % D > 0 ? 1 : 0) : 0;
	}
}
