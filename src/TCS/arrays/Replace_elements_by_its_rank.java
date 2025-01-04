package TCS.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*

Given an array of N integers, the task is to replace each element of the array by its rank in the array.

Examples:

Example 1:
Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2
Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…

Example 2:
Input: 1 5 8 15 8 25 9
Output: 1 2 3 5 3 6 4
Explanation: When sorted,the array is 1,5,8,8,9,15,25. So the rank of 1 is 1,rank of 5 is 2,rank of 8 is 3 and so…

*/

public class Replace_elements_by_its_rank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 5, 8, 15, 8, 25, 9};
        int copy[] = arr.clone();
        Arrays.sort(copy);

        Map<Integer, Integer> result = new HashMap<>();
        int rank = 1;
        
        for (int value : copy) {
            if (!result.containsKey(value)) {
                result.put(value, rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = result.get(arr[i]);
        }
		
        for(int i: arr) {
        	System.out.print(i+" ");
        }
	}

}
