package math_problems;

public class PrimeNumber {

    /**
     * INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     * Print out the prime numbers in the given range.
     * <p>
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {

        int limit = 1000000;
        System.out.println("");
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
