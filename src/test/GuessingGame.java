package test;

import java.util.Scanner;
import app.Dictionary;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner UserInput = new Scanner(System.in);
        String randWord = Dictionary.getRandomWord();
        String blank = "";
        String randWord1 = Dictionary.getRandomWord();
        String og = randWord + randWord1;
        String randchar = randWord.charAt(0) + blank;
        String L1 = randchar.toUpperCase();

        Dictionary.getRandomWord();

        Dictionary.getRandomWord();

        System.out.println("Guess the full word!");

        if (randWord.length() + randWord1.length() >= 8) {

            randWord = randWord.replace("a", "4");
            randWord = randWord.replace("e", "3");
            randWord = randWord.replace("i", "1");
            randWord = randWord.replace("o", "0");
            randWord = randWord.replace("u", "6");

            randWord1 = randWord1.replace("a", "4");
            randWord1 = randWord1.replace("e", "3");
            randWord1 = randWord1.replace("i", "1");
            randWord1 = randWord1.replace("o", "0");
            randWord1 = randWord1.replace("u", "6");

            randWord = randWord.replaceFirst(randchar, L1);

            System.out.println(randWord + randWord1);
        }
        String userInput = UserInput.nextLine();

        if (userInput.equals(og))  {

            System.out.println("You guessed it!");
        }
            if (!userInput.equals(randWord + randWord1)) {

            System.out.println("Wrong Try Again");
            Dictionary.getRandomWord();

            Dictionary.getRandomWord();

            System.out.println("Guess the full word!");

            if (randWord.length() + randWord1.length() >= 8) {

                randWord = randWord.replace("a", "4");
                randWord = randWord.replace("e", "3");
                randWord = randWord.replace("i", "1");
                randWord = randWord.replace("o", "0");
                randWord = randWord.replace("u", "6");

                randWord1 = randWord1.replace("a", "4");
                randWord1 = randWord1.replace("e", "3");
                randWord1 = randWord1.replace("i", "1");
                randWord1 = randWord1.replace("o", "0");
                randWord1 = randWord1.replace("u", "6");

                randWord = randWord.replaceFirst(randchar, L1);

                System.out.println(randWord + randWord1);
            }
            userInput = UserInput.nextLine();

            if (userInput.equals(og))
            {

                System.out.println("You guessed it!");

            }

        }
    }
}
