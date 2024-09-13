package gr11review.part1;

import java.io.*;

public class Review1 {
    public static void main(String args[]) throws IOException {
        int intMonthNumber;
        int intDayNumber;
        int intAnswer = 0;
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the month number: ");
        intMonthNumber = Integer.parseInt(keyboard.readLine());
        System.out.print("Enter the day number: ");
        intDayNumber = Integer.parseInt(keyboard.readLine());
        
        intMonthNumber = intMonthNumber - 1;
        for (int i = 0; i < intMonthNumber; i++) {
            intAnswer = intAnswer + monthDays[i];
        }
        System.out.println(intAnswer+intDayNumber);
    }
}