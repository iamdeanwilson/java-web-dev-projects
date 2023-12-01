package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radiusOfCircle;
        double areaOfCircle;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radiusOfCircle = input.nextDouble();
        input.close();

//        areaOfCircle = 3.14 * radiusOfCircle * radiusOfCircle;
        areaOfCircle = Circle.getArea(radiusOfCircle);

        System.out.println("The area of a circle of radius " + radiusOfCircle + " is: " + areaOfCircle);
    }
}
