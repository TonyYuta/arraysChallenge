/**
 *   File Name: RemoveAllRepitedNumbersInclOrigin.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 26, 2017
 *   
 */

package org.coding.arraysChallenge;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;



/**
 * RemoveAllRepitedNumbersInclOrigin //ADDD (description of class)
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
public class RemoveAllRepitedNumbersInclOrigin {
		
	ArrayList<Integer> al;
	
	public static void main(String[] args) {
		RemoveAllRepitedNumbersInclOrigin rd = new RemoveAllRepitedNumbersInclOrigin();
		int[] arr01 = {1, 2, 2, 3, 4, 4, 2, 5, 2};
		System.out.println("arr01 before removing duplicates: " + Arrays.toString(arr01));
		System.out.println("arr01  after removing duplicates: " + Arrays.toString(rd.removeDuplicates(arr01)));

	}
	
	public int[] removeDuplicates(int[] arr) {

		al = new ArrayList<>();

		for(int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j<arr.length; j++) {
				if(arr[j] == arr[i]) {
					al.add(arr[i]);
					al.add(arr[j]);
				}
			}
		}
				
		for (int i = 0; i < al.size(); i++) {
			// remove element
			arr = ArrayUtils.removeElement(arr, al.get(i));
		}	
				
		return arr;		
	}
	
	public void printArray(int[] arr) {
		System.out.println("arr01 after removing duplicates:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
