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

    /**
     * Compares two Circles and return Circle with greatest area
     * @param circle2  Circle being compared
     * @return Returns Circle with greatest area, or null if equal radii
     */
    public Circle max(Circle circle2){
        int compare = this.compareTo(circle2);
        if (compare > 0)
            return this;
        else if (compare == 0)
            return null;
        else
            return circle2;
    }

    /**
     * Compares two Circles and prints radius/radii of max Circle(s)
     * @param circle2  Circle being compared
     * @return Returns Circle with greatest area, or null if equal radii
     */
    public Circle findAndPrintMax(Circle circle2) {
        Circle maxCircle = this.max(circle2);
        if (maxCircle != null) {
            System.out.println("The max circle's radius is " + maxCircle.getRadius());
            System.out.println(maxCircle.toString());
        }
        else {
            System.out.println("The circles's radii are " + this.getRadius());
            System.out.println(this.toString());
            System.out.println(circle2.toString());
        }
        return maxCircle;
    }

}