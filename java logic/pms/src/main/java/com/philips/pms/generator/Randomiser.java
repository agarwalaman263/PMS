package com.philips.pms.generator;

public class Randomiser {
	
	public int randomInt(int minValue, int maxValue) {
		return (minValue + (int) (Math.random() * ((maxValue - minValue) + 1)));
	}
	
	public double randomDouble(int minValue, int maxValue) {
		return (minValue +  (Math.random() * ((maxValue - minValue) + 1)));
	}
}


