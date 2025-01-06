// Date: 6 jan 2024              Linkdin:- Connecto Shivam (SHIVAM KUMAR/roll:- 192)

//Question 7:- write a program to find area of two circle to whose radius are 5 and 7 cm.
public class Question7 {

    public static void main(String[] args) {

        // step 1: Given radius of two circle
        int radius1 = 5;
        int radius2 = 7;

        // step 2: call the areaOfCircle.
        double area1 = areaOfCircle(radius1);
        double area2 = areaOfCircle(radius2);

        // step 3: print the area of circle
        System.out.println("Area of Circle 1:- " + area1);
        System.out.println("Area of circle 2:- " + area2);
    }

    // step 2.1: call by the main function.
    public static double areaOfCircle(double r) {
        return 3.14 * r * r;
    }
}
/*
 * Be Happy :) [Note:- Any concern/feedback , then connect me I am always here.]
 */
