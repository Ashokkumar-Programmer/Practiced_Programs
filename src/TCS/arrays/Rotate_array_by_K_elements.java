package TCS.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/*

Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

Examples:

Example 1:
Input: N = 5, array[] = {1,2,3,4,5} K=2
Output: {3,4,5,1,2}
Explanation: Rotate the array to right by 2 elements.

Example 2:
Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
Output: {4,5,6,7,1,2,3}
Explanation: Rotate the array to right by 3 elements.


*/


public class Rotate_array_by_K_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int k=3;
		int result[]=new int[arr.length];
		int count = 0;
		for(int i=(arr.length-1)-k;i<arr.length;i++) {
			result[count]=arr[i];
			count++;
		}
		for(int i=0;i<k;i++) {
			result[count]=arr[i];
			count++;
		}
		System.out.print(Arrays.toString(result));
	}

}
