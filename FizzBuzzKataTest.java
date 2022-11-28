import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class FizzBuzzKataTest {
	FizzBuzz fizzbuzz=new FizzBuzz();

	@Test
	void verify_invalid_input() {
		assertEquals("-1",fizzbuzz.Print_Fizz_Buzz(0));
	}
	@Test
	void test_of_1() {
		assertEquals("1",fizzbuzz.Print_Fizz_Buzz(1));
	}
	@Test
	void checking_multiple_3() {
		assertEquals("12Fizz",fizzbuzz.Print_Fizz_Buzz(3));
	}
	@Test
	void checking_multiple_5() {
		assertEquals("12Fizz4Buzz",fizzbuzz.Print_Fizz_Buzz(5));
	}
}
