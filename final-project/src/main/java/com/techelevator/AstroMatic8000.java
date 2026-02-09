package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.techelevator.GalacticBankNetwork.addCredit;
import static com.techelevator.GalacticBankNetwork.amount;



public class AstroMatic8000 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;



        while (running) {
            System.out.println("(1) View Supply Manifest");
            System.out.println("(2) Initiate Purchase");
            System.out.println("(3) Exit");
            System.out.print("Select an option: ");

            //read the user's input as a string and stores it in the choice variable
            String choice = scanner.nextLine();
            if ("1".equals(choice)) {
                viewManifest();

            } else if ("2".equals(choice)) {
                initiatePurchase(scanner);

            } else if ("3".equals(choice)) {
                System.out.println("Exiting.");
                running = false;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        }

    }private static void viewManifest() {
        //Create a File object representing supply_manifest.csv
        File supplyFile = new File("supply_manifest.csv");
        //open a scanner to open the file
        try (Scanner supplyReader = new Scanner(supplyFile)) {
            //now, loop through the file
            while (supplyReader.hasNextLine()) {
                //goes to the nextLine and stores it in the String supplyItem
                String supplyItem = supplyReader.nextLine();
                //prints the line to the console
                System.out.println(supplyItem);
            }
            //If the file doesn't exist, this will throw a FileNotFound exception
        } catch (FileNotFoundException e) {
            System.out.println("Error: supply_manifest.csv not found.");
        }
    }
    private static void initiatePurchase(Scanner scanner) {
        //two local variables boolean to indicate when the loop should stop and credits to represent the (CR)
        double credits = 0;


        boolean isInitiatingTransaction = true;

        //initializing a while loop to keep looping until the user is finished
        while (isInitiatingTransaction) {
            System.out.println("Current Credits Available:  " + amount);
            System.out.println("(1) Upload Credits");
            System.out.println("(2) Select Provision");
            System.out.println("(3) Complete Transaction");
            System.out.print("Choose an option: ");

            //read the user's input as a string and store it in the choice variable
            String choice = scanner.nextLine();

            if ("1".equals(choice)) {
                System.out.println("How many credits do you want to add: ");
                String input = scanner.nextLine();
                credits = Double.parseDouble(input);
                addCredit(credits);
                System.out.println("Uploaded " + credits + " CR. New balance: " + amount);

            } else if ("2".equals(choice)) {
                //call the viewManifest() method so that you can display the options before making your choice
                viewManifest();
                System.out.println("Please enter the slot code of your choice: ");

            } else if ("3".equals(choice)) {

                // when the boolean is false, it exits
                isInitiatingTransaction = false;
            } else {
                System.out.println("Invalid choice. Please try again.");

            }
        }

    }


}
