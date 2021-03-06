/**
 *   File Name: PairsOfSum.java<br>
 *
 *   Yutaka<br>
 *   Created: Aug 23, 2017
 *   
 */

package org.coding.arraysChallenge;

import java.util.TreeSet;

import edu.emory.mathcs.backport.java.util.Arrays;

/**
 * 5. How to find all pairs on integer array whose sum is equal to given number? (solution)
 * This is an intermediate level of array coding question, it's neither too easy nor too difficult. 
 * You have given an integer array and a number, you need to write a program to find all elements 
 * in the array whose sum is equal to the given number. Remember, the array may contain both positive 
 * and negative numbers, so your solution should consider that. Don't forget to write unit test though, 
 * even if the interviewer is not asked for it, that would separate you from a lot of developers. 
 * Unit testing is always expected from a professional developer.
 * 
 * Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4qeUNtS8I * 
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class PairsOfSum {
	
	public static void main(String[] args) {
		
		PairsOfSum ps = new PairsOfSum();
		
		int[] arr01 = {2, 7, 5, 1, 4, 1};
		int[] arr02 = {-2, 10, 9, 73, -2, 5, -432, 0, 1, 3, 16, 71, -2};
		int[] arr03 = {-3, -2, -2, 5, 6, 7, 1, 1, 2, 7, 8, 0, 8, 8, 5, 4, 6};
		int[] arr04 = {-3, 8, 5, 4, 10};

		int sum = 8;
		
		System.out.println("With duplicates:");
		ps.sumPairs(arr01, sum);
		ps.sumPairs(arr02, sum);
		ps.sumPairs(arr03, sum);
		ps.sumPairs(arr04, sum);
		
		System.out.println("\n\nWithout duplicates:");
		
		System.out.print((ps.sumPairsNoDup(arr01, sum).length != 0) ? "\n" + Arrays.toString(ps.sumPairsNoDup(arr01, sum)) : "\nPairs not found.");
		System.out.print((ps.sumPairsNoDup(arr02, sum).length != 0) ? "\n" + Arrays.toString(ps.sumPairsNoDup(arr02, sum)) : "\nPairs not found.");
		System.out.print((ps.sumPairsNoDup(arr03, sum).length != 0) ? "\n" + Arrays.toString(ps.sumPairsNoDup(arr03, sum)) : "\nPairs not found.");
		System.out.print((ps.sumPairsNoDup(arr04, sum).length != 0) ? "\n" + Arrays.toString(ps.sumPairsNoDup(arr04, sum)) : "\nPairs not found.");
		
	}
	
	public void sumPairs(int[] arr,  int sum) {
		int first;
		int second;
		boolean isPairs = false;
		System.out.print("Pairs are \n");
		
		for(int i = 0; i < arr.length-1; i++) {
			first = arr[i];
			for(int j = i+1; j < arr.length; j++) {
				second = arr[j];
				if(first + second == sum) {
					System.out.print(first + ", " + second + "\n");
					isPairs = true;
				}
			}
		}
		if(isPairs == false)
			System.out.print(" not found.");
	}
	
	// without duplicates and equals like 4, 4
	public Object[] sumPairsNoDup(int[] arr,  int sum) {
		TreeSet<String> ts = new TreeSet<>();
		int first;
		int second;
		String pair;
		
		for(int i = 0; i < arr.length-1; i++) {
			first = arr[i];
			for(int j = i+1; j < arr.length; j++) {
				second = arr[j];
				if((first + second == sum) && first != second) {
						ts.add(pairString(first, second));
					}
			}
		}
		return ts.toArray();
	}
	
	public String pairString(int first, int second) {
		return ((first < second) ? String.valueOf(first) + ":" + String.valueOf(second) : String.valueOf(second) + ":" + String.valueOf(first));
	}

	
}
