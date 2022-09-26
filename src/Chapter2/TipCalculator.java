package Chapter2;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the subtotal: ");
        Scanner input = new Scanner(System.in);
        double subTotal = input.nextDouble();
        System.out.println("Enter the gratuity rate: ");
        Scanner newInput = new Scanner(System.in);
        double gratuityRate = input.nextDouble()/100;
        double gratuity = gratuityRate * subTotal;
        double total = subTotal + gratuity;
        System.out.printf("The gratuity is $%.2f %n and total is $%.2f %n", gratuity, total);
    }
}
