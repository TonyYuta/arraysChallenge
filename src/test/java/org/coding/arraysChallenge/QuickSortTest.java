/**
 *   File Name: QuickSortTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 29, 2017
 *   
 */

package org.coding.arraysChallenge;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * QuickSortTest //ADDD (description of class)
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
public class QuickSortTest {
	
	QuickSortTest qst;
	
	@BeforeClass(alwaysRun = true)
	public void setUpQuickSortTest() {
		qst = new QuickSortTest();
	}
	
	//@Test(enabled = false)
	@Test(enabled = true, groups = {"sort", "quicksort", "bat", "regression"}, dataProvider = "sortArray", priority = 6)
	public void testQuickSort() {
		
	}

}
