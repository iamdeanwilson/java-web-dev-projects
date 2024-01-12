package org.launchcode;

import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        String story = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or conversations in it, ‘and " +
                "what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        Scanner input = new Scanner(System.in);
        System.out.println("Provide a term for which you would like to search within the story: ");
        String searchTerm = input.nextLine().toLowerCase();

        System.out.println(story.toLowerCase().contains(searchTerm));

        Integer index = story.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("This word is at index " + index + ". This word is " + length + " characters long.");
        String modifiedSentence = story.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
}
