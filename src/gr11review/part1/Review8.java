package gr11review.part1;
import java.io.*;
import java.util.Random;

public class Review8 {
    public static void main(String[] args) throws IOException {
        int intPull1;
        int intPull2;
        int intPull3;
        int intTriplePull = 0;

        Random random = new Random();
        
        for (int i = 0; i < 1000; i++) {
            intPull1 = random.nextInt(9);
            intPull2 = random.nextInt(9);
            intPull3 = random.nextInt(9);
            System.out.println(intPull1 + " " + intPull2 + " " + intPull3);
            if (intPull1 == intPull2 && intPull1 == intPull3 && intPull2 == intPull3){
                intTriplePull++;
            }
        }
        System.out.println(intTriplePull);
    }
}