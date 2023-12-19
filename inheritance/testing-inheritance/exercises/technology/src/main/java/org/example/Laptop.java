package org.example;

public class Laptop extends Devices{
    private String weight;
    private String batteryLife;

    public Laptop(String aWeight, String aBatteryLife,String aScreenSize, String aScreenResolution, boolean isPowerOn){
        super(aScreenSize, aScreenResolution, isPowerOn);
        this.weight = aWeight;
        this.batteryLife = aBatteryLife;
    }

    public String doHomework() { return "Homework complete!";}

    @Override
    public String toString() {
        return String.format("Laptop Details:\nWeight: %1$s\nBattery Life: %2$s\n" +
                        "Screen Size: %3$s\nScreen Resolution: %4$s\n",
                weight, batteryLife, getScreenSize(), getScreenResolution());
    }
}
