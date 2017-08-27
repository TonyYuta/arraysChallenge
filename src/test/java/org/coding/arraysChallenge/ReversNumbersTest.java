/**
 *   File Name: ReversNumbersTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 27, 2017
 *   
 */

package org.coding.arraysChallenge;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * ReversNumbersTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class ReversNumbersTest {
	
	ReversNumbers rn;
	
	@BeforeClass(alwaysRun = true)
	public void setUpReversNumbersTest() {
		rn = new ReversNumbers();
	}
	
	@DataProvider(name = "numbers")
	public static Object[][] numbers() {
		return new Object[][] {
			{12345, 54321},
			{112, 211},
			{11345, 54311},
			{11345, 54311},
			{11345, 54311},
			{11345, 54311},
			{110022, 220011},
			{11345, 54311},
			{11345, 54311},
			{2010101, 1010102},
			{11345, 54311},
			{12349, 94321},
		};
	}
	
	@Test(enabled = true, groups = {"reverse", "numbers", "sanity", "regression", "all"}, priority = 5)
	public void testReverseNumberUsingStringBuffer() {
		int origin = 1230506;
		int expected = 6050321;
		Assert.assertEquals(rn.reverseNumberUsingStringBuffer(origin), expected, "expecterd reverse number doesn't match to actual");
	}
	
	@Test(enabled = true, timeOut = 1000, dataProvider = "numbers", groups = {"reverse", "numbers", "sanity", "regression", "all"}, priority = 5)
	public void testReverseNumberUsingStringBufferDataProvider(int origin, int expected) {
		Assert.assertEquals(rn.reverseNumberUsingStringBuffer(origin), expected);
	}
	

	

}
