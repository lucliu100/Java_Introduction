package Chapter3;

import java.util.Scanner;

public class PointInCircle {
    public static void main(String[] args) {
        System.out.println("Enter a point with two coordinates: ");
        Scanner input = new Scanner(System.in);
        int x_coord = input.nextInt();
        int y_coord = input.nextInt();

        double formula = Math.sqrt((x_coord * x_coord) + (y_coord * y_coord));
        if (formula <= 10) {
            System.out.println("Point (" + x_coord + " , " + y_coord + ") is in the circle");
        } else {
            System.out.println("Point (" + x_coord + " , " + y_coord + ") is not in the circle");
        }

    }
}
