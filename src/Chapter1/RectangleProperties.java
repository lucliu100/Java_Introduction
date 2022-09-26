package Chapter1;

import java.util.Scanner;

public class RectangleProperties {
    public static void main(String[] args) {
        System.out.println("Width? ");
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        System.out.println("Height? ");
        Scanner newInput = new Scanner(System.in);
        double height = input.nextDouble();
        double area = width * height;
        System.out.println("Area: " + area);
    }
}

