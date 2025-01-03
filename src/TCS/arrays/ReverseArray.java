package TCS.arrays;

import java.util.Arrays;

/*

You are given an array. The task is to reverse the array and print it. 

Examples:

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

*/


public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40};
		int rev[]=new int[arr.length];
		int count=0;
		for(int i=arr.length-1;i>=0;i--) {
			rev[count] = arr[i];
			count++;
		}
		System.out.println(Arrays.toString(rev));

	}

}
