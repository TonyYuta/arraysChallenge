/**
 *   File Name: RemoveDuplicates.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 27, 2017
 *   
 */

package org.coding.arraysChallenge;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * RemoveDuplicates from int Array
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class RemoveDuplicates {

	ArrayList<Integer> al;
	public static void main(String[] args) {
		RemoveDuplicates rd = new RemoveDuplicates();
		
		int[] arr01 = {1, 2, 1, 2, 9, -1, 3, 2};
		
		System.out.println("arr01 origin: ");
		System.out.println(Arrays.toString(arr01));
		
		System.out.println("arr01 after removing duplicates: ");
		System.out.println(Arrays.toString(rd.removeDuplicates(arr01)));
	
	}
	
	public int[] removeDuplicates(int[] arr) {
		al = new ArrayList<>(); 
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[j] == arr[i]) {
					al.add(j);
				}
			}
		}
		
	for(int i = 0; i < al.size(); i++) {
		arr = ArrayUtils.removeElement(arr, al.get(i));
		}
		
		return arr;
	}
	
}
