package string_problems;

import java.util.HashMap;
import java.util.Map;

/*

Two strings s1 and s2 are called isomorphic if there is a one-to-one mapping possible for every character of s1 to every character of s2. And all occurrences of every character in ‘s1’ map to the same character in ‘s2’.

Examples: 

Input:  s1 = “aab”, s2 = “xxy”
Output: True
Explanation: ‘a’ is mapped to ‘x’ and ‘b’ is mapped to ‘y’.


Input:  s1 = “aab”, s2 = “xyz”
Output: False
Explanation: One occurrence of ‘a’ in s1 has ‘x’ in s2 and other occurrence of ‘a’ has ‘y’.

*/

public class Isomorphic_Strings_Check {

	public static void main(String[] args) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		String s1 = "aab", s2 = "xyz";
		boolean flag = true;
		for(int i=0;i<s1.length();i++) {
			if(!map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), s2.charAt(i));
			}
			if(map.containsKey(s1.charAt(i))) {
				if(map.get(s1.charAt(i))==s2.charAt(i)) {
					flag = true;
				}else {
					flag = false;
					System.out.print(flag);
					return;
				}
			}
		}
		System.out.print(flag);

	}

}
