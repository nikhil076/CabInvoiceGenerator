package CabInvoiceGenenrator;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {

	@Test
	public void givenDistanceAndTime_ReturnTotalFare() {
		CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
		double distance = 5.0;
		int time = 9;
		double fare = cabInvoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(59, fare, 0.0);
	}
}
