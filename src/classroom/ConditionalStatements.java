package classroom;

public class ConditionalStatements {
    public static void main(String[] args) {

        // Conditional statements in Java allow to control the flow of tyour programm based on certain
        // contditions

        /*
        if(condition)
        //
         */

        if (true) {
            System.out.println("This code is exected");
        }
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than ");
        }
        if (x > 12) {
            System.out.println("x is greather than 12");
        }
        boolean isSpring = true;
        if (isSpring) {
            System.out.println("it is Spring!");
        }

        // Whaat returns true or false
        // Comparison >, <, ==, >=, <=; !=

        // IF-ELSE

        // Child; <=12 age;
        // TTeenager => 13 & <=19;
        //Adult => 20 & <= 59;
        // Else : Senior;

        int age = 23;


        if (age <= 12) {
            System.out.println("This is Child!");
        } else {
            System.out.println("Something else!");
        }
        if (age <= 14) {
            System.out.println("This is Teenager!");
        } else {
            System.out.println("Something else");
        }
        if (age <= 20) {
            System.out.println("This is adult!");
        } else {
            System.out.println("Something else!");
        }

        //IF ELSE IF ELSE


        if (age <= 12) {
            System.out.println("This is child!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This si teenager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("this is adult");
        } else {
            System.out.println("This is Senior!");
        }

        //
        //Step 1: define variable ( int number = 10)
        //Step 2 Create logic
        //Step 3: FOr each condition print out message ( is positive, is negative, is Zero);

        int num = 0;
        if (num < 0) {
            System.out.println("is negative");
        } else if (num == 0) {
            System.out.println("is positive");
        } else if (num == 0) {
            System.out.println("is zero!");
        }
////
    }
}


