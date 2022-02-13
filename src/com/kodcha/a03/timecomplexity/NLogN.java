package com.kodcha.a03.timecomplexity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NLogN {

	@Test
	void test() {
		this.nLogn(4);
	}

	public void nLogn(int n) {
		int y = n;
		while (n> 1) {
			n = Math.floorDiv(n, 2);
			for (int i = 1; i<=y; i++) {
				System.out.println(i);
			}
		}
	}
}
