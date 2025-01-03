package TCS.arrays;

/*

Find all the non-repeating elements for a given array. Outputs can be in any order.

Examples:

Example 1:
Input:
 Nums = [1,2,-1,1,3,1]
Output:
 2,-1,3
Explanation:
 1 is the only element in the given array which occurs thrice in the array. -1,2,3 occurs only once and hence, these are non-repeating elements of the given array.

Example 2:
Input:
 Nums = [1,2,3]
Output:
 1,2,3
Explanation:
 All elements present in the array occur once. Hence, every element is non-repeating.

*/


import java.util.ArrayList;

public class Non_repeating_elements {
	boolean value_check(ArrayList<Integer> arr, int value) {
		for(Integer i:arr) {
			if(i==value) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_all_repeating_elements f = new Find_all_repeating_elements();
		int arr[] = {1,2,-1,1,3,1};
		int n = arr.length;
		ArrayList<Integer> result = new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i!=j && arr[i]==arr[j] && !f.value_check(result, arr[i])) {
					count++;
				}
			}
			if(count==0) {
				result.add(arr[i]);
			}
			count=0;
		}
		System.out.println(result);
	}
}
