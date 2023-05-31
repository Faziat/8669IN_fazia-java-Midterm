package string_problems;

public class DuplicateWord {

    /**
     * INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
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

        int avgLength = st.replace(" ","").length() / splittedString.length;

        System.out.println("Average length of all the words is " + avgLength);
    }

}

