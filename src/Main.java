import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        // 1. create a random number between 0-100
            int randomNum = (int) (Math.random() * 101);

        // 2. initialize scanner
        Scanner myInput = new Scanner(System.in); // makes a scanner
            int userGuess = 0;
            boolean isValid = false;
        // 3. prompt user for input and store the variable
        while (userGuess != randomNum) {  // starts a loop for the user and comparisons (conditionals)
            System.out.println("Please guess a number");

        /* NOTICE: in the example we looked at, they were handling
        a string, we are using an int, so we have the int tag, and
        we use the nextInt() method.
         */

           // TESTING PURPOSES, made to make sure if the user puts in a letter it won't send an error
            while(!isValid) {
                try {
                    userGuess = myInput.nextInt();
                    isValid = true;
                }
                catch (InputMismatchException e) {
                    System.out.println("Not even close, pick a NUMBER >:C");
                        myInput.next();
                }
            }

                isValid = false; // ends the loop

            // show the number the guesser picked
            System.out.println("Your number:" + userGuess);

            // 4. compare the guess to the random number
                     /*
                     guess - number: (CONDITIONAL)
                        - if guess is greater, then the number will be positive
                            - the greater the guess, the more positive the answer will be
                        - if guess is less, then the answer will be negative
                            - the lesser the guess, the more negative the sneer will be
                      */
           if (userGuess - randomNum > 25) {
                    System.out.println("Number you picked was too high!"); // 25 higher than randomNum
               } else if (userGuess - randomNum > 10) {
                    System.out.println("Number you picked was too high, but close!"); // 10 higher than randomNum
               } else if (userGuess - randomNum > 0) {
                    System.out.println("Number you picked was too high, but really close!");// very close to randomNum
               }
           if (userGuess - randomNum < -25) {
                    System.out.println("Number you picked too low!"); // 25 lower than randomNum
               } else if (userGuess - randomNum < -10) {
                    System.out.println("Number you picked was too low, but close!"); // 10 lower than randomNum
               } else if (userGuess - randomNum < 0) {
                    System.out.println("Number you picked was too low, but really close!"); // very close to randomNum
               }
           if (userGuess == randomNum) {
                    System.out.println("You got the right number great job!");
           }
        }

        System.out.println("The random number was: " + randomNum);
        System.out.println("would you like to play again? (y/n)");
           char playAgain = myInput.next().charAt(0); // start at zero in java, not one
                if (playAgain == 'y') {
                    main(args); // sends computer back to the start
                }
                if (playAgain == 'n') {
                    System.out.println("Alright, thank you for playing!");
                        myInput.close();// ends the game and code.
                    }
    }
}