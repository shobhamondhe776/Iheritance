package Demon;

public class Vehicle {
	    String color;
	    String make;
	    String model;
	    int year;

	    public Vehicle(String color, String make, String model, int year) {
	        this.color = color;
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	    public void displayInfo() {
	        System.out.println("Color: " + color);
	        System.out.println("Make: " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }
	}

	// Car class - subclass of Vehicle
	class Car extends Vehicle {
	    int numDoors;
	    String transmissionType;

	    public Car(String color, String make, String model, int year, int numDoors, String transmissionType) {
	        super(color, make, model, year);
	        this.numDoors = numDoors;
	        this.transmissionType = transmissionType;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Number of Doors: " + numDoors);
	        System.out.println("Transmission Type: " + transmissionType);
	    }
	}

	// Truck class - subclass of Vehicle
	class Truck extends Vehicle {
	    double bedSize;
	    double towingCapacity;

	    public Truck(String color, String make, String model, int year, double bedSize, double towingCapacity) {
	        super(color, make, model, year);
	        this.bedSize = bedSize;
	        this.towingCapacity = towingCapacity;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Bed Size: " + bedSize);
	        System.out.println("Towing Capacity: " + towingCapacity);
	    }
	}

	// ElectricCar class - subclass of Car
	class ElectricCar extends Car {
	    double batteryCapacity;
	    double range;

	    public ElectricCar(String color, String make, String model, int year, int numDoors, String transmissionType, double batteryCapacity, double range) {
	        super(color, make, model, year, numDoors, transmissionType);
	        this.batteryCapacity = batteryCapacity;
	        this.range = range;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Battery Capacity: " + batteryCapacity);
	        System.out.println("Range: " + range);
	    }
	}

	// GasolineCar class - subclass of Car
	class GasolineCar extends Car {
	    double fuelCapacity;
	    double mpg;

	    public GasolineCar(String color, String make, String model, int year, int numDoors, String transmissionType, double fuelCapacity, double mpg) {
	        super(color, make, model, year, numDoors, transmissionType);
	        this.fuelCapacity = fuelCapacity;
	        this.mpg = mpg;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Fuel Capacity: " + fuelCapacity);
	        System.out.println("Miles Per Gallon: " + mpg);
	    }
	}

	 class Main  {
	    public static void main(String[] args) {
	        Vehicle vehicle = new Vehicle("Red", "Toyota", "Camry", 2022);
	        vehicle.displayInfo();

	        System.out.println("\n");

	        Car car = new Car("Blue", "Honda", "Civic", 2024, 4, "Automatic");
	        car.displayInfo();

	        System.out.println("\n");

	        Truck truck = new Truck("Black", "Ford", "F-150", 2022, 6.5, 10000);
	        truck.displayInfo();

	        System.out.println("\n");

	        ElectricCar electricCar = new ElectricCar("Silver", "Tesla", "Model S", 2024, 4, "Automatic", 100, 300);
	        electricCar.displayInfo();

	        System.out.println("\n");

	        GasolineCar gasolineCar = new GasolineCar("White", "Chevrolet", "Malibu", 2023, 4, "Automatic", 15, 25);
	        gasolineCar.displayInfo();
	    }
	}

	

