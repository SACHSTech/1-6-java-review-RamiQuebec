package gr11review.part1;
import java.io.*;
import java.util.Random;

/**
* A program to do 1000 formatted rolls of 3 pulls of numbers 0-8, counts number of triple pulls and also displays it
* @author: Rami Kabak
*
*/
public class Review8 {
    public static void main(String[] args) throws IOException {

        // Declare variables
        int intPull1;
        int intPull2;
        int intPull3;
        int intTriplePull = 0;
        Random random = new Random();
        
        // For loop to set pulls to random numbers from  0-8, checks if pulls equal to each other and adds to the triple pull counter
        for (int i = 0; i < 1000; i++) {
            intPull1 = random.nextInt(9);
            intPull2 = random.nextInt(9);
            intPull3 = random.nextInt(9);
            System.out.println(intPull1 + " " + intPull2 + " " + intPull3);
            if (intPull1 == intPull2 && intPull1 == intPull3){
                intTriplePull++;
            }
        }

        // Prints number of triple pulls
        System.out.println(intTriplePull);
    }
}