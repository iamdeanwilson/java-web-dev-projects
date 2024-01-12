package org.launchcode;

import java.util.HashMap;

import static java.util.Objects.isNull;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        Divide(7, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        System.out.println(CheckFileExtension(""));
//         Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y)
    {

        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        int score = 0;
        if (fileName.contains(".java")) {
            score = 1;
        }
        if (!fileName.contains(".java")) {
            score = 0;
        }
        if (isNull(fileName)) {
            score = -1;
        }
            return score;
        }

}