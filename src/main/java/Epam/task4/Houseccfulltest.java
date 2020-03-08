package Epam.task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Houseccfulltest {

	@Test
	public void test() {
		Housecc test=new Housecc();
		assertEquals(13750.00 ,test.costCalculator("HIGH_STANDARD_MATERIAL", 5.5, "YES"),0);
	}

}

