import java.util.Scanner;
import java.util.Random;

public class Number_Guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int numberToGuess = rand.nextInt(100) + 1;  // random number between 1 and 100
        int userGuess = 0;
        int attempts = 0;
        
        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it!");
        
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;
            
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        
        System.out.println("Thanks for playing!");
        sc.close();
    }
}


