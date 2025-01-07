package string_problems;

import java.util.HashMap;
import java.util.Map;

/*

Given a string s, the task is to check if it is Pangram or not. A pangram is a sentence containing all letters of the English Alphabet.

Examples: 

Input: s = “The quick brown fox jumps over the lazy dog” 
Output: true
Explanation: The input string contains all characters from ‘a’ to ‘z’.


Input: s = “The quick brown fox jumps over the dog”
Output: false
Explanation: The input string does not contain all characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing

*/

public class String_is_Pangram_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The quick brown fox jumps over the lazy dog";

        Map<Character, Integer> map = new HashMap<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            map.put(c, 0);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                char u = Character.toUpperCase(c);
                map.put(u, map.get(u) + 1);
            }
        }

        boolean result = true;
        for (int count : map.values()) {
            if (count == 0) {
            	result = false;
                break;
            }
        }
	    
        System.out.println(result?true:false);
	}
}
