package Chapter2;

import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
            System.out.println("Enter airplane acceleration: ");
            Scanner input = new Scanner(System.in);
            double A = input.nextDouble();
            System.out.println("Enter take-off speed: ");
            Scanner newInput = new Scanner(System.in);
            double v = input.nextDouble();
            double length = (Math.pow(v, 2))/(2 * A);
            System.out.printf("The minimum runway length for this airplane is %.3f %n", length);
    }
}
