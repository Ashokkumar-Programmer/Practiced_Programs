package TCS.arrays;

/*

Given an array that contains both negative and positive integers, find the maximum product subarray.

Examples
Example 1:
Input:

 Nums = [1,2,3,4,5,0]
Output:

 120
Explanation:

 In the given array, we can see 1×2×3×4×5 gives maximum product value.


Example 2:
Input:
 Nums = [1,2,-3,0,-4,-5]
Output:

 20
Explanation:

 In the given array, we can see (-4)×(-5) gives maximum product value.

*/


public class Maximum_Product_Subarray {
	int maxvalue(int arr[]) {
		int result = arr[0];
	    for(int i=0;i<arr.length-1;i++) {
	        int p = arr[i];
	        for(int j=i+1;j<arr.length;j++) {
	        	result = Math.max(result,p);
	            p *= arr[j];
	        }
	        result = Math.max(result,p);
	    }
	   return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximum_Product_Subarray m = new Maximum_Product_Subarray();
		int arr[] = {1,2,3,4,5,0};
		System.out.println(m.maxvalue(arr));
	}

}
