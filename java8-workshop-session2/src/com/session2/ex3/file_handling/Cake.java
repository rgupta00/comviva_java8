package com.session2.ex3.file_handling;

public class Cake {
	private int id;
	private String name;
	private int price;
	
	public Cake(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Cake() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cake [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}