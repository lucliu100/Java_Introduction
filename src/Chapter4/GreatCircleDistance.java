package Chapter4;

import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        System.out.println("Enter point 1 latitude in degrees: ");
        Scanner input = new Scanner(System.in);
        double x1 = Math.toRadians(input.nextDouble());
        System.out.println("Enter point 1 longitude in degrees: ");
        double y1 = Math.toRadians(input.nextDouble());
        System.out.println("Enter point 2 latitude in degrees: ");
        double x2 = Math.toRadians(input.nextDouble());
        System.out.println("Enter point 2 longitude in degrees: ");
        double y2 = Math.toRadians(input.nextDouble());
        double radius = 6371.01;
        double d = radius * Math.asin(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
        System.out.println("The distance between the two points is " + d + " km");
    }
}
