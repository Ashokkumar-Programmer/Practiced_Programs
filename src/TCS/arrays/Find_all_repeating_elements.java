package TCS.arrays;

import java.util.ArrayList;

/*

Find all the repeating elements present in an array.

Examples:

Example 1:
Input: 
Arr[] = [1,1,2,3,4,4,5,2]
Output:
 1,2,4
Explanation:
 1,2 and 4 are the elements which are occurring more than once.

Example 2:
Input:
 Arr[] = [1,1,0]
Output:
 1
Explanation:
 Only 1 is occurring more than once in the given array.

*/

public class Find_all_repeating_elements {
	boolean value_check(ArrayList<Integer> arr, int value) {
		for(Integer i:arr) {
			if(i==value) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_all_repeating_elements f = new Find_all_repeating_elements();
		int arr[] = { 1, 1, 2, 3, 4, 4, 5, 2 };
		int n = arr.length;
		ArrayList<Integer> result = new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j && arr[i]==arr[j] && !f.value_check(result, arr[i])) {
					count++;
				}
			}
			if(count>0) {
				result.add(arr[i]);
			}
			count=0;
		}
		System.out.println(result);
	}
}
