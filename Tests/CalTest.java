import static org.junit.Assert.*;

import org.junit.Test;

import com.av.junit_calc.Calculator;

public class CalTest {

	@Test
	public void calTest() {
		assertEquals("error in add()", 3, Calculator.add(1, 2));
		assertEquals("error in add()", -3, Calculator.add(-1, -2));
		assertEquals("error in add()", 9, Calculator.add(9, 0));
		
	}
	
	public void calcTestAddfail(){
		assertEquals("error in add()", 1, Calculator.add(1, 2));
	}
	
	//@Test
	public void calcTestSubPass()
	{
		assertEquals("error in sub()", -1, Calculator.sub(1, 2));
		//assertEquals("error in sub()", -3, Calculator.sub(-1, -2));
		//assertEquals("error in sub()", 1, Calculator.sub(2, 1));
	}
	//@Test
	public void calcTestSubfail(){
		assertEquals("error in sub()", 0, Calculator.sub(2, 1));
	}
	
	//@Test
	public void calcTestMulPass()
	{
		assertEquals("error in mul()", 4, Calculator.mul(2, 2));
	}
	//@Test
	public void calcTestMulfail()
	{
		assertEquals("error in mul()", 0, Calculator.mul(2, 1));
	}

}
