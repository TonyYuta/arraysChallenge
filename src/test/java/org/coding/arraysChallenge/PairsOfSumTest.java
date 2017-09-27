/**
 *   File Name: PairsOfSumTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 27, 2017
 *   
 */

package org.coding.arraysChallenge;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * PairsOfSumTest //ADDD (description of class)
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
public class PairsOfSumTest {

	PairsOfSum pos;
	
	@BeforeClass(alwaysRun = true)
		public void setUpClass() {
		pos = new PairsOfSum();
	}
	
	@Test(enabled = true, groups = {"duplicates", "pairs", "sanity", "regression"}, priority = 0)
	public void testSumPairs() {
		int[] arr01 = {2, 2, 3, 1, 6, 2, 4, 5, 0, 5, -10};
		String[] expected = {"0:4", "1:3"};
		int sum = 4;
		System.out.println(Arrays.toString(pos.sumPairsNoDup(arr01, sum)));
		Assert.assertEquals(pos.sumPairsNoDup(arr01, sum), expected, "Qty pairs doesn't match to expected");
	}
	
}
