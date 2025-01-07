package string_problems;

import java.util.*;

/*

Given a number, find its corresponding Roman numeral. 

Examples: 

Input : 9
Output : IX
Input : 40
Output : XL
Input :  1904
Output : MCMIV
Following is the list of Roman symbols which include subtractive cases also:

SYMBOL       VALUE
I             1
IV            4
V             5
IX            9
X             10
XL            40
L             50
XC            90
C             100
CD            400
D             500
CM            900 
M             1000

*/

public class Integer_to_Roman_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1904;
		String m[] = { "", "M", "MM", "MMM" };
        String c[] = { "",  "C",  "CC",  "CCC",  "CD",
                       "D", "DC", "DCC", "DCCC", "CM" };
        String x[] = { "",  "X",  "XX",  "XXX",  "XL",
                       "L", "LX", "LXX", "LXXX", "XC" };
        String i[] = { "",  "I",  "II",  "III",  "IV",
                       "V", "VI", "VII", "VIII", "IX" };

        String thousands = m[num / 1000];
        String hundreds = c[(num % 1000) / 100];
        String tens = x[(num % 100) / 10];
        String ones = i[num % 10];

        String ans = thousands + hundreds + tens + ones;
		System.out.println(ans);
	}

}
