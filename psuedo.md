# **Pseudocode** :3
### Premise  
- guess a number between 1 and 100
- Get feedback if the guess is too high, too low or correct
- keep guessing until the correct number is found
- Example:
  - user guesses `76`
  - computer compares value to `37`
  - Computer says `too high!`, as `76` is greater than `37`
  - User guesses again, value `26`
  - computer compares value to `37`
  - computer says `too low!`, as `26` is lower than `76`
  - User guesses again, value `37`
  - computer says `yay correct number!`

### Pseudocode and Braindump
1. create a random number between 0-100
2. initialize scanner, make it so it has an input and make the user guess a number
3. prompt user for input and store the variable
   - also make a loop here, below your user input
     - loop will make sure step 4 will go on until the user has guessed the right number
   - NOTICE: in the example we looked at, they were handling
     a string, we are using an int, so we have the int tag, and
     we use the nextInt() method.
4. compare the guess to the random number
   - guess - number: (CONDITIONAL)
     - if guess is greater, then the number will be positive
     - the greater the guess, the more positive the answer will be
     - if guess is less, then the answer will be negative
     - the lesser the guess, the more negative the answer will be
5. Letters
   - Make a "containment area"
   - in the containment area make it so that if the user tries to guess a letter or word, it will tell them to not pick a letter or word.
   - once they correct their mistake, take them out of the "containment area"
6. LOOP >:D
   - make a statement that says the user has guessed the right number
     - end loop after conditionals have been made so that the computer will stop guessing
7. Play again?
   - let the user know what number they were trying to find
   - ask them if they would like to play again, if they say yes(y), they will play again
      - If they say no(n), end the game

