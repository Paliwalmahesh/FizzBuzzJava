import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class FizzBuzzKataTest {
	FizzBuzz fizzbuzz=new FizzBuzz();

	@Test
	void test_of_0() {
		assertEquals("-1",fizzbuzz.Print_Fizz_Buzz(0));
	}
	@Test
	void test_of_1() {
		assertEquals("1",fizzbuzz.Print_Fizz_Buzz(1));
	}
	@Test
	void test_of_3() {
		assertEquals("12Fizz",fizzbuzz.Print_Fizz_Buzz(3));
	}

}
