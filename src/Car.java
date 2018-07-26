//Create a class called Car. The Car class should inherit from the Vehicle class. Car should contain the following:
//
//        private member variables
//        a default constructor
//        an overloaded constructor
//        methods which return a string indicating each task the car is performing.

public class Car extends Vehicle {
//PRIVATE MEMBER VARIABLES
    private String model;
    private String make;



//GETTERS AND SETTERS
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    //OVERRIDES
    @Override
    public String start() {
        return "The " + super.getColor() + " " + make + " " + model + " is starting.";
    }

    @Override
    public String accelerate() {
        return "The " + super.getColor() + " " + make + " " + model + " is accelerating.";
    }

    @Override
    public String rate() {
        return "The " + super.getColor() + " " + make + " " + model + " is going " + super.getSpeed() + " mph.";
    }

    @Override
    public String stop() {
        return "The " + super.getColor() + " " + make + " " + model + " is stopped.";
    }


}
