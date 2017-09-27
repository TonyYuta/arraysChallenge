/**
 *   File Name: ArraysMiscellaceous.java<br>
 *
 *   Yutaka<br>
 *   Created: Sep 23, 2017
 *   
 */

package org.coding.arraysChallenge;

import java.util.Arrays;

/**
 * ArraysMiscellaceous //ADDD (description of class)
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
public class ArraysMiscellaceous {
		
	
	public static void main(String[] args) {
		ArraysMiscellaceous am = new ArraysMiscellaceous();
		
		int[] arr1 = new int[3];
//		arr1[0] = 10;
//		arr1[1] = 20;
//		arr1[2] = 30;		
		
		System.out.println("Arrays.toString(arr1): "  + Arrays.toString(arr1));
		System.out.println("arr1.length: " + arr1.length);
		System.out.println("arr1[arr1.length-1]: " + arr1[arr1.length-1]);
		System.out.println("arr1: " + Arrays.toString(arr1));
		
	}
	
	protected void printOutArray(int[] arr) {
		System.out.println(Arrays.toString(arr));	
	}

}
