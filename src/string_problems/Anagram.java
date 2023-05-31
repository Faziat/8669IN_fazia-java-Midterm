package string_problems;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        checkAnagram();

    }

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here
    public static void checkAnagram (){

        String str1 = "Debit CARD"; // {D, E, B, I, T, C, A, R, D} --> A B C D D E I R T
        String str2 = "BAD Credit"; // {B, A, D, C, R, E, D, I, T} --> A B C D D E I R T

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        if(str1.length() == str2.length()){

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean isAnagram = Arrays.equals(charArray1,charArray2);

            if (isAnagram){

                System.out.println(str1 + " and " + str2 + " are Anagrams");

            } else {

                System.out.println(str1 + " and " + str2 + " are not anagrams");

            }

        } else {

            System.out.println(str1 + " and " + str2 + " are not anagrams");

        }

    }

}