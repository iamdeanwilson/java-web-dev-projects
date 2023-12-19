package org.example;

public class SmartPhone extends Devices{
    private String networkSpeed;
    private String carrier;


    public SmartPhone(String aNetworkSpeed, String aCarrier,String aScreenSize, String aScreenResolution, boolean isPowerOn){
        super(aScreenSize, aScreenResolution, isPowerOn);
        this.networkSpeed = aNetworkSpeed;
        this.carrier = aCarrier;
    }

    @Override
    public String toString() {
        return String.format("SmartPhone Details:\nNetwork Speed: %1$s\nCarrier: %2$s\n" +
                        "Screen Size: %3$s\nScreen Resolution: %4$s\n",
                networkSpeed, carrier, getScreenSize(), getScreenResolution());
    }
}
