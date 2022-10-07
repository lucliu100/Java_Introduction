package Chapter4;

import java.util.Scanner;

public class RegularPolygonArea {
    public static void main(String[] args) {
        System.out.println("Enter the number of sides: ");
        Scanner input = new Scanner(System.in);
        double sides = input.nextDouble();
        System.out.println("Enter the side: ");
        double side = input.nextDouble();
        double area = (sides * (side * side)) / (4 * (Math.tan(Math.PI/4)));
        System.out.println("The area of the polygon is: " + area);
    }
}
