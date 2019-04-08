import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double radiusInput;
        System.out.println("Enter the radius of circle #1:");
        radiusInput = input.nextDouble();
        Circle circle1 = new Circle(radiusInput);
        System.out.println("Enter the radius of circle #2:");
        radiusInput = input.nextDouble();
        Circle circle2 = new Circle(radiusInput);
        findAndPrintMax(circle1, circle2);
    }

    /**
     * Compares two Circles and prints radius/radii of max Circle(s)
     * @param circle1 1st Circle being compared
     * @param circle2  2nd Circle being compared
     * @return Returns Circle with greatest area, or null if equal radii
     */
    public static Circle findAndPrintMax(Circle circle1, Circle circle2) {
        Circle maxCircle = circle1.max(circle2);
        if (maxCircle != null) {
            System.out.println("The max circle's radius is " + maxCircle.getRadius());
            System.out.println(maxCircle.toString());
        }
        else {
            System.out.println("The circles's radii are " + circle1.getRadius());
            System.out.println(circle1.toString());
            System.out.println(circle2.toString());
        }
        return maxCircle;
    }
}
