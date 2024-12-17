package TCS.arrays;

import java.util.Arrays;

/*

Problem Statement: Given an array, we have to find the smallest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.

*/


public class smallest_element {

	public static void main(String[] args) {
		int arr[]= {8,10,5,7,9};
		Arrays.sort(arr);
		System.out.print(arr[0]);

	}

}
