/**
 *   File Name: RemoveDuplicatesTest.java<br>
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
 * RemoveDuplicatesTest //ADDD (description of class)
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
public class RemoveDuplicatesTest {
	RemoveDuplicates rd;
	
	@BeforeClass(alwaysRun = true)
	public void setUpRemoveDuplicatesTest() {
		rd = new RemoveDuplicates();
	}
	
	@Test(enabled = true, groups = {"duplicates", "all"}, priority = 4)
	public void testRemoveDuplicates() {
		int[] arr01 = {1, 2, 1, 2, 9, -1, 3, 2};
		int expected = 3;
		Assert.assertEquals(rd.removeDuplicates(arr01).length, expected, "array.length doesn't match to expected after remove duplicates");
	}

}
