package gr11review.part1;
import java.io.*;

/**
* A program to print a joke based on user-input using switch & case
* @author: Rami Kabak
*
*/
public class Review2 {
    public static void main(String[] args) throws IOException {

        // Declare variables    
        int intJokeNum;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Print options & gather user input for number
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");
        intJokeNum = Integer.parseInt(keyboard.readLine());

        // Switch statement to print each joke
        switch (intJokeNum) {
            case 0:
                System.out.println("What did the barber say when he saw someone with super-thick hair approaching?");
                System.out.println("Hair comes trouble! 😂😂😂😂😂😂😂😂😂😂😂😂😂");
                break;
            case 1:
                System.out.println("What sort of snack do feet like?");
                System.out.println("Dori-toes! 😂😂😂😂😂😂😂😂😂😂😂😂😂");
                break;
            case 2:
                System.out.println("What clothes should you not wear in a car chase?");
                System.out.println("A pullover! 😂😂😂😂😂😂😂😂😂😂😂😂😂");
                break;
            case 3:
                System.out.println("What is the Computer Science teacher's favorite snake?");
                System.out.println("Pi-thon! 😂😂😂😂😂😂😂😂😂😂😂😂😂");
                break;
            default:
                System.out.println("Invalid menu option");
        }
    }
}