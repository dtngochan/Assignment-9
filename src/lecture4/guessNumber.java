
package lecture4;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int targetNumber = rand.nextInt(50) + 1;
        int guess = 0;
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Guess a number from 1 to 50.");
        while(guess != targetNumber){
            System.out.print("Enter your guess number: ");
            guess = scanner.nextInt();
            if(guess < targetNumber){
                System.out.print("Your number is lower. \n");
            }else if(guess > targetNumber){
                System.out.print("Your number is higher. \n");
            }else{
                System.out.println("Your number is correct. " +targetNumber);
            }
        }
    }
}
