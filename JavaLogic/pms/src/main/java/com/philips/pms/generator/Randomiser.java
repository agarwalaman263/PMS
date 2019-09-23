package com.philips.pms.generator;

import java.util.Random;

public class Randomiser {
	Random r= new Random();
	
	
	public int randomInt(int minValue, int maxValue) {
		return (minValue +(r.nextInt(maxValue)));
	}
	
	public double randomDouble(int minValue, int maxValue) {
		return (minValue +  (r.nextInt() * ((maxValue - minValue) + 1)));
	}
}


