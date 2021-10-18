package commandLineInterface;

import generator.Generator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int passwordLength;
        // Get the length of the password from the user and verify that the number entered is not less than 8
        while(true) {
            System.out.print("Enter the password length: ");
            try {
                while ((passwordLength = new Scanner(System.in).nextInt()) < 8) {
                    System.out.print("Password length must be at least 8 characters in order to be strong, re-enter longer length: ");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("You must enter a valid number");
            }
        }

        // Generate  strong password
        String password = Generator.generatePassword(passwordLength);

        System.out.println(password);
    }
}
