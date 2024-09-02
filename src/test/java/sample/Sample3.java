package sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample3 {
	@Test
	public void softAssertStrictComparsion()
	{
		String expectedData = "raja";
		String actualData = "Raja";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualData,expectedData);
		System.out.println("strict comparsion passed!!");
		sa.assertAll();
	}
	
	@Test
	public void containsLevelComparsion()
	{
		String expectedData = "raja";
		String actualData = "maharaja";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actualData.contains(expectedData));
		System.out.println("contains comparsion passed!");
		sa.assertAll();
}
}