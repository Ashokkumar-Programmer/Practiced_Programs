package TCS.arrays;

import java.util.Arrays;
import java.util.LinkedList;

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
	boolean check(int arr[], int value) {
		for(int i: arr) {
			if(i==value) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort_an_array_according_to_the_order_defined_by_another_array s = new Sort_an_array_according_to_the_order_defined_by_another_array();
		int arr1[] = {9, 1, 4, 1, 3, 7, 8, 2};
		int arr2[] = {3, 9, 2, 4};
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i: arr2) {
			list.add(i);
		}
		for(int i: arr1) {
			if(!s.check(arr2, i)) {
				list.add(i);
			}
		}
		System.out.println(list);
	}
}
