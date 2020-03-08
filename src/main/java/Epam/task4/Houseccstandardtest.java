package Epam.task4;
import static org.junit.Assert.*;

import org.junit.Test;

public class Houseccstandardtest {

	@Test
	public void test() {
		Housecc test=new Housecc();
		assertEquals(6600.00 ,test.costCalculator("YES", 5.5, "NO"),0);
	}

}