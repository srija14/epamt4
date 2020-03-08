package Epam.task4;
import static org.junit.Assert.*;

import org.junit.Test;

public class CmpndInteresttest {

	@Test
	public void test() {
		CmpndInterest test = new CmpndInterest();
		double compoundinterestcalcullatingouput=test.CompoundInterestCalculator(1200, 2, 5.4);
		assertEquals(1333.0992,compoundinterestcalcullatingouput,0);
	}

}

