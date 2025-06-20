package com.builder.build;

public class Computer {
	private final String CPU;
	private final String RAM;
	private final String Storage;
	private final String graphicsCard;
	private final String operatingSystem;
	
	private Computer(Builder builder) {
		this.CPU = builder.CPU;
		this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
		
	}
	
	public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return Storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
    
    @Override
    public String toString() {
        return "Computer Configuration:\n" +
                "CPU: " + CPU + "\n" +
                "RAM: " + RAM + "\n" +
                "Storage: " + Storage + "\n" +
                "Graphics Card: " + graphicsCard + "\n" +
                "Operating System: " + operatingSystem;
    }
    
    public static class Builder {
        private String CPU;
        private String RAM;
        private String Storage;
        private String graphicsCard;
        private String operatingSystem;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.Storage = Storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }

}
