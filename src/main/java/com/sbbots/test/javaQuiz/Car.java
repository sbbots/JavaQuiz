package com.sbbots.test.javaQuiz;

public class Car extends Vehicle {

	public String transmission;

	public Car(int maxSpeed, String transmission) {
		super(maxSpeed);
		this.maxSpeed = 100;
		this.transmission = transmission;
	}

	static {
		country = "USA";
	}

}
