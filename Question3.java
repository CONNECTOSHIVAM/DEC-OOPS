// Date: 5 jan 2024              Linkdin:- Connecto Shivam (SHIVAM KUMAR/roll:- 192)

// *Question 3:- Write a java program swapping of two number without using third variable.

/*Logic:- 
    1. we are discuss in last Assingment1 question what is swapping.
       -->  swapping  yani  exchange the variable value.
    2.using two variable:
       example :- we have two variable :- int a = 4; int b = 8;
         # Hum 2 se jada variable use nahi kar sakte hain jo 'a' and ' b' hai.
         # so aab hum a and b ke value ko add karke ek varible empty karenge--> like a=a+b; [a=4+8] now a=12
         # Now second variable b is empty.so we minus value a to b ---> b=a-b;[b=12-8] now b = 4
         # Now we assign the variable a :- ---> a=a-b;[a=12-4] now a = 8;

 */
public class Question3 {

    public static void main(String[] args) {

        // step 1: take a two variable for swapping.
        int a = 4;
        int b = 8;

        // step 2: using two variable build the swapping logic.
        a = a + b;// a=4+8 --> now a = 12.
        b = a - b;// b=12-8 --> now b = 4.
        a = a - b;// a=12-4 --> now a = 8.

        // step 3: print the swapping value
        System.out.println("After swapping value of a:- " + a);
        System.out.println("After swapping value of b:- " + b);

    }
}
/*
 * Be Happy :) [Note:- Any concern/feedback , then connect me I am always here.]
 */
