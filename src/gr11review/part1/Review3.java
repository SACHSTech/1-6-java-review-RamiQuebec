package gr11review.part1;
import java.io.*;

public class Review3 {
    public static void main(String[] args) throws IOException {
        for (int i = 20; i < 101; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println("");
        for (int i = 29; i > 0; i--) {
            if (i != 1) {
                System.out.println(i);
            }
        }
    }
}