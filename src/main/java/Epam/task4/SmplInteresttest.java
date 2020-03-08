package Epam.task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmplInteresttest {

	@Test
	public void test() {
		SmplInterest test = new SmplInterest();
		double simpleinterestcalculatingoutput=test.SimpleInterestCalculator(100, 5, 10);
		assertEquals(50.0,simpleinterestcalculatingoutput,0);
	}

}
