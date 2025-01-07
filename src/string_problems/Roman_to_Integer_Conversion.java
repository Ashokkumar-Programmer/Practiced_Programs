package string_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*

Given a string in roman form, the task is to convert this given roman string into an integer.

Roman numerals are based on the symbols I, V, X, L, C, D, and M, which represent 1, 5, 10, 50, 100, 500, and 1,000 respectively. Different arrangements of these symbols represent different numbers. The roman numbers I, II, III, IV, V, VI, VII, VIII, IX, and X represent 1, 2, 3, 4, 5, 6, 7, 8, 9 and 10 respectively.

How does the conversion work?

If a smaller value symbol comes before, we subtract. Otherwise, we add.
In IV, I comes before V and V has a larger value 5. So our result is 5 – 1 = 4.
In VI, V comes before I and I has a smaller value 1. So our result is 5 + 1 = 6.
In II, we have same values, so we add and get 1 + 1 = 2
In case of more than 2 characters, we traverse from left to right and group only when we see a greater value character after a smaller value character. For example MXVII is 1000 + 10 + 5 + 1 + 1 = 1017. And XLVII is (50 – 10) + 5 + 1 + 1 = 47. Note that L is larger and comes after X.
Examples:

Input: s = “IX”
Output: 9
Explanation: IX is a Roman symbol which represents 10 – 1 = 9


Input: s = “XL”
Output: 40
Explanation: XL is a Roman symbol which represents 50 – 10 = 40


Input: s = “MCMIV”
Output: 1904
Explanation: M is 1000, CM is 1000 – 100 = 900, and IV is 4. So we have total as 1000 + 900 + 4 = 1904

*/

public class Roman_to_Integer_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		String roman = "XV";
		int sum = 0;
		int s1 = 0, s2 = 0;
		for(int i=0;i<roman.length();i++) {
			s1 = map.get(roman.charAt(i));
			if(i+1<roman.length()) {
				s2 = map.get(roman.charAt(i+1));
				if(s1>=s2) {
					sum += s1;
				}
				else {
					sum += (s2-s1);
					i++;
				}
			}
			else {
				sum+=s1;
			}
		}
		System.out.println(sum);
	}
}
