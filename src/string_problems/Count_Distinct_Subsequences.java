package string_problems;

import java.util.HashSet;
import java.util.Set;

/*

Given a string, find the count of distinct sub of it. 

Examples: 

Input: str = “gfg”
Output: 7
Explanation: The seven distinct sub are “”, “g”, “f”, “gf”, “fg”, “gg” and “gfg” 


Input: str = “ggg”
Output: 4
Explanation: The four distinct sub are “”, “g”, “gg” and “ggg”

*/

public class Count_Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "gfg"; 
		Set<String> sub = new HashSet<>();
        sub.add("");
        for (char ch : str.toCharArray()) {
            Set<String> newsub = new HashSet<>();
            for (String s : sub) {
                newsub.add(s + ch);
            }
            sub.addAll(newsub);
        }
        System.out.println(sub.size());
	}
}
