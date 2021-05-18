package be.intecbrussel;

import static be.intecbrussel.Rectangle.getCounter;

public class RectangleApp {

    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        int grow = 5;

        //This was part of earlier tasks
/*
        rect1.height= 10;
        rect1.width=12;
        rect1.x=100;
        rect1.y=110;
        System.out.println("The properties of rect1:");
        System.out.println("Height: " + rect1.height);
        System.out.println("Width: " + rect1.width);
        System.out.println("X: " + rect1.x);
        System.out.println("Y: " + rect1.y);
*/
        //This was also part of previous tasks
/*
        rect2.height= 5;
        rect2.width=7;
        rect2.x=200;
        rect2.y=250;
        System.out.println("The properties of rect2:");
        System.out.println("Height: " + rect2.height);
        System.out.println("Width: " + rect2.width);
        System.out.println("X: " + rect2.x);
        System.out.println("Y: " + rect2.y);
*/
        //set values for rect1
        rect1.setHeight(10);
        rect1.setWidth(12);
        rect1.setX(100);
        rect1.setY(110);

        //print area and perimeter and position for rect1
        rect1.printPropertiesOfRectangle();


        //increase width and height by value of grow
        rect1.grow(grow);

        //print new values for increased size of rectangle
        System.out.println("We increase the height and width with the value " + grow + ".");
        System.out.println("The new area of this rectangle: " + rect1.getArea());
        System.out.println("The new perimeter: " + rect1.getPerimeter());

        //set values for rect2
        rect2.setHeight(5);
        rect2.setWidth(7);
        rect2.setPosition(100, 120);

        //print area and perimeter and position for rect2
        rect2.printPropertiesOfRectangle();

        //increase width and height by value of grow
        rect2.grow(grow);

        //print new values for increased size of rectangle
        System.out.println("We increase the height and width with the value " + grow + ".");
        System.out.println("The new area of this rectangle: " + rect2.getArea());
        System.out.println("The new perimeter: " + rect2.getPerimeter());

        //create a new rectangles (rect3 and rect4) by using the constructor with 2 and 4 parameters
        Rectangle rect3 = new Rectangle(10, 15);
        Rectangle rect4 = new Rectangle(12, 16, 80, 200);

        //print area and perimeter and position for rect3; it does not get an x and y value -> default value O will be used
        rect3.printPropertiesOfRectangle();

        //print area and perimeter and position for rect4
        rect4.printPropertiesOfRectangle();

        //create a rectangle (rect5) based on rect 4
        Rectangle rect5 = new Rectangle(rect4);

        //print area and perimeter and position for rect5
        rect5.printPropertiesOfRectangle();

        //print a static variable from Rectangle class
        System.out.println("Amount of angles of the class Rectangle: " + Rectangle.ANGLES);

        //print created rectangles using static import
        System.out.println("Amount of created rectangles: " + getCounter());
    }
}
