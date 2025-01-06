// Date: 5 jan 2024              Linkdin:- Connecto Shivam (SHIVAM KUMAR/roll:- 192)

// *Question 4: Write a java program to find a factorial of interger value using iteration.

/* Logic:-
    1. factorial yani :- uska ka 1 to n number tak ka multiplications.
           # Example:- jaise hame 5 ka factorial find karna hai ---> 5 = 5*4*3*2*1
 */

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        // step 1: use the input functions for take input from the user.
        Scanner scan = new Scanner(System.in);
        // step 2: take a number from user.
        System.out.print("Enter the Number:- ");
        int number = scan.nextInt(); // if user input: 5 [Factorial of 5: 120]

        // step 3:- take a fact variable with initialized 1 to store multiplication
        // value.
        long fact = 1;

        // step 4:- use the for loop to iterate value and multiply 1 to number.
        for (int i = 1; i <= number; i++) {
            fact *= i; // yani fact value * i value ---> 1*1 = 1| 1*2=2|2*3=6|6*4=24|24*5=120.
        }
        System.out.println("Factorial of " + number + " : " + fact);

    }

}
/*
 * Be Happy :) [Note:- Any concern/feedback , then connect me I am always here.]
 */
