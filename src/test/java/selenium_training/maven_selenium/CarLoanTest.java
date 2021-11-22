package selenium_training.maven_selenium;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoanTest {
	@BeforeTest
	public void selectCar()
	{
		System.out.println("Car is selected -> Hyndai Creta");
	}
	@Test(priority=1)
	public void selectBank()
	{
		System.out.println("Bank selected for loan->SBI");
	}
	@Test
	public void rateOfInterest()
	{
		System.out.println("Rate of interest is 9.09% per annum");
	}
	@AfterTest
	public void carBought()
	{
		System.out.println("Car bought successfully");
	}

}
