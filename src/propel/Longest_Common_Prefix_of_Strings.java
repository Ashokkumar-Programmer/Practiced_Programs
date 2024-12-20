package propel;

import java.util.ArrayList;

/*
Given an array of strings arr[]. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "".

Examples :

Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
Output: "gee"
Explanation: "gee" is the longest common prefix in all the given strings.
Input: arr[] = ["hello", "world"]
Output: ""
Explanation: There's no common prefix in the given strings.
*/


public class Longest_Common_Prefix_of_Strings {

	public static void main(String[] args) {
		String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
		if(arr.length==1) {
			System.out.println(arr[0]);
			return;
		}
		int length = 0;
		String result = "";
		String arr1[] = arr[0].split("");
		ArrayList<String> sub = new ArrayList<String>();
		String s = "";
		for(int i=0;i<arr1.length;i++) {
			sub.add(arr1[i]);
			s=arr1[i];
			for(int j=i+1;j<arr1.length;j++){
				s += arr1[j];
				sub.add(s);
			}
		}
		int count=0;
		for(String temp: sub) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i].contains(temp) && temp.length()>=length) {
					length = temp.length();
					count++;
				}
			}
			if(count==arr.length) {
				result = temp;
			}
			count=0;
		}
		System.out.println(result==""?null:result);
	}

}
