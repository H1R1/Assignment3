package source;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcTest extends TestCase {

	Calc calc;
	int number1;
	int number2;

	@Before
	protected void setUp() throws Exception {
		number1 = 20;
		number2 = 10;
		calc = new Calc();
		CalcMethods mockObj = mock(CalcMethods.class);
		when(mockObj.add(number1, number2)).thenReturn(number1 + number2);
		when(mockObj.subtract(number1, number2)).thenReturn(number1 - number2);
		when(mockObj.multiply(number1, number2)).thenReturn(number1 * number2);
		when(mockObj.divide(number1, number2)).thenReturn((double)number1 / (double)number2);

		calc.setCalcMeth(mockObj);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddition() {
		assertEquals(30, calc.addition(number1, number2));
	}

	@Test
	public void testSubtraction() {
		assertEquals(10, calc.subtraction(number1, number2));
	}

	@Test
	public void testMultiply() {
		assertEquals(200, calc.multiply(number1, number2));
	}

	@Test
	public void testDivision() {
		assertEquals(2.0, calc.division(number1, number2));
	}
	 
}
