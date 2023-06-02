package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
String str="KAYAK";
isPalindrome("str");
System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
    int left = 0;
        int right = str.length() - 1;
     while (left < right) {
     if (str.charAt(left) != str.charAt(right)) {
               return false;
            }
            left++;
         right--;
        }
       return true;
    }

}
