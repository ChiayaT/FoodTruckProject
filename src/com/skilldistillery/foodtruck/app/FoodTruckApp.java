package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private FoodTruck[] fleetOfFoodTrucks;

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.launch();
	}

	public void launch() {
		Scanner sc = new Scanner(System.in);
		String name;
		String type;
		double rating;
		String choiceMenu;
		
		// Now I can invoke non-static methods in here
		
		FoodTruck[] fleetOfFoodTrucks = new FoodTruck[6];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Please input the name of the FoodTruck ");
			name = sc.nextLine();
			if (name.equals("quit")){
				break;
			}
			
			System.out.print("Please input the type of food they serve ");
			type = sc.nextLine();
			
			while(true) {
				System.out.print("Please enter the current rating of the Truck from 0 - 5 ");
				rating = sc.nextDouble();
				sc.nextLine();
				if (rating >= 0 && rating <= 5) {
					break;
				}
				else {
					System.out.println("Please enter a valid rating.");
				}
				
			}
			
			
			fleetOfFoodTrucks[i] = new FoodTruck(name, type, rating);
			System.out.println();
			
		}
		while (true) {
			System.out.println("Please select an option on the menu");
			menu();
			choiceMenu = sc.nextLine();
			switch (choiceMenu) {
				case "1":
				case "List":
				case "all":
				case "List all existing food trucks":
					existing(fleetOfFoodTrucks);
					continue;
				case "2":
				case "average":
				case "See the average rating":
				case "average rating":
				case "Average":
					average(fleetOfFoodTrucks);
					continue;
				case "3":
				case "high":
				case "highest":
				case "highest rating":
				case "See the highest rating":
					highestRating(fleetOfFoodTrucks);
					continue;
				case "4":
				case "quit":
				case "Quit":
					System.out.println("Thank You for using the FoodTruckApp, Goodbye!");
					break;
				default:
					System.out.println("Please enter a valid option 1-4");
					continue;
			
			}
			break;
		}
		

		
		
		sc.close();
	}
	
	public void menu() {
		System.out.println();
		System.out.println("************************************");
		System.out.println("*Please pick an option 1 - 4       *");
		System.out.println("*1. List all existing food trucks  *");
		System.out.println("*2. See the average rating         *");
		System.out.println("*3. See the highest rating truck   *");
		System.out.println("*4. quit                           *");
		System.out.println("************************************");
		System.out.println();
			
			}
		
	
	
	public void existing(FoodTruck[] truck) {
		for( int i = 0 ; i < 5 ; i++) {
			if (truck[i] == null) {
				if (i == 0) {
					System.out.println("There are no Food trucks");
				}
				break;
			}
			System.out.println(truck[i]);
			}
				
			}
	
		
	
	
	public void average(FoodTruck[] truck) {
		double avg = 0;
		for( int i = 0 ; i < 6 ; i++) {
			if (truck[i] == null ) {
				if (i == 0) {
					System.out.println("There are no Food trucks");
					break;
				}
				else {
					avg = avg / i;
					System.out.println("The average rating for all " + (i) + " truck(s) is " + avg);
					break;
				}
			}
			avg += truck[i].getRating();
			
			}
		
	}
	
	public void highestRating(FoodTruck[] truck) {
		double highest = 0;
		int h = 0;
		for (int i = 0; i < 6 ; i++) {
			if (truck[i] == null) {	
				if (i == 0) {
					System.out.println("There are no Food trucks");
					break;
				}
				else{
					System.out.println("The highest rate food truck: " + truck[h]);
					break;
				}
		
			}
			if (truck[i].getRating() > highest) {
				highest = truck[i].getRating();
				h = i;
			}
		}
		
	}
	
	
	}

