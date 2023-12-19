package org.example;

public class Computer extends Devices{
    private String gpu;
    private String processor;


    public Computer(String aGpu, String aProcessor,String aScreenSize, String aScreenResolution, boolean isPowerOn){
        super(aScreenSize, aScreenResolution, isPowerOn);
        this.gpu = aGpu;
        this.processor = aProcessor;
    }

    public String playGame() { return "Starting game!";}

    @Override
    public String toString() {
        return String.format("Computer Details:\nGPU: %1$s\nProcessor: %2$s\n" +
                        "Screen Size: %3$s\nScreen Resolution: %4$s\n",
                gpu, processor, getScreenSize(), getScreenResolution());
    }
}
