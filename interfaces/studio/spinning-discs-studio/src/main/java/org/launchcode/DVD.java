package org.launchcode;

public class DVD extends BaseDisc implements Disc{
    private String resolution;
    private String cast;

    public DVD(String title, Double length, Double storageCapacity, String creator, String fileType, String resolution, String cast) {
        super(title, length, storageCapacity, creator, fileType);
        this.cast = cast;
        this.resolution = resolution;
    }

    public void playMovie(){
        System.out.println("Moving is playing");
    }

    public void pauseMovie(){
        System.out.println("Movie Paused");;
    }

    @Override
    public void spinDisc() {
        System.out.println("Spinning DVD");
    }

    @Override
    public void writeData() {
        System.out.println("Data recorded to DVD");
    }

    @Override
    public void readData() {
        System.out.println("Reading DVD Data....");
    }

    public void burnDisc() {
        System.out.println("Burning DVD Data....");
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
