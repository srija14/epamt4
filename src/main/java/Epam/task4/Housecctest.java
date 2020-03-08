package Epam.task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Housecctest {

	@Test
	public void test() {
		Housecc test=new Housecc();
		assertEquals(8250.00 ,test.costCalculator("ABOVE_STANDARD_MATERIAL", 5.5, "NO"),0);
	}

}
