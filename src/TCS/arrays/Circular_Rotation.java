package TCS.arrays;

import java.util.Arrays;

/*

You are given an array of integers and a number K. Your task is to rotate the array to the right by K positions in a circular manner.

Definition of Circular Rotation:

In a circular rotation, the elements that get shifted past the end of the array wrap around to the beginning.
For example, rotating an array [1, 2, 3, 4, 5] by 2 positions to the right results in [4, 5, 1, 2, 3].
Input:
An array of integers.
A non-negative integer K, representing the number of positions to rotate the array.
Output:
The array after rotating it K positions to the right in a circular manner.
Example 1:
Input:

Array: [1, 2, 3, 4, 5]
K: 2
Output:

Rotated Array: [4, 5, 1, 2, 3]
Example 2:
Input:

Array: [10, 20, 30, 40, 50]
K: 3
Output:

Rotated Array: [30, 40, 50, 10, 20]

*/


public class Circular_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30, 40, 50};
		int k = 3, index = 0;;
		int result[] = new int[arr.length];
		for(int i=arr.length-k;i<arr.length;i++) {
			result[index] = arr[i];
			index++;
		}
		k=arr.length-k;
		for(int i=0;i<k;i++) {
			result[index] = arr[i];
			index++;
		}
		System.out.println(Arrays.toString(result));
	}
}
