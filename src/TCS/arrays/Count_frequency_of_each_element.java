package TCS.arrays;

/*

Given an array, we have found the number of occurrences of each element in the array.

Examples:

Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	 5  2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
	3  1
        4  2
Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array

*/
import java.util.*;
public class Count_frequency_of_each_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,3,4,4,2};
		Map<Integer, Integer> result = new HashMap<>();
		int count = 1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && !result.containsKey(arr[i])) {
					count++;
				}
			}
			if(!result.containsKey(arr[i])) {
				result.put(arr[i], count);
			}
			count=1;
		}
		for (Integer variableName : result.keySet())
        {
            Integer variableKey = variableName;
            Integer variableValue = result.get(variableName);
            System.out.print(variableKey+"  ");
            System.out.println(variableValue);
        }
	}

}
