package gr11review.part1;
import java.io.*;

/**
* A program using 2 for loops to print increasing odd numbers and decreasing numbers
* @author: Rami Kabak
*
*/
public class Review3 {
        public static void main(String[] args) throws IOException {

        // For loop counting to 100 and printing only odd numbers
        for (int i = 20; i < 101; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        System.out.println("");

        // For loop decreasing from 29 and excluding 1
        for (int i = 29; i > 1; i--) {
            System.out.println(i);
        }
    }
}