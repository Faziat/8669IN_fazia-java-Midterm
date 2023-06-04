package string_problems;

import java.util.Arrays;
import java.util.Map;

public class UnitTestingStringProblem {


    /**
     * Use this class to unit test all the classes contained within this package
     */

    public static void main(String[] args) {

        checkAnagram();
        determineLargestWord();
        DuplicateWord();
        PermutationClass();
        Palindrome();

    }


    /**
     * this class is to check if any two strings are anagrams
     */
    public static void checkAnagram() {
        String str1 = "Debit CARD"; // {D, E, B, I, T, C, A, R, D} --> A B C D D E I R T
        String str2 = "BAD Credit"; // {B, A, D, C, R, E, D, I, T} --> A B C D D E I R T

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        if (str1.length() == str2.length()) {

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean isAnagram = Arrays.equals(charArray1, charArray2);

            if (isAnagram) {

                System.out.println(str1 + " and " + str2 + " are Anagrams");

            } else {

                System.out.println(str1 + " and " + str2 + " are not anagrams");
            }

        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }

    /**
     * This class to find the length of the longest word in the given sentence
     */

    private static void determineLargestWord() {

        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = DetermineLargestWord.findTheLargestWord(s);

        System.out.println(wordNLength + ";");

    }

    /**
     * This class the to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */
    public static void DuplicateWord() {

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here
        int count;
        //Converts the string into lowercase
        st = st.toLowerCase();
        //Split the string into splittedString using built-in function
        String[] splittedString = st.split(" ");

        for (int i = 0; i < splittedString.length; i++) {
            count = 1;
            for (int j = i + 1; j < splittedString.length; j++) {
                if (splittedString[i].equals(splittedString[j])) {
                    count++;
                    //Set splittedString[j] to 0 to avoid printing visited word
                    splittedString[j] = "0";
                }
            }

            if (count > 1 && splittedString[i] != "0")
                System.out.println(splittedString[i] + " with occurrences: " + (count - 1));
        }

        int avgLength = st.replace(" ", "").length() / splittedString.length;

        System.out.println("Average length of all the words is " + avgLength);
    }

    /**
     * This class is to check if any given String is a palindrome or not.
     */

public static void Palindrome(){

    {
        String str="KAYAK";

        Palindrome.isPalindrome("str");
        System.out.println(Palindrome.isPalindrome(str));
    }

}


/**
 * This class is toto compute all permutations of any given string

 */
public static void PermutationClass(){
    String str = "ABC";
    int len = str.length();
    System.out.println("All the permutations of the string are: ");
    Permutation.generatePermutation(str, 0, len);
}

}