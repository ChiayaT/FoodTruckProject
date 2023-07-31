package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String name;
	private String type;
	private double rating;
	private int id;
	private static int nextTruckId = 1;
	
	public FoodTruck(String name, String type, double rating) {
		this.name = name;
		this.type = type;
		this.rating = rating;
		this.id = nextTruckId;
		nextTruckId += 1;
		
	}

	@Override
	public String toString() {
		return "FoodTruck Name = " + name + ", Type of Food = " + type + ", Rating = " + rating + ", id = " + id + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public double getRating() {
		return rating;
	}
	
}
