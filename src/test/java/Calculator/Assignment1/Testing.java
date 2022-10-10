package Calculator.Assignment1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void testAddition() {
		
		// Testing addition with small numbers
		String userInput1 = "1 + 3 + 2 + 2";
		String expectedResult1 = "8";
		assertEquals("Testing addition with small numbers", expectedResult1, SimpleCalculator.evaluate(userInput1));

		// Testing addition with large numbers
		String userInput2 = "233 + 495 + 489";
		String expectedResult2 = "1217";
		assertEquals("Testing addition with large numbers", expectedResult2, SimpleCalculator.evaluate(userInput2));
		
		// Testing addition with many numbers
		String userInput3 = "1 + 3 + 6 + 8 + 2 + 5 + 1 + 6 + 9";
		String expectedResult3 = "41";
		assertEquals("Testing addition with many numbers", expectedResult3, SimpleCalculator.evaluate(userInput3));	
		
		// Testing addition with brackets
		String userInput4 = "(1 + 67 + 3)";
		String expectedResult4 = "71";
		assertEquals("Testing addition with brackets", expectedResult4, SimpleCalculator.evaluate(userInput4));
	}
	
	
	@Test
	public void testSubtraction() {
		
		//Testing subtraction with small numbers
		String userInput1 = "1 - 3 - 2 - 2";
		String expectedResult1 = "-6";
		assertEquals("Testing subtraction with small numbers", expectedResult1, SimpleCalculator.evaluate(userInput1));

		//Testing subtraction with small numbers
		String userInput2 = "(1 - 3 - 2 - 2)";
		String expectedResult2 = "-6";
		assertEquals("Testing subtraction with brackets", expectedResult1, SimpleCalculator.evaluate(userInput2));
		
		// Testing subtraction with many numbers
		String userInput3 = "24 - 3 - 6 - 8 - 2 - 5 - 1 - 6 - 9";
		String expectedResult3 = "-16";
		assertEquals("Testing subtraction with many numbers", expectedResult3, SimpleCalculator.evaluate(userInput3));
				
		// Testing subtraction with large numbers
		String userInput4 = "329 - 405 - 482";
		String expectedResult4 = "-558";
		assertEquals("Testing subtraction with large numbers", expectedResult4, SimpleCalculator.evaluate(userInput4));
	
	}
	
	@Test
	public void testMultiplication() {
		
		// Testing multiplication with small numbers
		String userInput1 = "2 * 3 * 2 * 2";
		String expectedResult1 = "24";
		assertEquals("Testing multiplication with small numbers", expectedResult1, SimpleCalculator.evaluate(userInput1));
		
		// Testing multiplication using brackets
		String userInput2 = "(1 * 24)";
		String expectedResult2 = "24";
		assertEquals("Testing multiplication using brackets", expectedResult2, SimpleCalculator.evaluate(userInput2));
		
		// Testing multiplication with many numbers
		String userInput3 = "3 * 1 * 3 * 2 * 5 * 1 * 6 * 2";
		String expectedResult3 = "1080";
		assertEquals("Testing multiplication with many numbers", expectedResult3, SimpleCalculator.evaluate(userInput3));
				
		// Testing multiplication with large numbers
		String userInput4 = "39 * 54";
		String expectedResult4 = "2106";
		assertEquals("Testing multiplication with large numbers", expectedResult4, SimpleCalculator.evaluate(userInput4));
	}
	
	@Test
	public void testMixedOperators() {
		
		// Testing mixed operators with small numbers
		String userInput1 = "1 * 3 - 2";
		String expectedResult1 = "1";
		assertEquals("Testing mixed operators with small numbers", expectedResult1, SimpleCalculator.evaluate(userInput1));
		
		// Testing mixed operators with negative numbers
		String userInput2 = "1 + (24 * 3)";
		String expectedResult2 = "73";
		assertEquals("Testing mixed operators with brackets", expectedResult2, SimpleCalculator.evaluate(userInput2));
		
		// Testing mixed operators with many numbers
		String userInput3 = "1 + 3 - 6 + 8 + 2 * 5 - 1 + 6 + 9";
		String expectedResult3 = "30";
		assertEquals("Testing mixed operators with many numbers", expectedResult3, SimpleCalculator.evaluate(userInput3));
				
		// Testing mixed operators with large numbers
		String userInput4 = "2343 - 358 + 4849";
		String expectedResult4 = "6834";
		assertEquals("Testing mixed operators with large numbers", expectedResult4, SimpleCalculator.evaluate(userInput4));
	
	}

}


