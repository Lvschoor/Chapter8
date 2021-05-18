package be.intecbrussel;

public class Circle {

    //initially these variables where all public for the exercise;
    // default values 0 is ok except for the constant value of ANGLES.
    private int radius;
    private int x;
    private int y;
    public static final int ANGLES = 0;
    private static int counter;

    static {
        counter=0;
    }

    public Circle() {
        counter++;
    }
    public Circle(int radius) {
        this();
        setRadius(radius);
    }

    public Circle(int radius, int x, int y) {
        this(radius);
        setPosition(x, y);
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius<0?-radius:radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double getPerimeter() {
        return 2 * radius *Math.PI;
    }
    public double getArea() {

        return Math.PI * radius*radius;
    }
    public void printPropertiesOfCircle() {

        System.out.println("The area of the circle with radius " + getRadius() +": " + getArea());
        System.out.println("The perimeter for this circle: " + getPerimeter());
        System.out.println("The position of this circle (x,y): (" + getX() + "," + getY() + ")");
    }
    public static int getCounter(){
        return counter;
    }
}
