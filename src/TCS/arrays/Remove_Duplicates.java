package TCS.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/*

Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.

Examples
Example 1:
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3,_,_,_,_]

Explanation:
 Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Example 2:
Input:
 arr[1,1,1,2,2,3,3,3,3,4,4]

Output:
 arr[1,2,3,4,_,_,_,_,_,_,_]

Explanation:
 Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.

*/



public class Remove_Duplicates {
	boolean value_check(ArrayList<Integer> arr, int value) {
		for(int i:arr) {
			if(i==value) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Duplicates r = new Remove_Duplicates();
		int arr[] = {2,3,1,9,3,1,3,9};
		ArrayList<Integer> result = new ArrayList<Integer>();
		int count = 0;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(!r.value_check(result, arr[i])) {
				result.add(arr[i]);
			}
		}
		System.out.println(result);
	}
}
