package com.kodcha.a10.primeAndCompositeNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Primality {

	@Test
	void test() {
		System.out.println(this.primality(5));
	}

	public boolean primality(int n) {
		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}

		return true;
	}

}
