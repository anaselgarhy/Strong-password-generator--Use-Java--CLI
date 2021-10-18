package generator;

import helpers.Functions;

import java.util.Random;

public class Generator {
    public static String generatePassword(int length) {
        /* the strong password length is getter than or equal 8 characters
         * 60% characters - 30% upper case characters - 30% lower case characters
         * 40% numbers and symbols - 20% numbers - 20% symbols
         */

        StringBuilder generatedPassword = new StringBuilder();

        // Get percentages of password components
        int characters = (int) Math.round(length * (30.0 / 100));
        int symbols = (int) Math.round(length * (20.0 / 100));

        String ch = Functions.getAllUpperCaseCharacters();
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";

        // Generate
        for (int i = 0; i < characters; i++) {
            generatedPassword.append(ch.charAt((int) (Math.random() * ch.length())));
            generatedPassword.append(ch.toLowerCase().charAt((int) (Math.random() * ch.length())));
        }

        for (int i = 0; i < symbols; i ++) {
            generatedPassword.append(specialCharactersString.charAt((int)(Math.random() * specialCharactersString.length())));
            generatedPassword.append((int)(Math.random() * 10));
        }

        // Shuffle
        generatedPassword = Functions.shuffle(generatedPassword.toString());

        return generatedPassword.toString();
    }
}
