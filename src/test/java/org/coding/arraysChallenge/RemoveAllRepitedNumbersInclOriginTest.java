/**
 *   File Name: RemoveAllRepitedNumbersInclOriginTest.java<br>
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
 * RemoveAllRepitedNumbersInclOriginTest //ADDD (description of class)
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
public class RemoveAllRepitedNumbersInclOriginTest {
	RemoveAllRepitedNumbersInclOrigin rarnio;

	@BeforeClass(alwaysRun = true)
	public void setupBeforeClass() {
		rarnio = new RemoveAllRepitedNumbersInclOrigin();
	}
	
	@Test(enabled = true, groups = {"remove", "numbers", "sanity", "bat", "regression"}, priority = 2)
	public void testRemoveDuplicates() {
		int[] arr01 = {1, 2, 2, 3, 4, 4, 2, 5, 2};
		int expected = 3;
		Assert.assertEquals(rarnio.removeDuplicates(arr01).length, expected, "Length of the Array wo duplicates doesn't match expected");
	}

}
