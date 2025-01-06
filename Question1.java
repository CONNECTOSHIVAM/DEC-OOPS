// Date: 5 jan 2024              Linkdin:- Connecto Shivam (SHIVAM KUMAR/roll:- 192)

//Question 1:-  Write a program to swap a two number using third variable.

/* Logic:- 
      swap 2 variable value yani = ek dusre box(variable) ka number change ho jaye.
       Example:-   
               a = 10 hai and b = 15 hai tho iska value ek dusre me change ho jaye.
               yani aaisa output ho:- a= 15 and b=10;
    
      Now in this you can take three variable for solution:
         * Take three variable:- a , b and c.[in this program a = 10, b=15 and c (this variable contain nothing)]
         * now c = a; // now assign value of a = 10 to c varible. [so now varible a is empty(yani koi value nahi hai)[yani c = 10]
         *     a = b; // now a variable is empty and assign the value of b. [yani a = 15]
         *     b = c;  // now b variable is empty and assign the value of c. [yani b = 10] 
         * //output will be:- a= 15; b=10; 
          
 */

public class Question1 {

    public static void main(String[] args) {

        // step 1: take a three variable a , b and c.
        int a = 10;
        int b = 15;
        int c; // just decleared the variable c (without any value).

        // step 2: swap the value using thrid variable.
        c = a; // now assing value of a = 10 to c varible. [so now varible a is empty(yani koi
               // value nahi hai)]
        a = b; // now a variable is empty and assign the value of b. [yani a = 15]
        b = c; // now b variable is empty and assign the value of c. [yani b = 10]

        // step 3: print the swap value.
        System.out.println(a);
        System.out.println(b);

    }

}

/*
 * Be Happy :) [Note:- Any concern/feedback , then connect me I am always here.]
 */
