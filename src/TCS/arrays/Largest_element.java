package TCS.arrays;

import java.util.Arrays;

/*

Example 1:
Input:
 arr[] = {2,5,1,3,0};
Output:
 5
Explanation:
 5 is the largest element in the array. 

Example2:
Input:
 arr[] = {8,10,5,7,9};
Output:
 10
Explanation:
 10 is the largest element in the array. 

*/


public class Largest_element {

	public static void main(String[] args) {
		int arr[] = {8,10,5,7,9};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);

	}

}
