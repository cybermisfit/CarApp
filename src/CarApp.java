//        Create another class called CarApp which contains the main method. In the main method create an instance of a Car.
//
//        Then print the output of the different methods as the car object is "operated".
//
//        Your output should look something like this:
//
//        The red Porsche is starting
//        The red Porsche is accelerating
//        The red Porsche is going 50 mph
//        The red Porsche is stopped
//
//        Be creative and make up your own methods if you like.
//
//        Create a second instance of the car once your first car is working. Set its private member variables in the main
//        method. Now you can call the methods of the second car in between the calls to the methods of the first car. Your
//        program will keep the two separate. Here's an example. Your mileage may vary.
//
//        The red Porsche is starting
//        The blue Jetta is starting
//        The red Porsche is accelerating
//        The blue Jetta is accelerating
//        The blue Jetta has stopped to have its emissions checked
//        The blue Jetta passes its emission test
//        The red Porsche is going 50 mph
//        The red Porsche is stopped
//        The blue Jetta just passed the red Porsche

public class CarApp {

    public static void main(String[] args){

        Car car01 = new Car();
        car01.setMake("Tesla");
        car01.setModel("Roadster");
        car01.setColor("red");
        car01.setSpeed(75);

        printout(car01.start());
        printout(car01.accelerate());
        printout(car01.rate());
        printout(car01.stop());

        printout("\n");

        Car car02 = new Car();
        car02.setMake("Honda");
        car02.setModel("Civic");
        car02.setColor("orange");
        car02.setSpeed(50);

        printout(car01.start());
        printout(car02.start());
        printout(car01.accelerate());
        printout(car02.accelerate());
        printout(car01.rate());
        printout(car02.rate());
        printout(car01.stop());
        printout(car02.stop());
    }

    public static void printout(String output){
        System.out.println(output);
    }
}
