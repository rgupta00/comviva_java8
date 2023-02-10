package com.session1.ex3.behavioural_para;

public class Apple {
	private String color;
	private int weight;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public static boolean isGreen(Apple apple) {
		return apple.getColor().equals("green");
	}
	
	public boolean isHeay() {
		return weight>=250;
	}
	
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Apple(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	public Apple() {
	}

}