/**
 *   File Name: BubbleSort.java<br>
 *
 *   Yutaka<br>
 *   Created: Sep 23, 2017
 *   
 */

package org.coding.arraysChallenge;

/**
 * BubbleSort //ADDD (description of class)
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
public class BubbleSort {
	
	protected int[] bubbleSort(int[] arr) {
		int i;
		int temp;
		boolean swapped = true;
		while(swapped) {
			swapped = false;
			for (i=0; i < arr.length-1; i++) {
				if (arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swapped = true;
				}
			}
		}
		return arr;
	}

}
