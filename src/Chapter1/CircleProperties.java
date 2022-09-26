package Chapter1;

import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        System.out.println("Radius? ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double perimeter = Math.PI * 2 * radius;
        double area = radius * radius * Math.PI;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
