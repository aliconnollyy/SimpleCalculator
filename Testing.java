import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void testAddition() {
		
		// Testing addition with small numbers
		String userInput1 = "1 + 3 + 2 + 2";
		int expectedResult1 = 8;
		assertEquals("Testing addition with small numbers", expectedResult1, SimpleCalculator.evaluate(userInput1));

		// Testing addition with large numbers
		String userInput2 = "233 + 495 + 489";
		int expectedResult2 = 1217;
		assertEquals("Testing addition with large numbers", expectedResult2, SimpleCalculator.evaluate(userInput2));
		
		// Testing addition with many numbers
		String userInput3 = "1 + 3 + 6 + 8 + 2 + 5 + 1 + 6 + 9";
		int expectedResult3 = 41;
		assertEquals("Testing addition with many numbers", expectedResult3, SimpleCalculator.evaluate(userInput3));			
	}
	
	
	@Test
	public void testSubtraction() {
		
		//Testing subtraction with small numbers
		String userInput1 = "1 - 3 - 2 - 2";
		int expectedResult1 = -6;
		assertEquals("Testing subtraction with small numbers", expectedResult1, SimpleCalculator.evaluate(userInput1));
		
		// Testing addition with negative numbers
		String userInput2 = "24 - 1";
		int expectedResult2 = 23;
		assertEquals("Testing addition with negative numbers", expectedResult2, SimpleCalculator.evaluate(userInput2));
		
		// Testing subtraction with many numbers
		String userInput3 = "24 - 3 - 6 - 8 - 2 - 5 - 1 - 6 - 9";
		int expectedResult3 = -16;
		assertEquals("Testing subtraction with many numbers", expectedResult3, SimpleCalculator.evaluate(userInput3));
				
		// Testing addition with large numbers
		String userInput4 = "329 - 405 - 482";
		int expectedResult4 = -558;
		assertEquals("Testing subtraction with large numbers", expectedResult4, SimpleCalculator.evaluate(userInput4));
	
	}
	
	@Test
	public void testMultiplication() {
		
		// Testing multiplication with small numbers
		String userInput1 = "2 * 3 * 2 * 2";
		int expectedResult1 = 24;
		assertEquals("Testing multiplication with small numbers", expectedResult1, SimpleCalculator.evaluate(userInput1));
		
		// Testing multiplication with negative numbers
		String userInput2 = "(1 * 24)";
		int expectedResult2 = 24;
		assertEquals("Testing multiplication using brackets", expectedResult2, SimpleCalculator.evaluate(userInput2));
		
		// Testing multiplication with many numbers
		String userInput3 = "3 * 1 * 3 * 2 * 5 * 1 * 6 * 2";
		int expectedResult3 = 1080;
		assertEquals("Testing multiplication with many numbers", expectedResult3, SimpleCalculator.evaluate(userInput3));
				
		// Testing multiplication with large numbers
		String userInput4 = "39 * 54";
		int expectedResult4 = 2106;
		assertEquals("Testing multiplication with large numbers", expectedResult4, SimpleCalculator.evaluate(userInput4));
	}
	
	@Test
	public void testMixedOperators() {
		
		// Testing mixed operators with small numbers
		String userInput1 = "((1 * 3) - 2)";
		int expectedResult1 = 1;
		assertEquals("Testing mixed operators with small numbers", expectedResult1, SimpleCalculator.evaluate(userInput1));
		
		// Testing mixed operators with negative numbers
		String userInput2 = "1 + 24 * 3";
		int expectedResult2 = 73;
		assertEquals("Testing mixed operators with negative numbers", expectedResult2, SimpleCalculator.evaluate(userInput2));
		
		// Testing mixed operators with many numbers
		String userInput3 = "1 + 3 - 6 + 8 + 2 * 5 - 1 + 6 + 9";
		int expectedResult3 = 30;
		assertEquals("Testing mixed operators with many numbers", expectedResult3, SimpleCalculator.evaluate(userInput3));
				
		// Testing mixed operators with large numbers
		String userInput4 = "2343 - 358 + 4849";
		int expectedResult4 = 6834;
		assertEquals("Testing mixed operators with large numbers", expectedResult4, SimpleCalculator.evaluate(userInput4));
	
	}

}
