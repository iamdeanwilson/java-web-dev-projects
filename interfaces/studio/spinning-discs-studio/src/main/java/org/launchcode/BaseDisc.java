package org.launchcode;

public abstract class BaseDisc {
    private String title;
    private Double length;
    private Double storageCapacity;
    private String creator;
    private String fileType;

    public void storeData() {
        System.out.println("Currently storing data.");
    }

    public void reportInfo() {
        System.out.println(this);
    }

    public BaseDisc(String title, Double length, Double storageCapacity, String creator, String fileType) {
        this.title = title;
        this.length = length;
        this.storageCapacity = storageCapacity;
        this.creator = creator;
        this.fileType = fileType;
    }

    public void readDisc(){
        System.out.println("Reading Disc...");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getGenre() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public String toString() {
        return "title= " + title + '\'' +
                ", length=" + length +
                ", storageCapacity=" + storageCapacity +
                ", creator='" + creator + '\'' +
                ", fileType='" + fileType;
    }
}
