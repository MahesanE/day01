package day01;
import java.io.Console;
import java.security.SecureRandom;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        
         // create a random number generator
        Random rand = new SecureRandom();
        // generate a number between 1 - 10;
        int toGuess = rand.nextInt(10) + 1;
        //System.out.printf("toGuess: %d\n", toGuess);
        // Ask for user input for guess
        Console cons = System.console();
        for (int tries = 3; tries >= 1; tries--)
        //the int tries shows how many times you want to loop. Condition has to be more than one on the loop
         {
            int num = Integer.parseInt(cons.readLine("What is your guess? (%d tries)\n", tries));
            if (num == toGuess) {
                System.out.printf("Correct! You win!\n");
                break;
            } else if (num > toGuess) {
                System.out.printf("Lower\n");
            } else {
                System.out.printf("Higher\n");
            }
            if(tries ==1 && num!=toGuess){
                System.out.printf("the answer %d. you lose",toGuess);
            }
        }
    }
}