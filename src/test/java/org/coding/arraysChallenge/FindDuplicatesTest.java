/**
 *   File Name: FindDuplicatesTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 27, 2017
 *   
 */

package org.coding.arraysChallenge;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * FindDuplicatesTest //ADDD (description of class)
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
public class FindDuplicatesTest {
	
	FindDuplicates fd;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {		
		fd = new FindDuplicates();
		}

	@Test(enabled = true, groups = {"duplicates", "sanity", "regression"}, priority = 0) 
		public void testFindDuplicates() {
			int[] arr01 = {0,2,3,0,-2,5,6,2};
			int expected = 2;
			AssertJUnit.assertEquals(fd.duplicatesInt(arr01).size(), expected);			
		}
	
	
}
