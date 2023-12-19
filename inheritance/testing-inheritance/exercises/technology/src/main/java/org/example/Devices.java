package org.example;

public abstract class Devices {
    private String screenSize;
    private String screenResolution;
    private boolean powerOn = false;

    public Devices(String aScreenSize, String aScreenResolution, boolean isPowerOn){
        this.screenSize = aScreenSize;
        this.screenResolution = aScreenResolution;
        this.powerOn = isPowerOn;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "screenSize='" + screenSize + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", powerOn=" + powerOn +
                '}';
    }
}
