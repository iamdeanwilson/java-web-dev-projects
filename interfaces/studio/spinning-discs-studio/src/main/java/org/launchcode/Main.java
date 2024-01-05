package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD("CD Title", 60.0, 120.0, "The Band", "Rock n Roll", 12, "Beyonce");

        DVD myDVD = new DVD("DVD Title", 120.0, 1000.0, "Martin Scorsese", "Horror", "1080p", "Beyonce, Leonardo DiCaprio, Jimmy Stewart");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.spinDisc();
        myCD.writeData();
        myCD.readData();
        myCD.playSong();
        myCD.skipSong();

        myDVD.spinDisc();
        myDVD.writeData();
        myDVD.readData();
        myDVD.playMovie();
        myDVD.pauseMovie();

    }
}