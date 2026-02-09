package com.techelevator;

public class GalacticBankNetwork {

    static double balance;
    public static double amount;

    //static so that it does not just belong to one object. It's shared across the class.
    //only one instance exists of it taking up a single memory allocation.


    //the constructor
    public GalacticBankNetwork() {
        this.balance = balance;
        this.amount = amount;


    }
    //getters
    public static double getBalance() {
        return balance;
    }
    public double getAmount() {
        return amount;
    }

    public static double addCredit(double newAmount) {

        //the conditional statement verifies the userInput is valid
        if(amount < 0) {
            System.out.println("Invalid credit amount. Please enter a whole number.");
            //If it is valid, the amount entered by the user is added to the current
            // total
        }else {
            amount += newAmount;
        }
        //the total amount is returned
        return amount;
    }
    //static so that I can use it elsewhere;
    public static boolean spendCredit(double cost) {
        if(cost <= 0) {
            System.out.println("Invalid cost.");
            return false;
        }
        if(cost > balance) {
            System.out.println("Insufficient funds. Please add more credits.");
            return false;
        }else {
            balance -= cost;
            System.out.println("You spent " + cost + ".");
            System.out.println("Your remaining credits are: " + balance);
            return true;
        }

    }
    public boolean returnChange() {
        double change = balance;
        balance = 0.0;
        System.out.println("Returning " + balance + " in change.");
        return true;
    }

}




















