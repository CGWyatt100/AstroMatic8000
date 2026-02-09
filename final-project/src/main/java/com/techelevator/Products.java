package com.techelevator;

public class Products {

    //the following syntax adds properties to a class
    //key feature of encapsulation = access modifiers (private/public/protected)
    //values remain consistent and can only be changed through methods
    // that the class allows external resources to have access to
    protected String name;
    protected double price;
    protected int quantity;
    protected String slotCode;
    protected String provisionType;


    //a constructor is a special method of a class that initializes an object of that class
    public Products(String name, String slotCode, double price, String provisionType, int quantity) {
        this.name = name;
        this.slotCode = slotCode;
        this.price = price;
        this.provisionType = provisionType;
        this.quantity = quantity;
    }

    //add the getters for the name and price parameters, so that we can have access to them
    //outside of the class
    public String getName() {
        return name;
    }


    public String getSlotCode() {
        return slotCode;
    }


    public double getPrice() {
        return price;
    }


    public int getQuantity() {
        return quantity;
    }
    public String getProvisionType() {
        return provisionType;
    }


    public boolean decreaseQuantity() {
        if (quantity > 0) {
            quantity--;
            return true;
        }
        return false;
    }


    public boolean isSoldOut() {
        return quantity <= 0;
    }

    public void dispense() {
        decreaseQuantity();
    }

    public String getMessage() {
        String provision = provisionType.toLowerCase();
        if (provision.equals("drink")) {
            return "Glug Glug, Zero‑G Sip!";
        } else if (provision.equals("chip")) {
            return "Crunch Crunch, Out of this Galaxy!";
        } else if (provision.equals("candy")) {
            return "Munch Munch, Stellar!";
        } else if (provision.equals("gum")) {
            return "Chew Chew, Cosmic!";
        } else {
            return "Enjoy your item!";
        }


    }
}



