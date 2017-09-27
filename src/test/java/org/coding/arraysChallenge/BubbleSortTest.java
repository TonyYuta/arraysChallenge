/**
 *   File Name: BubbleSortTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Sep 23, 2017
 *   
 */

package org.coding.arraysChallenge;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * BubbleSortTest //ADDD (description of class)
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
public class BubbleSortTest {

	BubbleSort bs = new BubbleSort();
	
	int[] arr1     = {3, 4, 7, 0, 7, 1, 8, 2, 0, 7};
	int[] expected = {0, 0, 1, 2, 3, 4, 7, 7, 7, 8};
	
	@Test(enabled = true, groups = {"sort", "bubblesort", "bat", "regression"})
	public void testBubbleSort() {
	Assert.assertEquals(bs.bubbleSort(arr1), expected, "Sorted array doesn't match to expected");
	}
}
