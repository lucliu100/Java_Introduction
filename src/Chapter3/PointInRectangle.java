package Chapter3;

import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        System.out.println("Enter a point with two coordinates: ");
        Scanner input = new Scanner(System.in);
        int x_coord = input.nextInt();
        int y_coord = input.nextInt();

        if ((Math.abs(x_coord) <= 10/2) && (Math.abs(y_coord) <= 5.0/2)) {
            System.out.println("Point (" + x_coord + " , " + y_coord + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x_coord + " , " + y_coord + ") is not in the rectangle");
        }
    }
}
