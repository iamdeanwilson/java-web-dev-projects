package org.example;

public class Main {
    public static void main(String[] args) {

        Computer testComputer = new Computer ("GPU", "Processor", "15in", "1080p",
                true);

        Laptop testLaptop = new Laptop("2lbs", "8 Hours", "15in", "1080p",
                true);

        SmartPhone testSmartPhone = new SmartPhone("5G", "T-Mobile", "15in", "1080p",
                true);

        System.out.println(testComputer);
        System.out.println(testLaptop);
        System.out.println(testSmartPhone);

    }
}