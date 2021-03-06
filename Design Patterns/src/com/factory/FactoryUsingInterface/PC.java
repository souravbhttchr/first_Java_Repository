package com.factory.FactoryUsingInterface;

public class PC implements Computer {

	private int RAM;
	private int HDD;
	private String processor;
	
	public PC(int RAM, int HDD, String processor) {
		this.RAM = RAM;
		this.HDD = HDD;
		this.processor = processor;
	}

	@Override
	public int getRAM() {
		return this.RAM;
	}

	@Override
	public int getHDD() {
		return this.HDD;
	}

	@Override
	public String getProcessor() {
		return this.processor;
	}

}
