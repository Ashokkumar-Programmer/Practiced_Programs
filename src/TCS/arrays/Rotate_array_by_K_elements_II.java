package TCS.arrays;

/*

Given an array of integers, rotating array of elements by k elements either left or right.

Examples:

Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
Output: 9 10 11 3 7 8
Explanation: Array is rotated to right by 3 position.

*/


public class Rotate_array_by_K_elements_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,7,8,9,10,11};
		int k = 3;
		String position = "left";
		if(position=="right") {
			for(int i=arr.length-k;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			for(int i=0;i<arr.length-k;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		else {
			for(int i=arr.length-k;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			for(int i=0;i<arr.length-k;i++) {
				System.out.print(arr[i]+" ");
			}
			
		}
	}

}
