package com.Inheritance;

public class Vehicle {
    protected String brand = "Lamborghini";        // Vehicle attribute

    public void honk() {                    // Vehicle method
        System.out.println("Wooz, Wooz!");
    }
}

class Car extends Vehicle {
    private String modelName = "Reventon";    // Car attribute

    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}




