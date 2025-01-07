package string_problems;

import java.util.Arrays;

/*

Given two strings, str1 and str2, the task is to determine if str2 can be obtained by rotating str1 exactly 2 places in either a clockwise or anticlockwise direction.

Examples: 

Input: str1 = “amazon”, str2 = “azonam” 
Output: Yes 
Explanation: Rotating string1 by 2 places in anti-clockwise gives the string2.


Input: str1 = “amazon”, str2 = “onamaz” 
Output: Yes 
Explanation: Rotating string1 by 2 places in clockwise gives the string2.

*/

public class Rotating_another_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "amazon", str2 = "azonam";
		int count = 1;
		String temp1[] = new String[str1.length()-1], temp2[] = new String[str1.length()-1];
		String t1 = "";
		for(int i=0;i<count;i++) {
			if(count<str1.length()-1) {
				count++;
			}
			t1 += str1.charAt(i);
			temp1[i] = t1;
		}
		t1="";
		count=1;
		for (int i = 0; count < str1.length(); i++) {
			if(count!=str1.length()) {
				temp2[i] = str1.substring(count, str1.length());
				count++;
			}
		}
		for(int i=0;i<temp1.length;i++) {
			if((temp1[i]+temp2[i]).equals(str2) || (temp2[i]+temp1[i]).equals(str2)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

}
