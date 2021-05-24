package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {
 
	public static void main(String[] args) {
		
		FoodTruckApp foodTruckApp = new FoodTruckApp();
		
		FoodTruck[] foodTrucks = new FoodTruck[5];
		for (int i = 0; i < foodTrucks.length; i++) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the food truck's name: ");
			String truckName = input.nextLine();
			
			if(truckName.equalsIgnoreCase("quit")) {
				foodTruckApp.menu(foodTrucks);
			}
			System.out.print("Enter the type of food served: ");
			String foodType = input.nextLine();
			
			System.out.print("Enter the food truck's rating: ");
			int rating = input.nextInt();
			
			int truckId = foodTrucks[i].getTruckId(i);
			
			foodTrucks[i] = new FoodTruck(truckName, foodType, rating, truckId);
			
		}
	}
	
	public void menu(FoodTruck[] foodTrucks) {
		//add switches and methods for menu options
		Scanner input = new Scanner(System.in);
		System.out.println("\t Menu");
		System.out.println("1. List Food Trucks");
		System.out.println("2. Calculate Average Food Truck Rating");
		System.out.println("3. Display Food Truck with Highest Rating");
		System.out.println("4. Quit");
	}
	public void listFoodTrucks(FoodTruck[] foodTrucks) {
		for(int i=0; i<foodTrucks.length; i++) {
			foodTrucks[i].displayTruck();
		}
		
	}
}			
