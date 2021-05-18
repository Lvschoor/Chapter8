package be.intecbrussel;

public class Rectangle {

    //initially these variables where all public for the exercise;
    // default values 0 is ok except for the constant value of ANGLES.
    private int height;
    private int width;
    private int x;
    private int y;
    public static final int ANGLES = 4;
    private static int counter;

    static {
        counter=0;
    }

    public Rectangle() {
        counter++;
    }

    public Rectangle(int width, int height) {
        this();
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(int width, int height, int x, int y) {
        this(width, height);
        setPosition(x, y);
    }

    public Rectangle(Rectangle r) {
        this();
        setHeight(r.height);
        setWidth(r.width);
        setX(r.x);
        setY(r.y);
    }

    public void setHeight(int height) {
        //check if height is positive, else change sign
        this.height = height < 0 ? -height : height;
    }

    public void setWidth(int width) {
        //check if width is positive, else change sign
        this.width = width < 0 ? -width : width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void grow(int d) {
        //check if d is a positive value, if negative, change sign
        width += d < 0 ? -d : d;
        height += d < 0 ? -d : d;
    }

    // Used double for this getter in line with the book (int-> double casting); int would also work
    public double getArea() {
        return height * width;
    }

    // Used double for this getter in line with the book (int-> double casting); int would also work
    public double getPerimeter() {
        return 2 * (height + width);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void printPropertiesOfRectangle() {

        System.out.println("The area of the rectangle with height " + getHeight() + " and width " + getWidth() + ": " + getArea());
        System.out.println("The perimeter for this rectangle: " + getPerimeter());
        System.out.println("The position of this rectangle (x,y): (" + getX() + "," + getY() + ")");
    }
    public static int getCounter(){
        return counter;
    }

}
