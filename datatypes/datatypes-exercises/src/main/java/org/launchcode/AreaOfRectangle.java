package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the length of the rectangle:");
        Double length = input.nextDouble();

        System.out.println("Please provide the width of the rectangle:");
        Double width = input.nextDouble();

        Double area = width * length;

        System.out.println("The area of the rectangle is " + area);
    }
}
