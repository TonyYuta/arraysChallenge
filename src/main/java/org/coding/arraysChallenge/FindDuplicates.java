/**
 *   File Name: FindDuplicates.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 24, 2017
 *   
 */

package org.coding.arraysChallenge;

import java.util.TreeSet;

/**
 * FindDuplicates //ADDD (description of class)
 * 6.   How to find repeated numbers in an array if it contains multiple duplicates? (solution)
 * This is actually the follow-up question of problem 2, how to find a duplicate number on integer array. 
 * In that case, an array contains only one duplicate but what if it contains multiple duplicates? S
 * uppose, an array contains n numbers ranging from 0 to n-1 and there are 5 duplicates on it, how do you find it? 
 * You can use the approach, we have learned in similar String based problem of finding repeated characters in given String.
 * 
 * Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4qgzrWRE1
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class FindDuplicates {

	TreeSet<Integer> ts;
	
	public static void main(String[] args) {
		FindDuplicates dup = new FindDuplicates();

		int[] arr01 = {2, 4, 6, 4, -1, 0, 8, 6, 4, 2, 0, -3, 2, 4, 0, -1};
		int[] arr02 = {3, 5, 6, 7, 8, 9};
		
		System.out.println((dup.duplicatesInt(arr01).size() > 0) ? "FindDuplicates in arr01: " + dup.duplicatesInt(arr01) : "There are no duplicates in arr01");
		System.out.println((dup.duplicatesInt(arr02).size() > 0) ? "FindDuplicates in arr01: " + dup.duplicatesInt(arr02) : "There are no duplicates in arr02");
	}
	
	public TreeSet<Integer> duplicatesInt(int[] arr) {
		ts = new TreeSet<>();
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					ts.add(arr[j]);
				}
			}
		}	
		return ts;
	}
	
}
