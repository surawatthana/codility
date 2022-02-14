package com.kodcha.a12.euclidean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Euclidean {

	@Test
	void test() {
//		System.out.println(this.gcdBySubtraction(24, 9));
//		System.out.println(this.gcdByDivision(9, 24));
		System.out.println(this.binaryGCD(9, 24));
	}

	public int gcdBySubtraction(int a, int b) { // O(n);
		if (a == b) {
			return a;
		}

		if (a > b) {
			return gcdBySubtraction(a - b, b);
		} else {
			return gcdBySubtraction(a, b - a);
		}
	}

	public int gcdByDivision(int a, int b) { // O(log(a+b));
		if (a % b == 0) {
			return b;
		} else {
			return gcdByDivision(b, a % b);
		}
	}

	public int binaryGCD(int p, int q) {

		if (q == 0)
			return p;
		if (p == 0)
			return q;

		// p and q even
		if ((p & 1) == 0 && (q & 1) == 0)
			return binaryGCD(p >> 1, q >> 1) << 1;

		// p is even, q is odd
		else if ((p & 1) == 0)
			return binaryGCD(p >> 1, q);

		// p is odd, q is even
		else if ((q & 1) == 0)
			return binaryGCD(p, q >> 1);

		// p and q odd, p >= q
		else if (p >= q)
			return binaryGCD((p - q) >> 1, q);

		// p and q odd, p < q
		else
			return binaryGCD(p, (q - p) >> 1);
	}

}
