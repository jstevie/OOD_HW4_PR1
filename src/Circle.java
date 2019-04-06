//Circle.java: The original circle class that extends GeometricObject
class Circle extends GeometricObject {
    protected double radius;

    // Default constructor
    public Circle() {
        this(1.0, "white", true);
    }

    // Construct circle with specified radius
    public Circle(double radius) {
        super("white", true);
        this.radius = radius;
    }

    // Construct a circle with specified radius, fill, and color
    public Circle(double radius, String color, boolean fill) {
        super(color, fill);
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement the findArea method defined in GeometricObject
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Implement the findPerimeter method defined in GeometricObject
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Override the equals() method defined in the Object class
    public boolean equals(Circle circle) {
        return this.radius == circle.getRadius();
    }

    // Override the toString() method defined in the Object class
    public String toString() {
        return "[Circle] radius = " + radius;
    }

    //
}