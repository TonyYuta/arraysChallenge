/**
 *   File Name: RepitedTwiceExceptOne.java<br>
 *
 *   Yutaka<br>
 *   Created: Sep 23, 2017
 *   
 */

package org.coding.arraysChallenge;

import java.util.HashSet;
import java.util.Iterator;

/**
 * RepitedTwiceExceptOne //ADDD (description of class)
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
public class RepitedTwiceExceptOne {
	
	HashSet<Integer> hs;
	long sumHS;
	long sumOrigin;
	
	protected int noRepeatedInt(int[] arr) {
		hs = new HashSet<>();	
		
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
			sumOrigin += arr[i];
		}		
		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			sumHS += it.next();
		}
		
		System.out.println("HashSet:");
		Iterator<Integer> iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("sumOrigin: " + sumOrigin);
		System.out.println("sumHS:     " + sumHS);
		System.out.println("sumHS*2:   " + sumHS*2);
		
		return (int) (sumHS*2 - sumOrigin);
	}

}
