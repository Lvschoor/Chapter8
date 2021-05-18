package be.intecbrussel;

import static be.intecbrussel.Circle.getCounter;

public class CircleApp {

    public static void main(String[] args) {
        System.out.println("This program uses a circle");

        Circle circ1 = new Circle(5);
        Circle circ2 = new Circle(10,50,60);

        circ1.printPropertiesOfCircle();
        circ2.printPropertiesOfCircle();

        System.out.println("Amount of angles of the class Circle: " + Circle.ANGLES);
        System.out.println("Amount of created circles: " + Circle.getCounter());


    }
}
