package Chapter3;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write the 3 edges for a triangle: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();
        if (edge1 + edge2 > edge3 &&  edge2 + edge3 > edge1 && edge1 + edge3 > edge2) {
            System.out.println(edge1 + edge2 + edge3);
        } else {
            System.out.println("Input is invalid");
        }

    }

}
