package com.javatraining.oca.exercise2_1;

//File: Temperature.java
public class Temperature {
	public static void main(String[] args) {
		float fahrenheit = 62.5f;
		/* Convert */
		double celsius = f2c(fahrenheit);
		System.out.println(fahrenheit + 'F' + " = " + celsius + 'C');
	}
	
	static double f2c(float fahr) {
		return (fahr - 32.0) * 5.0 / 9.0;
	}
}