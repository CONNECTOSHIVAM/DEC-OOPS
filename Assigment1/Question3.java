// Date: 5 jan 2024              Linkdin:- Connecto Shivam (SHIVAM KUMAR/roll:- 192)

//Question 3 :- Write a program to print all even number between 25 to 35.

/* even number:- yani aisa number jo 2 se full divide ho and you get reminder 0;
    
    for Example take two Number:- 7,8;

    Number 1: 7 ----- 7 % 2 = 1[2 * 3 = 6] (Not divided full and get reminder 1).
    Number 2: 8 ----- 8 % 2 = 0[2 * 4 = 8] (fully divided and get reminder 0).


*/

public class Question3 {

    public static void main(String[] args) {

        System.out.println("All even number between 25 to 35:- ");
        // step 1 : use for loop for iterate the value 25 to 35.
        for (int i = 25; i <= 35; i++) {
            // step 2 :- check the number is even or odd using if statement.
            if (i % 2 == 0) {
                System.out.print(i + " "); // I used double quote here (" ") for some space between numner.--> 26 space
                                           // then 28.[26 28 30 32 34]
            }
        }
    }
}