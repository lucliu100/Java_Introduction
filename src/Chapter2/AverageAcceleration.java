package Chapter2;

import java.util.Scanner;

public class AverageAcceleration {
    public static void main(String[] args){
        System.out.println("Enter v0: ");
        Scanner input = new Scanner(System.in);
        double v0 = input.nextDouble();
        System.out.println("Enter v1: ");
        Scanner newInput = new Scanner(System.in);
        double v1 = input.nextDouble();
        System.out.println("Enter t: ");
        Scanner anotherInput = new Scanner (System.in);
        double t = input.nextDouble();
        double A = (v1 - v0)/t;
        System.out.println("The average acceleration is " + A);

    }
}
