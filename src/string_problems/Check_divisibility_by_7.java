package string_problems;

/*

Given a number N, the task is to check if it is divisible by 7 or not.
Note: You are not allowed to use the modulo operator, floating point arithmetic is also not allowed. 

*/

public class Check_divisibility_by_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 371;
        boolean divisible = true; 
        while (num >= 7) {
            num -= 7;
        }
        
        if (num != 0) {
            divisible = false;
        }

        if (divisible) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not Divisible");
        }
	}

}
