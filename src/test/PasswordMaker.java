package test;

import app.Dictionary;

import javax.swing.text.AttributeSet;

public class PasswordMaker {

    public static void main(String[] args) {
        // Use the Dictionary library to create a secure password.
        String randWord = Dictionary.getRandomWord();
        String blank = "";
        String randWord1 = Dictionary.getRandomWord();
        String randchar = randWord.charAt(0) + blank;
        String L1 = randchar.toUpperCase();
            Dictionary.getRandomWord();

            Dictionary.getRandomWord();

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






        // 1. Get 2 random words and put them together.
        // 1a. Make sure it is at least 8 characters long. If not, do it again.

        // 2. Replace the vowels with numbers following these rules:
        //    a becomes 4
        //    e becomes 3
        //    i becomes 1
        //    0 becomes 0
        //    u becomes 6

        // 3. Capitalize the first letter

        // 4. Tell the person their password.

        // BONUS 5. Ask the person if they want another one and make another one.
    }
}
