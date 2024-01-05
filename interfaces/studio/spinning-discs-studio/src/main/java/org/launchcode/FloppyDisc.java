package org.launchcode;

public class FloppyDisc extends BaseDisc implements Disc{

    public FloppyDisc(String title, Double length, Double storageCapacity, String creator, String fileType) {
        super(title, length, storageCapacity, creator, fileType);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {

    }
}
