package be.pxl.ja.exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PetGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create a new pet with initial energy
        Pet pet = new Pet(50);
        boolean gameRunning = true;

        System.out.println("Welcome to the Virtual Pet Care Game!");
        System.out.println("Take care of your pet by feeding and playing with it!");

        // Create game loop
        while(gameRunning) {
            System.out.println("\nYour pet's current energy:" + pet.getEnergy());
            System.out.println("What would you like to do?");
            System.out.println("1. Feed the pet");
            System.out.println("2. Play with the pet");
            System.out.println("3. Exit game");

            int choice = scanner.nextInt();
            scanner.nextLine();
            // Use switch to handle the player's choice
            switch (choice) {
                case 1:
                    System.out.println("Food?");
                    String food = scanner.nextLine();
                    try {
                        pet.feed(food);
                    }
                    catch (WrongFoodException e)  {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        pet.play();
                    } catch (PetTiredException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Thank you for playing the Virtual Pet Care Game!");
                    gameRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
            System.out.println(pet);
        }
        scanner.close();
    }
}
