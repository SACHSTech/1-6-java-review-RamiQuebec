package gr11review.part1;
import java.io.*;

/**
* A program to count number of characters, spaces, and letter a in a sentence
* @author: Rami Kabak
*
*/
public class Review7 {
    public static void main(String[] args) throws IOException {

        // Declare variables
        String theSentence;
        int intSpaces = 0;
        int intaCount = 0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Gather user input to set sentence variable
        theSentence = keyboard.readLine();

        // For loop for number of spaces
        for (int i = 0; i < theSentence.length(); i++) {
            if (Character.isWhitespace(theSentence.charAt(i))) {
                intSpaces++;
            }
        }

        // For loop for number of a's
        for (int i = 0; i < theSentence.length(); i++) {
            if (theSentence.charAt(i) == 'a') {
                intaCount++;
            }
        }

        // Print number of characters, spaces and a's in the sentence
        System.out.println("There are " + theSentence.length() + " characters in the sentence.");  
        System.out.println("There are " + intSpaces + " spaces in the sentence.");  
        System.out.println("There are " + intaCount + " letter a in the sentence.");  

        // For loop to print dashes based on the odd numbered characters
        for (int i = 0; i < theSentence.length() + 1; i++) {
            if (i % 2 == 1) {
                System.out.print("-");
            }
        }
        
        System.out.println("");
    }
}