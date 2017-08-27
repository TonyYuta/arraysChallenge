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
	
	@Test(enabled = true, groups = {"reverse", "numbers", "sanity", "regression", "all"}, priority = 5)
	public void testReverseNumberUsingStringBuffer() {
		int origin = 1230506;
		int expected = 6050321;
		Assert.assertEquals(rn.reverseNumberUsingStringBuffer(origin), expected, "expecterd reverse number doesn't match to actual");
	}

}
