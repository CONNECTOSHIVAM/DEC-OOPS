// Date: 6 jan 2024              Linkdin:- Connecto Shivam (SHIVAM KUMAR/roll:- 192)

//   *Question 6:- Write a program in java to find volume of 3 different boxes.

/*Logic 
     1. volume:- volume yani kisi vastu ya box ka tatal space.
        Example:- jaise ek bottle hai uska volume(length*width*height) ye batata hai ki 
        uspe kitna pani aayega.
 */

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        // step 1:- use the input function take input form user.
        Scanner scan = new Scanner(System.in);

        // step 2:- for take three box dimentions to user.
        for (int i = 1; i <= 3; i++) {
            // step 3:- Message for number of box fot take dimentions.
            System.out.println("Enter dimentions for box " + i + " : ");

            System.out.print("Length:- ");
            double length = scan.nextDouble();

            System.out.print("Width:- ");
            double width = scan.nextDouble();

            System.out.print("Height:- ");
            double height = scan.nextDouble();

            // step 4:- call the function
            double volume = calculateVolume(length, width, height);

            // step 5:- print the volume of All box.
            System.out.println("Volume of Box " + i + " :" + volume + "\n"); // "\n"--> is used for next line
        }
    }

    // step 4.1:- call by the main function.
    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
}
/*
 * Be Happy :) [Note:- Any concern/feedback , then connect me I am always here.]
 */
