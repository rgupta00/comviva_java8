package com.session1.ex6.case_study2;

public class DishSelectedField {
	private String name;
	private int calories;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public DishSelectedField(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	public DishSelectedField() {}
	
	
}
