package TCS.arrays;

import java.util.ArrayList;

/*

Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.

Example:
Input: N = 5, array[] = {1,2,3,4,5}
insertbeginning(6)
insertending(7)
insertatpos(8,4)
Output: 6,1,2,8,3,4,5,7
Explanation: 6 is added at the beginning and 7 is added at the end and 8 is added at position 4 

*/

public class Adding_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i : arr) {
			result.add(i);
		}
		result.addFirst(6);
		result.addLast(7);
		result.add(4 - 1, 8);
		System.out.println(result);
	}

}
