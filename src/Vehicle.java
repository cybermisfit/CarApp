
//
//        For example, the accelerate method will return a string that says "The car is accelerating" and the setSpeed(90)
//        method will return a string that says "The Speed is 90 mph". The application will also contain getters and setters
//        for each private member variable.
//


public class Vehicle {

//PRIVATE MEMBER VARIABLES
private int speed;
private String color;

//GETTERS AND SETTERS
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Vehicle() {
    System.out.println("A new vehicle is created..."); }

//ADDITIONAL METHODS

    public String start() {
        return "The " + color + " vehicle is starting."; }

    public String accelerate() {
        return "The " + color + " vehicle is accelerating."; }

    public String rate() {
        return "The " + color + " vehicle is going " + speed + " mph."; }

    public String stop() {
        return "The " + color + " vehicle is stopped."; }



}
