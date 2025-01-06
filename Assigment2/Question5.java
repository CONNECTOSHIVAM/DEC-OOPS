// Date: 6 jan 2024              Linkdin:- Connecto Shivam (SHIVAM KUMAR/roll:- 192)

//*Question 5: write a java program to find a factorial of an integer number using recursion.

/* Logic:-
      1. recursion function :- wo functions wo problem ko sub(small-small) problem me divided
       karta hai. jise function khud hi call karta hai.
       [A recursive function divides a problem into smaller sub-problems 
          and calls itself to solve each sub-problem.]
      2. In the last question4 we discuss the about factorial.
             #Example: [Factorial of 5=5*4*3*2*1 ]
             
 */

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        // step 1: use the input functions for take input from the user.
        Scanner scan = new Scanner(System.in);
        // step 2: take a number from user.
        System.out.print("Enter the Number:- ");
        int number = scan.nextInt(); // if user input: 5 [Factorial of 5: 120]

        // step 3:- call the function
        int fact = calculateFactorial(number);

        // step 4:- print the factorial.
        System.out.println("Factorial of " + number + " :-" + fact);

    }

    // step 3.1 :- main function call the calculateFactorial function.
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1); // in the line again invoked the function and repeat the function till
                                                  // n = 0.
        }
    }

}
/*
 * Be Happy :) [Note:- Any concern/feedback , then connect me I am always here.]
 */
