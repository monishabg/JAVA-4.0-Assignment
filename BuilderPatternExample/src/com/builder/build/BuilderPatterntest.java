package com.builder.build;

public class BuilderPatterntest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        System.out.println(gamingPC);
        System.out.println();
        
        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Windows 10")
                .build();

        System.out.println(officePC);


	}

}
