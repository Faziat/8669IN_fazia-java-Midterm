package math_problems;

import java.util.Arrays;

public class FindLowestDifference {

    /**
     * INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {

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
}

