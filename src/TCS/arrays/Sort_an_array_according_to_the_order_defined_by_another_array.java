package TCS.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*

You are given two arrays, arr1 and arr2. Your task is to sort the elements of arr1 in such a way that the relative order of the elements matches the order specified in arr2.

Elements of arr1 that are not present in arr2 should appear at the end of the sorted array, sorted in ascending order.
Input:
arr1: An array of integers that needs to be sorted.
arr2: An array of integers defining the desired order.
Output:
A new array that represents the sorted version of arr1 according to arr2.
Constraints:
arr2 will have unique elements and may not contain all the elements of arr1.
arr1 can have duplicates.
Example 1:
Input:

arr1: [5, 3, 1, 4, 2, 9, 7, 6]
arr2: [4, 3, 1, 2]
Output:

[4, 3, 1, 2, 5, 6, 7, 9]
Example 2:
Input:

arr1: [9, 1, 4, 1, 3, 7, 8, 2]
arr2: [3, 9, 2, 4]
Output:

[3, 9, 2, 4, 1, 1, 7, 8]

*/

public class Sort_an_array_according_to_the_order_defined_by_another_array {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {9, 1, 4, 1, 3, 7, 8, 2};
		int arr2[] = {3, 9, 2, 4};
		Set<Integer> set1 = new HashSet<Integer>();
		for(int i: arr1) {
			set1.add(i);
		}
		for(int i: arr2) {
			set1.add(i);
		}
		int result[] = new int[set1.size()];
		int index=0;
		for(int i: set1) {
			result[index] = i;
			index++;
		}
		System.out.println(Arrays.toString(result));
	}

}