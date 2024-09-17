package gr11review.part1;
import java.io.*;

public class Review7 {
    public static void main(String[] args) throws IOException {
        String theSentence;
        int intSpaces = 0;
        int intaCount = 0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        theSentence = keyboard.readLine();

        for (int i = 0; i < theSentence.length(); i++) {
            if (Character.isWhitespace(theSentence.charAt(i))) {
                intSpaces++;
            }
        }

        for (int i = 0; i < theSentence.length(); i++) {
            if (theSentence.charAt(i) == 'a') {
                intaCount++;
            }
        }

        System.out.println("There are " + theSentence.length() + " characters in the sentence.");  
        System.out.println("There are " + intSpaces + " spaces in the sentence.");  
        System.out.println("There are " + intaCount + " letter a in the sentence.");  
        for (int i = 0; i < theSentence.length() + 1; i++) {
            if (i % 2 == 1) {
                System.out.print("-");
            }
        }
        
        System.out.println("");
    }
}