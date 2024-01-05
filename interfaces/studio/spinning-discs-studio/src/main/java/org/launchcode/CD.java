package org.launchcode;

public class CD extends BaseDisc implements Disc {
    private Integer numberOfTracks;
    private String features;

    public CD(String title, Double length, Double storageCapacity, String creator, String fileType, Integer numberOfTracks, String features) {
        super(title, length, storageCapacity, creator, fileType);
        this.numberOfTracks = numberOfTracks;
        this.features = features;
    }

    public void playSong(){
        System.out.println("Song is playing");
    }

    public void skipSong(){
        System.out.println("Skipping Song");
    }

    @Override
    public void spinDisc() {
        System.out.println("Spinning CD");
    }

    @Override
    public void writeData() {
        System.out.println("Writing Data to CD...");
    }

    @Override
    public void readData() {
        System.out.println("Reading Data from CD...");
    }

    public void burnDisc() {
        System.out.println("Burning CD Data....");
    }

    public Integer getNumberOfTracks() {
        return numberOfTracks;
    }

    public void setNumberOfTracks(Integer numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
