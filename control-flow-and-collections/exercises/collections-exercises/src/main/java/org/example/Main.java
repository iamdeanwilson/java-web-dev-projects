package org.example;

import java.util.*;

public class Main {
//    public static int sumEven(ArrayList<Integer> arr) {
//        int total = 0;
//        for (int integer : arr) {
//            if (integer % 2 == 0) {
//                total += integer;
//            }
//        }
//        return total;
//    }
    public static ArrayList fiveLetterWords(ArrayList<String> arr) {
        ArrayList<String> wordsList = new ArrayList<>();
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        input.close();
        for (String word : arr) {
            if (word.length() == numChars) {
                wordsList.add(word);
            }
        }
        return wordsList;
    }

    public static void main(String[] args) {
//        int[] intArr = {1, 1, 2, 3, 5, 8};
//        for (int i : intArr) {
//            if(i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//        String story = "I would not, could not, in a box. I would not, could not with a fox. I will not eat " +
//                "them in a house. I will not eat them with a mouse.";
//        String[] words = story.split(" ");
//        System.out.println(Arrays.toString(words));
//
//        String[] sentences = story.split("\\.");
//        System.out.println(Arrays.toString(sentences));
//
//        ArrayList<Integer> nums = new ArrayList<Integer>();
//        nums.add(1);
//        nums.add(2);
//        nums.add(3);
//        nums.add(4);
//        nums.add(5);
//        nums.add(6);
//        nums.add(7);
//        nums.add(8);
//        nums.add(9);
//        nums.add(10);
//        Integer evenSum = sumEven(nums);
//        System.out.println(evenSum);

        ArrayList<String> randomWords = new ArrayList<String>();
        randomWords.add("One");
        randomWords.add("Fried");
        randomWords.add("Orange");
        randomWords.add("Spaghetti");
        randomWords.add("Close");
        randomWords.add("French");
        randomWords.add("Forth");
        randomWords.add("Needs");
        randomWords.add("Green");
        randomWords.add("Purple");
        randomWords.add("Oh");
        randomWords.add("Leap");
        randomWords.add("Noodle");
        randomWords.add("Space");
        randomWords.add("Accept");
        ArrayList fiveLetterWordList = fiveLetterWords(randomWords);
        System.out.println(fiveLetterWordList);
    }

}

