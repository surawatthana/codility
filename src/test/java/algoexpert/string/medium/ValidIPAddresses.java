package algoexpert.string.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;

class ValidIPAddresses {

	@Test
	void test01() {
		List<String> expected = Arrays.asList("1.9.216.80", "1.92.16.80", "1.92.168.0", "19.2.16.80", "19.2.168.0", "19.21.6.80",
				"19.21.68.0", "19.216.8.0", "192.1.6.80", "192.1.68.0", "192.16.8.0" );
		
		assertEquals(expected, new ValidIPAddresses().validIPAddresses("1921680"));
	}
	
	@Test
	void test30() {
		List<String> expected = Arrays.asList("9.7.4.3"  );
		
		assertEquals(expected, new ValidIPAddresses().validIPAddresses("9743"));
	}
	
	@Test
	void test06() {
		List<String> expected = Arrays.asList("255.255.255.255"  );
		
		assertEquals(expected, new ValidIPAddresses().validIPAddresses("255255255255"));
	}
	
	@Test
	void test07() {
		List<String> expected = new ArrayList<>();
		
		assertEquals(expected, new ValidIPAddresses().validIPAddresses("255255255256"));
	}
	
	@Test
	void test16() {
		List<String> expected = new ArrayList<>();
		
		assertEquals(expected, new ValidIPAddresses().validIPAddresses("00001"));
	}
	

	public List<String> validIPAddresses(String inputString) {
		List<String> result = new ArrayList<>();

		if (inputString.length() < 4 || inputString.length() > 12) {
			return (ArrayList<String>) result;
		}

		String[] validIpArray = new String[4];

		for (int i = 0; i < 3; i++) {
			String firstDigit = inputString.substring(0, i + 1);
			if (isValidPart(firstDigit)) {
				validIpArray[0] = firstDigit;
				String inputForSecondDigit = inputString.substring(i + 1, inputString.length());

				LEVEL2: for (int j = 0; j < 3; j++) {
					if (inputForSecondDigit.length() < 3 || inputForSecondDigit.length() > 9) {
						break LEVEL2;
					}
					String secondDigit = inputForSecondDigit.substring(0, j + 1);
					if (isValidPart(secondDigit)) {
						validIpArray[1] = secondDigit;
						String inputForThirdDigit = inputForSecondDigit.substring(j + 1, inputForSecondDigit.length());

						int kLimit = inputForThirdDigit.length() >= 3 ? 3 : inputForThirdDigit.length();
						LEVEL3: for (int k = 0; k < kLimit; k++) {
							if (inputForThirdDigit.length() < 2 || inputForThirdDigit.length() > 6) {
								break LEVEL3;
							}
							String thirdDigit = inputForThirdDigit.substring(0, k + 1);
							if (isValidPart(thirdDigit)) {
								validIpArray[2] = thirdDigit;
								String inputForFourthDigit = inputForThirdDigit.substring(k + 1,
										inputForThirdDigit.length());

								if (inputForFourthDigit.length() > 0 && inputForFourthDigit.length() <= 3) {
									if (isValidPart(inputForFourthDigit)) {
										validIpArray[3] = inputForFourthDigit;
										result.add(validIpArray[0] + "." + validIpArray[1] + "." + validIpArray[2] + "."
												+ validIpArray[3]);
									}
								}
							}
						}
					}
				}
			}
		}

		return (ArrayList<String>) result;
	}

	private boolean isValidPart(String ipPart) {

		if (ipPart.startsWith("0") && ipPart.length() > 1) {
			return false;
		}

		if (ipPart.length() < 1 || ipPart.length() > 3) {
			return false;
		}

		if (Integer.valueOf(ipPart) > 255) {
			return false;
		}

		return true;
	}
}
