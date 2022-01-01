// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//          
// ****************************************************************

import java.util.Scanner;

public class Factorials
{
    public static void main(String[] args)
    {
	char keepGoing = 'y';

	while (keepGoing == 'y' || keepGoing == 'Y')
	    {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int val = in.nextInt();
		int factorialNumber = MathUtils.factorial(val);
		if(factorialNumber < 0) continue;
		
		System.out.println("Factorial(" + val + ") = " 
				   + factorialNumber);
		System.out.print("Another factorial? (y/n) ");
		keepGoing = in.next().charAt(0);
	    }
    }
}
