package math_problems;

import java.util.Arrays;

public class UnitTestingMath {

    /**
     * Use this class to unit test all of the class within this package
     */

    public static void main(String[] args) {

        factorialClass();
        fibonacciClass();
        lowestDifferenceClass();
        missingNumberClass();
        lowestNumberClass();
        patternClass();
        primeNumberClass();

    }

    /**
     * this method is to return Factorial of any number
     */
    public static void factorialClass(){

        int num = 5;
        System.out.println("Factorial of " + num + " is " + Factorial.factorial(5));
        System.out.println("Factorial of " + num + " is: " + Factorial.factorialIteration(5));

    }

    /**
     * this method is to find Fibonacci number
     */
    public static void fibonacciClass(){

        int maxNumber = 40;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

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

    /**
     * this method is to find Lowest difference
     */
    public static void lowestDifferenceClass(){

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        Arrays.sort(array1);
        System.out.print("Array1 sorted: ");
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println("\n" + "Lowest number of array1 is: " + array1[0]);

        Arrays.sort(array2);
        System.out.print("Array2 sorted : ");
        for (int j=0;j<array2.length;j++){
            System.out.print(array2[j] + " ");
        }
        System.out.println("\n" + "Lowest number of array2 is: " + array2[0]);

        int count = Math.min(array1.length,array2.length);

        for (int z = 0; z < count;z++){

            if (array1[z] != array2[z]){

                System.out.println("The lowest number that is not shared between the two arrays is: " +
                        Math.min(array1[z],array2[z]));

                break;
            }
        }
    }

    /**
     * this method is to find Missing number
     */
    public static void missingNumberClass(){

        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int missingNumber = FindMissingNumber.findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);

        System.out.println("The missing number is: " + FindMissingNumber.findMissingNumber2(array));

    }

    /**
     * this method is to find Lowest number
     */
    public static void lowestNumberClass(){

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65};
        int lowest = LowestNumber.findLowest(array);
        System.out.println("The lowest number in the array is: " + lowest);

    }

    /**
     * this method is to identify a Pattern
     */
    public static void patternClass(){

        int num = 101;
       Pattern. printPattern(num);


    }

    /**
     * this method is to find Prime number
     */
    public static void primeNumberClass(){

        int limit = 1000000;
        System.out.println("Prime numbers from 2 to " + limit + " are:");
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }

        }
    }
}
