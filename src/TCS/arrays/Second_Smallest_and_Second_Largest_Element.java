package TCS.arrays;

import java.util.Arrays;

/*

Example 1:
Input:
 [1,2,4,7,7,5]
Output:
	Second Smallest : 2
	Second Largest : 5
Explanation:
 The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input:
 [1]
Output:
	Second Smallest : -1
	Second Largest : -1
Explanation:
 Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.

*/


public class Second_Smallest_and_Second_Largest_Element {

	public static void main(String[] args) {
		int arr[] = {1,1,2,7,7,5,5,7,8}; //1 1 2 5 7 7
		if(arr.length<2) {
			System.out.print("Arrya length is less than 2");
			return;
		}
		Arrays.sort(arr);
		int small = Integer.MIN_VALUE;
		int large = Integer.MAX_VALUE;
		int small_count = 0, large_count = 0;
		for(int i=0;i<arr.length;i++) {
			if(small_count==2) {
				continue;
			}
			for(int j=0;j<arr.length;j++) {
				if(small_count==2) {
					continue;
				}
				if(arr[i]<arr[j] && arr[i]!=small){
					small=arr[i];
					small_count++;
				}
			}
		}
		for(int i=arr.length-1;i>0;i--) {
			if(large_count==2) {
				continue;
			}
			for(int j=arr.length-1;j>0;j--) {
				if(large_count==2) {
					continue;
				}
				if(arr[i]>arr[j] && arr[i]!=large){
					large=arr[i];
					large_count++;
				}
			}
		}
		System.out.println(small);
		System.out.println(large);
	}
}
