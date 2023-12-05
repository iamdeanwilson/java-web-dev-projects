package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // To be used later to confirm if character in string is an alphabetical letter or not
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // Default string from Canvas
//        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has " +
//                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into " +
//                "a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s " +
//                "pretty straightforward from there.";

        // Accept user input for string
//        Scanner input;
//        input = new Scanner(System.in);
//        System.out.println("Enter a string to count the characters: ");
//        String myString = input.nextLine();
//        input.close();


        // Use text from a text file
        File filePath = new File("C:/Users/iamde/Desktop/Launchcode/java-web-dev-projects/control-flow-and-collections/Studio/counting-characters/test-text-document.txt");
        Scanner input = new Scanner(filePath);
        String myString = input.nextLine();
        input.close();

        // Convert string into array of characters
        char[] charactersInString = myString.toLowerCase().toCharArray();

        // Initialize the HashMap that will store the characters and their respective counts
        HashMap<Character, Integer> characterCount = new HashMap<>();

        // Initialize each letter as a key and start the count at 0
        for (char c : charactersInString) {
            if (alphabet.contains(String.valueOf(c))) {
                characterCount.put(c, 0);
            }
        }

        // Increase the count for each letter as it appears in the string
        for (char c : charactersInString) {
            if (alphabet.contains(String.valueOf(c))) {
                characterCount.put(c, characterCount.get(c) + 1);
            }
        }

        // Print results to console
        for (Map.Entry<Character, Integer> characterCountPrint : characterCount.entrySet()) {
            System.out.println(characterCountPrint.getKey() + ": " + characterCountPrint.getValue());
        }
    }
}