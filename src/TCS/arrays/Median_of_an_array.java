package TCS.arrays;

import java.util.Arrays;

/*

Given an unsorted array, find the median of the given array.

Examples:

Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5

*/



public class Median_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,1,7};
		Arrays.sort(arr);
		int mid=arr.length/2;
		if(arr.length%2==0) {
			double value = (arr[mid-1]+arr[mid])/2.0;
			System.out.println(value);
		}
		else {
			System.out.println(arr[mid]);
		}

	}

}
