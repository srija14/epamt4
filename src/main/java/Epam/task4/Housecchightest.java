package Epam.task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Housecchightest {

	@Test
	public void test() {
		Housecc test=new Housecc();
		assertEquals(9900.00 ,test.costCalculator("HIGH_STANDARD_MATERIAL", 5.5, "NO"),0);
	}

}

