package com.gla.interfacesabstraction.ImplementingInterfaces.vehiclerental;


public class Bike implements RentalService {

    @Override
    public void rent() {
        System.out.println("Bike rented successfully.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike returned successfully.");
    }
}package com.gla.interfacesabstraction.ImplementingInterfaces.vehiclerental;



public class Bus implements RentalService {

    @Override
    public void rent() {
        System.out.println("Bus rented successfully.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus returned successfully.");
    }
}