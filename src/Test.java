import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radiusInput;
        System.out.println("Enter the radius of circle #1:");
        radiusInput = input.nextDouble();
        Circle circle1 = new Circle(radiusInput);
        System.out.println("Enter the radius of circle #2:");
        radiusInput = input.nextDouble();
        Circle circle2 = new Circle(radiusInput);
        circle1.findAndPrintMax(circle2);
    }
}
