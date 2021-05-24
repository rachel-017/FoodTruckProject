package com.skilldistillery.app;

public class FoodTruck {
	
	private FoodTruck[] foodTrucks;

	private String nameOfTruck;
	private String foodType;
	private int rating;
	private static int truckId = 0;
	private int newId;

	public FoodTruck(String nameOfTruck, String foodType, int rating, int truckId) {
		this.nameOfTruck = nameOfTruck;
		this.foodType = foodType;
		this.rating = rating;
		FoodTruck.truckId = truckId;
	}

	public String getNameOfTruck() {
		return nameOfTruck;
	}

	public void setNameOfTruck(String nameOfTruck) {
		this.nameOfTruck = nameOfTruck;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getTruckId(int id) {
		return FoodTruck.truckId;
	}
	
	public void setTruckId(FoodTruck foodTruck) {
		foodTrucks[FoodTruck.truckId] = foodTruck;
		FoodTruck.truckId++;
		
	}
//		newTruckId = 0;
//		for(int i =0; i<newTruckId; i++) {
//			FoodTruck.truckId = newTruckId;
//		}
//	}

//		FoodTruck a = new FoodTruck(nameOfTruck, foodType, rating, truckId);
//		for (int i = 0; i < a.numOfTrucks; i++) {
//			int truckId = i;
//			truckId++;
//			FoodTruck.truckId = truckId;
//			return FoodTruck.truckId;
//		}
//	}

	@Override
	public String toString() {
		return "FoodTruck: " + nameOfTruck + " serves " + foodType + " and is rated " + rating
				+ ". "+nameOfTruck+"'s ID number is " + FoodTruck.truckId + ".";
	}

	public void displayTruck() {
		String truckInfo = this.toString();
		System.out.println(truckInfo);
	}
}
