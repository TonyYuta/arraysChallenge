/**
 *   File Name: ReverseNumbers.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 27, 2017
 *   
 */

package org.coding.arraysChallenge;

/**
 * ReverseNumbers //ADDD (description of class)
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
public class ReverseNumbers {
	
	
	public long reverseNumberUsingStringBuffer(long num) {
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		sb.reverse();
		return Long.parseLong(sb.toString());
	}

}
