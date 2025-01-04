package TCS.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*

Given an array of integers, having some duplicate elements, sort the array by frequency.

Examples:

Example 1:
Input: N = 8, array[] = {1,2,3,2,4,3,1,2}
Output: 2 2 2 1 1 3 3 4 
Explanation: Since  2 is present 3 times in an array , so print it 3 times ,then print ‘1’ 2 times and then ‘3’ 2 times and 4 has least frequency, it will be printed at last.

Example 2:
Input: N = 6, array[] = {-199,6,7,-199,3,5}
Output: -199 -199 3 5 6 7
Explanation: Since -199 is present 2 times so it will be printed at first , then 3 , 5 ,6 ,7 are present once in array , so print them in their sorted order.

*/

public class Sort_Elements_of_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 2, 4, 3, 1, 2};
		Arrays.sort(arr); // Sort the array
		Set<Integer> unique = new HashSet<>();

		for (int i : arr) {
		    unique.add(i);
		}

		int twoD[][] = new int[unique.size()][2];
		int index = 0;

		for (int i : unique) {
		    int count = 0;
		    for (int j = 0; j < arr.length; j++) {
		        if (i == arr[j]) {
		            count++;
		        }
		    }
		    twoD[index][0] = i;
		    twoD[index][1] = count;
		    index++;
		}
		Arrays.sort(twoD, (a,b)->Integer.compare(b[1], a[1]));
		for(int i=0;i<twoD.length;i++) {
			for(int j=0;j<twoD[i][1];j++) {
				System.out.print(twoD[i][0]+" ");
			}
		}
	}

}
