package string_problems;

/*

Given a list of words followed by two words, the task is to find the minimum distance between the given two words in the list of words.

Examples:


Input: S = { "the", "quick", "brown", "fox", "quick"}, word1 = "the", word2 = "fox"
Output: 3
Explanation: Minimum distance between the words "the" and "fox" is 3


Input: S = {"geeks", "for", "geeks", "contribute",  "practice"}, word1 = "geeks", word2 = "practice"
Output: 2
Explanation: Minimum distance between the words "geeks" and "practice" is 2

*/

public class Minimum_distance_between_the_given_two_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"geeks", "for", "geeks", "contribute",  "practice"};
		int start_index = 0, end_index = 0;
		String start = "geeks", end = "practice";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==start) {
				start_index = i+1;
			}
			else if(arr[i]==end) {
				end_index = i+1;
			}
		}
		System.out.println(end_index-start_index);
	}

}
