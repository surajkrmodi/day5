package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator c = init();
		int result = c.add(2, 3); // Act
		assertEquals(5, result);// Assert
	}

	@Test
	public void testSubtract() {
		Calculator c = init();
		int result = c.subtract(2, 3); // Act
		assertEquals(-1, result);// Assert
	}
	@Test
	public void testSubtractif() {
		Calculator c = init();
		int result = c.subtract(-2, 3); // Act
		assertEquals(-5, result);// Assert
	}
	@Test
	public void divide() {
		Calculator c = init();
		int result = c.divide(3, 3); // Act
		assertEquals(1, result);// Assert
	}
	/**
	 * 
	 */
	
	@Test(expected = ArithmeticException.class)
	public void dividebyzero() {
		Calculator c = init();
		 c.divide(3, 0); // Act
		
	}

	private Calculator init() {
		Calculator c = new Calculator();// Arrange
		return c;
	}

}
