package TCS.arrays;

import java.util.Arrays;

/*

Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

Examples:

Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

Example 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8

*/


public class Rearrange_array_in_increasing_decreasing_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,7,1,6,5,9};
		int n = arr.length;
		Arrays.sort(arr);
		for(int i=0;i<n/2;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=n-1;i>=n/2;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
