/**
 * Problem Set 2.
 * 
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1. GOOD
         * 
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

        // System.out.print("\nEnter your first name: ");
        // String firstName = in.nextLine();
        // System.out.print("Enter your last name: ");
        // String lastName = in.nextLine();
        // System.out.print("Enter your grade: ");
        // String grade = in.nextLine();
        // System.out.print("Enter your age: ");
        // String age = in.nextLine();
        // System.out.print("Enter your hometown: ");
        // String hometown = in.nextLine();

        // System.out.printf("\nNAME     : %s %s\n", firstName, lastName);
        // System.out.printf("GRADE    : %s\n", grade);
        // System.out.printf("AGE      : %s\n", age);
        // System.out.printf("HOMETOWN : %s\n", hometown);


        // System.out.println(firstName);
        // System.out.println(lastName);
        // System.out.println(grade);
        // System.out.println(age);
        // System.out.println(hometown);

        
        /*
         * Exercise 2. GOOD
         * 
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

        // final double valueDollar = 1.00;
        // final double valueQuarter = 0.25;
        // final double valueDime = 0.10;
        // final double valueNickel = 0.05;

        // System.out.print("Enter a dollar amount: ");
        // double dollarAmount = in.nextDouble();
        // double value = dollarAmount;

        // double dollarsNeeded = Math.floor(dollarAmount);
        // value -= dollarsNeeded*valueDollar;
        // double quartersNeeded = Math.floor(value/valueQuarter);
        // value -= quartersNeeded*valueQuarter;
        // double dimesNeeded = Math.floor(value/valueDime);
        // value -= dimesNeeded*valueDime;
        // double nickelsNeeded = Math.floor(value/valueNickel);
        // value -= nickelsNeeded*valueNickel;
        // double penniesNeeded = Math.floor(value/0.01);

        // System.out.printf("\nDOLLARS  : %.0f\n", dollarsNeeded);
        // System.out.printf("QUARTERS : %.0f\n", quartersNeeded);
        // System.out.printf("DIMES    : %.0f\n", dimesNeeded);
        // System.out.printf("NICKELS  : %.0f\n", nickelsNeeded);
        // System.out.printf("PENNIES  : %.0f\n\n", penniesNeeded);


        /*
         * Exercise 3. GOOD
         * 
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

        // final double valueTwentyDollar = 20.00;
        // final double valueTenDollar = 10.00;
        // final double valueFiveDollar = 5.00;

        // System.out.print("Enter a dollar amount: ");
        // dollarAmount = in.nextDouble();
        // value = dollarAmount;

        // double twentiesNeeded = Math.floor(value/valueTwentyDollar);
        // value -= twentiesNeeded*valueTwentyDollar;
        // double tensNeeded = Math.floor(value/valueTenDollar);
        // value -= tensNeeded*valueTenDollar;
        // double fivesNeeded = Math.floor(value/valueFiveDollar);
        // value -= fivesNeeded*valueFiveDollar;
        // dollarsNeeded = Math.floor(value/valueDollar);
        // value -= dollarsNeeded*valueDollar;
        // quartersNeeded = Math.floor(value/valueQuarter);
        // value -= quartersNeeded*valueQuarter;
        // dimesNeeded = Math.floor(value/valueDime);
        // value -= dimesNeeded*valueDime;
        // nickelsNeeded = Math.floor(value/valueNickel);
        // value -= nickelsNeeded*valueNickel;
        // penniesNeeded = Math.floor(value/0.01);

        // double billsNeeded = twentiesNeeded+tensNeeded+fivesNeeded+dollarsNeeded;
        // double coinsNeeded = quartersNeeded+dimesNeeded+nickelsNeeded+penniesNeeded;

        // System.out.printf("\nBILLS : %.0f\n", billsNeeded);
        // System.out.printf("COINS : %.0f\n\n", coinsNeeded);


        /*
         * Exercise 4.
         * 
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

        // double mileToInches = 63360;
        // double 
        
        /*
         * Exercise 5.
         * 
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
        

        
        /*
         * Exercise 6. GOOD
         * 
         * Given a diameter, print the area and circumference of the corresponding circle.
         */
        
        // System.out.print("Enter a diameter: ");
        // double diameter = in.nextDouble();
        // double radius = diameter/2;

        // double circleArea = Math.PI*Math.pow(radius, 2);
        // double circleCircumference = 2*Math.PI*radius;

        // System.out.printf("AREA          : %.2f\n", circleArea);
        // System.out.printf("CIRCUMFERENCE : %.2f\n", circleCircumference);

        /*
         * Exercise 7.
         * 
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */
        

        
        /*
         * Exercise 8.
         * 
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */
        

        
        /*
         * Exercise 9.
         * 
         * Given a string, reverse and print the first and second halves of that string.
         */
        

        
        /*
         * Exercise 10.
         * 
         * Given a first, middle, and last name, print the corresponding initials.
         */
        

        
        in.close();
    }
}