package math_problems;

import java.util.Arrays;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing number is: " + missingNumber);

        System.out.println("The missing number is: " + findMissingNumber2(array));
    }
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return sum - arrSum;
    }

    public static int findMissingNumber2(int[] arr2){
        int[] arrTest = arr2;

        Arrays.sort(arrTest);

        int missingNumber = 0;

        int diff = 0;

        for (int i = 0; i<arrTest.length;i++){

            diff = arrTest[i+1] - arrTest[i];

            if (diff > 1){
                missingNumber = i + 2;
                break;
            }

        }
        return missingNumber;
    }
}
