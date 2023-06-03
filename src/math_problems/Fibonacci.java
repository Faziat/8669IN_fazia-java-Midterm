package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {

        int maxNumber = 40;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println("Fibonacci Series of "+maxNumber+" numbers:");

        for (int i = 0; i <= maxNumber; ++i)
        {
            System.out.println("Fibonacci " + i + ": " + previousNumber);
            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */


            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}



