/**
 *   File Name: RepitedTwiceExceptOneTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Sep 24, 2017
 *   
 */

package org.coding.arraysChallenge;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * RepitedTwiceExceptOneTest //ADDD (description of class)
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
public class RepitedTwiceExceptOneTest {
	RepitedTwiceExceptOne rt = new RepitedTwiceExceptOne();
	
	@Test(enabled = true, groups = {"collections", "numbers", "bat", "regression"}, priority = 1)
	public void testRepitedTwiceExceptOne() {
		int[] origin = {1, 2, 3, 5, 3, 1, 5};
		int expected = 2;
		Assert.assertEquals(rt.noRepeatedInt(origin), expected, "result of not repeted element doesn't match expected");
	}
}
